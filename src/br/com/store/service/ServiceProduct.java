package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOProduct;
import br.com.store.exception.ProductException;
import br.com.store.model.Product;
import br.com.store.model.validator.ValidatorProduct;

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

}
