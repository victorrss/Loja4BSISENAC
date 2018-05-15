package br.com.store.service;

import br.com.store.db.dao.DAOCustomer;
import br.com.store.exception.CustomerException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.Customer;
import br.com.store.model.enums.CustomerSearchTypeEnum;
import br.com.store.model.validator.ValidatorCustomer;
import java.util.List;

public class ServiceCustomer {

    private static final ServiceCustomer INSTANCE = new ServiceCustomer();

    private ServiceCustomer() {
    }

    public static ServiceCustomer getInstance() {
        return INSTANCE;
    }

    public void insert(Customer customer) throws CustomerException, DataSourceException {
        ValidatorCustomer.validate(customer);

        try {
            DAOCustomer.insert(customer);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(Customer customer) throws CustomerException, DataSourceException {
        ValidatorCustomer.validate(customer);
        try {
            DAOCustomer.update(customer);
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
