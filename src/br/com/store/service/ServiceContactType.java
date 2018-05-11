package br.com.store.service;

import br.com.store.db.dao.DAOContactType;
import br.com.store.exception.ContactTypeException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.ContactType;
import br.com.store.model.validator.ValidatorContactType;
import java.util.List;

public class ServiceContactType {

    private static final ServiceContactType INSTANCE = new ServiceContactType();

    private ServiceContactType() {
    }

    public static ServiceContactType getInstance() {
        return INSTANCE;
    }

    public void insert(ContactType contactType) throws ContactTypeException, DataSourceException {
        ValidatorContactType.validate(contactType);

        try {
            DAOContactType.insert(contactType);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(ContactType contactType) throws ContactTypeException, DataSourceException {
        ValidatorContactType.validate(contactType);
        try {
            DAOContactType.update(contactType);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws ContactTypeException, DataSourceException {
        try {
            DAOContactType.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<ContactType> list() throws DataSourceException {
        List<ContactType> list = null;
        try {
            list = DAOContactType.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<ContactType> search(String description) throws ContactTypeException, DataSourceException {
        try {
            if (description == null || "".equals(description)) {
                return DAOContactType.list();
            } else {
                return DAOContactType.search(description);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public ContactType get(Integer id) throws ContactTypeException, DataSourceException {
        try {
            return DAOContactType.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
