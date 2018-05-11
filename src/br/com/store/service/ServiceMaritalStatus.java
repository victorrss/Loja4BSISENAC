package br.com.store.service;

import br.com.store.db.dao.DAOMaritalStatus;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.MaritalStatusException;
import br.com.store.model.MaritalStatus;
import br.com.store.model.validator.ValidatorMaritalStatus;
import java.util.List;

public class ServiceMaritalStatus {

    private static final ServiceMaritalStatus INSTANCE = new ServiceMaritalStatus();

    private ServiceMaritalStatus() {
    }

    public static ServiceMaritalStatus getInstance() {
        return INSTANCE;
    }

    public void insert(MaritalStatus maritalStatus) throws MaritalStatusException, DataSourceException {
        ValidatorMaritalStatus.validate(maritalStatus);

        try {
            DAOMaritalStatus.insert(maritalStatus);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(MaritalStatus maritalStatus) throws MaritalStatusException, DataSourceException {
        ValidatorMaritalStatus.validate(maritalStatus);
        try {
            DAOMaritalStatus.update(maritalStatus);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws MaritalStatusException, DataSourceException {
        try {
            DAOMaritalStatus.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<MaritalStatus> list() throws DataSourceException {
        List<MaritalStatus> list = null;
        try {
            list = DAOMaritalStatus.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<MaritalStatus> search(String description) throws MaritalStatusException, DataSourceException {
        try {
            if (description == null || "".equals(description)) {
                return DAOMaritalStatus.list();
            } else {
                return DAOMaritalStatus.search(description);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public MaritalStatus get(Integer id) throws MaritalStatusException, DataSourceException {
        try {
            return DAOMaritalStatus.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
}
