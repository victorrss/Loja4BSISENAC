package br.com.store.service;

import br.com.store.db.dao.DAOAddress;
import br.com.store.db.dao.DAOCustomer;
import br.com.store.db.dao.DAOCustomerContact;
import br.com.store.exception.AddressException;
import br.com.store.exception.CustomerContactException;
import br.com.store.exception.CustomerException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.Customer;
import br.com.store.model.enums.CustomerSearchTypeEnum;
import br.com.store.model.validator.ValidatorAddress;
import br.com.store.model.validator.ValidatorCustomer;
import br.com.store.model.validator.ValidatorCustomerContact;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceCustomer {

    private static final ServiceCustomer INSTANCE = new ServiceCustomer();

    private ServiceCustomer() {
    }

    public static ServiceCustomer getInstance() {
        return INSTANCE;
    }

    @SuppressWarnings("empty-statement")
    public void insert(Customer customer) throws CustomerException, DataSourceException, CustomerContactException, AddressException {
        Integer newIdAddress = null, newIdCustomer = null;
        ValidatorAddress.validate(customer.getAddress());
        ValidatorCustomer.validate(customer);
        ValidatorCustomerContact.validate(customer.getContacts());

        // insert address
        try {
            newIdAddress = DAOAddress.insert(customer.getAddress());
            if (newIdAddress == null) {
                throw new CustomerContactException("Falha ao gravar o Cliente: Não foi possível salvar o endereço");
            }
            customer.getAddress().setId(newIdAddress);
        } catch (Exception e) {
            throw new DataSourceException("Falha ao gravar o Cliente");
        }

        //Inserts the customer, takes the new Id, and then registers the contacts using the new Id
        if (newIdAddress != null) {
            try {
                newIdCustomer = DAOCustomer.insert(customer);
                if (newIdCustomer == null) {
                    throw new CustomerContactException("Falha ao gravar o Cliente: Não foi possível salvar os contatos");
                }
            } catch (Exception e) {
                try {
                    DAOAddress.delete(newIdAddress);
                } catch (Exception ex) {
                    Logger.getLogger(ServiceCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
                throw new DataSourceException("Falha ao gravar o Cliente");
            }
        }

        // insert contacts
        if (newIdCustomer != null) {
            try {
                DAOCustomerContact.insert(customer.getContacts(), newIdCustomer);
            } catch (Exception e) {
                try {
                    DAOAddress.delete(newIdAddress);
                    DAOCustomer.delete(newIdCustomer);
                } catch (Exception ex) {
                    Logger.getLogger(ServiceCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
                e.printStackTrace();
                throw new DataSourceException("Falha ao gravar o Cliente");
            }
        }

    }

    public void update(Customer customer) throws CustomerException, DataSourceException, AddressException, CustomerContactException {
        ValidatorAddress.validate(customer.getAddress());
        ValidatorCustomer.validate(customer);
        ValidatorCustomerContact.validate(customer.getContacts());

        // update address
        try {
            DAOAddress.update(customer.getAddress());
        } catch (Exception e) {
            throw new CustomerContactException(e.getMessage());
        }

        try {
            // deletes all client contacts and then inserts the current ones
            DAOCustomerContact.deleteAll(customer.getId());
            DAOCustomer.update(customer);
            DAOCustomerContact.insert(customer.getContacts(), customer.getId());
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
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
