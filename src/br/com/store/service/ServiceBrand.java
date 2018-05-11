package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOBrand;
import br.com.store.exception.BrandException;
import br.com.store.model.Brand;
import br.com.store.model.validator.ValidatorBrand;
import java.util.List;

public class ServiceBrand {

    private static final ServiceBrand INSTANCE = new ServiceBrand();

    private ServiceBrand() {
    }

    public static ServiceBrand getInstance() {
        return INSTANCE;
    }

    public void insert(Brand brand) throws BrandException, DataSourceException {
        ValidatorBrand.validate(brand);

        try {
            DAOBrand.insert(brand);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Brand> list() throws DataSourceException {
        List<Brand> list = null;
        try {
            list = DAOBrand.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(Brand brand) throws BrandException, DataSourceException {
        ValidatorBrand.validate(brand);
        try {
            DAOBrand.update(brand);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Brand> search(String name) throws BrandException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOBrand.list();
            } else {
                return DAOBrand.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public Brand get(Integer id) throws BrandException, DataSourceException {
        try {
            return DAOBrand.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws BrandException, DataSourceException {
        try {
            DAOBrand.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
