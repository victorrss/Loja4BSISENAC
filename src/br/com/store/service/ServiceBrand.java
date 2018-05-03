package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOBrand;
import br.com.store.exception.BrandException;
import br.com.store.model.Brand;
import br.com.store.model.validator.ValidatorBrand;

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

}
