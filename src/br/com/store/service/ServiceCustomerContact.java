package br.com.store.service;

import br.com.store.db.dao.DAOCustomerContact;
import br.com.store.exception.CustomerContactException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.CustomerContact;
import br.com.store.model.validator.ValidatorCustomerContact;
import java.util.ArrayList;
import java.util.List;

public class ServiceCustomerContact {

    private static final ServiceCustomerContact INSTANCE = new ServiceCustomerContact();

    private ServiceCustomerContact() {
    }

    public static ServiceCustomerContact getInstance() {
        return INSTANCE;
    }

    public void insert(CustomerContact documentType) throws CustomerContactException, DataSourceException {
        ValidatorCustomerContact.validate(documentType);

        try {
            DAOCustomerContact.insert(documentType);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(CustomerContact customerContact) throws CustomerContactException, DataSourceException {
        ValidatorCustomerContact.validate(customerContact);
        try {
            DAOCustomerContact.update(customerContact);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws CustomerContactException, DataSourceException {
        try {
            DAOCustomerContact.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<CustomerContact> list(Integer id) throws DataSourceException {
        List<CustomerContact> list = null;
        try {
            list = DAOCustomerContact.list(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<CustomerContact> search(String value) throws CustomerContactException, DataSourceException {
        try {
            if (value == null || "".equals(value)) {
                return new ArrayList<>();
            } else {
                return DAOCustomerContact.search(value);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public CustomerContact get(Integer id) throws CustomerContactException, DataSourceException {
        try {
            return DAOCustomerContact.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
