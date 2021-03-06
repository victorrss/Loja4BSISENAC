package br.com.store.service;

import br.com.store.exception.DataSourceException;
import br.com.store.db.dao.DAOCategory;
import br.com.store.exception.CategoryException;
import br.com.store.model.Category;
import br.com.store.model.validator.ValidatorCategory;
import java.util.List;

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

    public List<Category> list() throws DataSourceException {
        List<Category> list = null;
        try {
            list = DAOCategory.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(Category category) throws CategoryException, DataSourceException {
        ValidatorCategory.validate(category);
        try {
            DAOCategory.update(category);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Category> search(String name) throws CategoryException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOCategory.list();
            } else {
                return DAOCategory.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public Category get(Integer id) throws CategoryException, DataSourceException {
        try {
            return DAOCategory.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws CategoryException, DataSourceException {
        try {
            DAOCategory.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
