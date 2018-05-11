package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOProduct;
import br.com.store.exception.ProductException;
import br.com.store.model.Product;
import br.com.store.model.validator.ValidatorProduct;
import java.util.List;

public class ServiceProduct {

    private static final ServiceProduct INSTANCE = new ServiceProduct();

    private ServiceProduct() {
    }

    public static ServiceProduct getInstance() {
        return INSTANCE;
    }

    public void insert(Product product) throws ProductException, DataSourceException {
        ValidatorProduct.validate(product);

        try {
            DAOProduct.insert(product);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public List<Product> list() throws DataSourceException {
        List<Product> list = null;
        try {
            list = DAOProduct.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(Product product) throws ProductException, DataSourceException {

        ValidatorProduct.validate(product);

        try {

            DAOProduct.update(product);
            return;
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Product> search(String name) throws ProductException, DataSourceException {
        try {

            if (name == null || "".equals(name)) {
                return DAOProduct.list();
            } else {
                return DAOProduct.search(name);
            }
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
    public Product get(Integer id) throws ProductException, DataSourceException {
        try {
            
            return DAOProduct.get(id);
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
