package br.com.store.service;

import br.com.store.db.dao.DAOPublicPlaceType;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.PublicPlaceTypeException;
import br.com.store.model.PublicPlaceType;
import br.com.store.model.validator.ValidatorPublicPlaceType;
import java.util.List;

public class ServicePublicPlaceType {
    
        private static final ServicePublicPlaceType INSTANCE = new ServicePublicPlaceType();

    private ServicePublicPlaceType() {
    }

    public static ServicePublicPlaceType getInstance() {
        return INSTANCE;
    }

    public void insert(PublicPlaceType publicPlaceType) throws PublicPlaceTypeException, DataSourceException {
        ValidatorPublicPlaceType.validate(publicPlaceType);

        try {
            DAOPublicPlaceType.insert(publicPlaceType);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(PublicPlaceType publicPlaceType) throws PublicPlaceTypeException, DataSourceException {
        ValidatorPublicPlaceType.validate(publicPlaceType);
        try {
            DAOPublicPlaceType.update(publicPlaceType);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws PublicPlaceTypeException, DataSourceException {
        try {
            DAOPublicPlaceType.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<PublicPlaceType> list() throws DataSourceException {
        List<PublicPlaceType> list = null;
        try {
            list = DAOPublicPlaceType.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<PublicPlaceType> search(String name) throws PublicPlaceTypeException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOPublicPlaceType.list();
            } else {
                return DAOPublicPlaceType.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public PublicPlaceType get(Integer id) throws PublicPlaceTypeException, DataSourceException {
        try {
            return DAOPublicPlaceType.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
}
