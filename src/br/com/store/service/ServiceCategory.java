package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOCategory;
import br.com.store.exception.CategoryException;
import br.com.store.model.Category;
import br.com.store.model.validator.ValidatorCategory;

public class ServiceCategory {

    private static final ServiceCategory INSTANCE = new ServiceCategory();

    private ServiceCategory() {
    }

    public static ServiceCategory getInstance() {
        return INSTANCE;
    }

    public void insert(Category category) throws CategoryException, DataSourceException {
        ValidatorCategory.validate(category);

        try {
            DAOCategory.insert(category);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

}
