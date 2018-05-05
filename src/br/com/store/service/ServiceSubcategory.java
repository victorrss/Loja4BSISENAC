package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOSubcategory;
import br.com.store.exception.SubcategoryException;
import br.com.store.model.SubCategory;
import br.com.store.model.validator.ValidatorSubcategory;

public class ServiceSubcategory {

    private static final ServiceSubcategory INSTANCE = new ServiceSubcategory();

    private ServiceSubcategory() {
    }

    public static ServiceSubcategory getInstance() {
        return INSTANCE;
    }

    public void insert(SubCategory subcategory) throws SubcategoryException, DataSourceException {
        ValidatorSubcategory.validate(subcategory);

        try {
            DAOSubcategory.insert(subcategory);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

}
