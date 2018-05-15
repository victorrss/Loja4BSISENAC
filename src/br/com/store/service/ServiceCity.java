package br.com.store.service;

import br.com.store.db.dao.DAOCity;
import br.com.store.exception.CityException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.City;
import br.com.store.model.validator.ValidatorCity;
import java.util.List;

public class ServiceCity {

    private static final ServiceCity INSTANCE = new ServiceCity();

    private ServiceCity() {
    }

    public static ServiceCity getInstance() {
        return INSTANCE;
    }

    public void insert(City city) throws CityException, DataSourceException {
        ValidatorCity.validate(city);

        try {
            DAOCity.insert(city);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(City city) throws CityException, DataSourceException {
        ValidatorCity.validate(city);
        try {
            DAOCity.update(city);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws CityException, DataSourceException {
        try {
            DAOCity.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<City> list() throws DataSourceException {
        List<City> list = null;
        try {
            list = DAOCity.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<City> list(Integer stateId) throws DataSourceException {
        List<City> list = null;
        try {
            list = DAOCity.list(stateId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<City> search(String name) throws CityException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOCity.list();
            } else {
                return DAOCity.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public City get(Integer id) throws CityException, DataSourceException {
        try {
            return DAOCity.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
