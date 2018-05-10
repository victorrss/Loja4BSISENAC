package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOSubCategory;
import br.com.store.exception.SubcategoryException;
import br.com.store.model.SubCategory;
import br.com.store.model.validator.ValidatorSubcategory;
import java.util.List;

public class ServiceSubCategory {

    private static final ServiceSubCategory INSTANCE = new ServiceSubCategory();

    private ServiceSubCategory() {
    }

    public static ServiceSubCategory getInstance() {
        return INSTANCE;
    }

    public void insert(SubCategory subcategory) throws SubcategoryException, DataSourceException {
        ValidatorSubcategory.validate(subcategory);

        try {
            DAOSubCategory.insert(subcategory);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public List<SubCategory> list() throws DataSourceException {
        List<SubCategory> list = null;
        try {
            list = DAOSubCategory.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }
}
