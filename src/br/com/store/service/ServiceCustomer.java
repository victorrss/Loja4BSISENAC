package br.com.store.service;

import br.com.store.db.dao.DAOAddress;
import br.com.store.db.dao.DAOCustomer;
import br.com.store.db.dao.DAOCustomerContact;
import br.com.store.db.util.ConnectionUtils;
import br.com.store.exception.AddressException;
import br.com.store.exception.CustomerContactException;
import br.com.store.exception.CustomerException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.Customer;
import br.com.store.model.enums.CustomerSearchTypeEnum;
import br.com.store.model.validator.ValidatorAddress;
import br.com.store.model.validator.ValidatorCustomer;
import br.com.store.model.validator.ValidatorCustomerContact;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ServiceCustomer {

    private static final ServiceCustomer INSTANCE = new ServiceCustomer();

    private ServiceCustomer() {
    }

    public static ServiceCustomer getInstance() {
        return INSTANCE;
    }

    public void insert(Customer customer) throws CustomerException, DataSourceException, CustomerContactException, AddressException, SQLException {
        Integer newIdAddress = null, newIdCustomer = null;
        ValidatorAddress.validate(customer.getAddress());
        ValidatorCustomer.validate(customer);
        ValidatorCustomerContact.validate(customer.getContacts());
        Connection con = null;

        try {
            con = ConnectionUtils.getConnection();
            con.setAutoCommit(false);

            // insert address
            newIdAddress = DAOAddress.insert(con, customer.getAddress());
            if (newIdAddress == null) {
                throw new CustomerContactException("Falha ao gravar o Cliente: Não foi possível salvar o endereço");
            }
            customer.getAddress().setId(newIdAddress);

            //Inserts the customer, takes the new Id, and then registers the contacts using the new Id
            newIdCustomer = DAOCustomer.insert(con, customer);
            if (newIdCustomer == null) {
                throw new CustomerContactException("Falha ao gravar o Cliente: Não foi possível salvar os contatos");
            }

            // insert contacts
            DAOCustomerContact.insert(con, customer.getContacts(), newIdCustomer);

            // commit transactions
            con.commit();
        } catch (Exception e) {
            con.rollback();
            throw new DataSourceException("Falha ao gravar o Cliente");
        } finally {
            ConnectionUtils.finalize(con);
        }

    }

    public void update(Customer customer) throws CustomerException, DataSourceException, AddressException, CustomerContactException, SQLException {
        ValidatorAddress.validate(customer.getAddress());
        ValidatorCustomer.validate(customer);
        ValidatorCustomerContact.validate(customer.getContacts());

        Connection con = null;

        try {
            con = ConnectionUtils.getConnection();
            con.setAutoCommit(false);
            // update address
            DAOAddress.update(con, customer.getAddress());

            // deletes all client contacts and then inserts the current ones
            DAOCustomerContact.deleteAll(con, customer.getId());
            DAOCustomer.update(con, customer);
            DAOCustomerContact.insert(con, customer.getContacts(), customer.getId());

            // commit transactions
            con.commit();
        } catch (Exception e) {
            con.rollback();
            throw new DataSourceException("Falha ao gravar o Cliente");
        } finally {
            ConnectionUtils.finalize(con);
        }

    }

    public void delete(Integer id) throws CustomerException, DataSourceException {
        try {
            DAOCustomer.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Customer> list() throws DataSourceException {
        List<Customer> list = null;
        try {
            list = DAOCustomer.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<Customer> search(String name) throws CustomerException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOCustomer.list();
            } else {
                return DAOCustomer.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Customer> search(CustomerSearchTypeEnum searchType, String name) throws CustomerException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOCustomer.list();
            } else {
                return DAOCustomer.search(searchType, name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public Customer get(Integer id) throws CustomerException, DataSourceException {
        try {
            return DAOCustomer.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
