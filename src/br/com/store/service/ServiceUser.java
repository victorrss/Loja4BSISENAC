package br.com.store.service;

import br.com.store.db.dao.DAOUser;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.UserException;
import br.com.store.model.User;
import br.com.store.model.validator.ValidatorUser;
import java.sql.SQLException;
import java.util.List;

public class ServiceUser {

    private static final ServiceUser INSTANCE = new ServiceUser();

    private ServiceUser() {
    }

    public static ServiceUser getInstance() {
        return INSTANCE;
    }

    public void insert(User user) throws UserException, DataSourceException {
        ValidatorUser.validate(user);

        try {
            DAOUser.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<User> list() throws DataSourceException {
        List<User> list = null;
        try {
            list = DAOUser.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(User user) throws UserException, DataSourceException {
        ValidatorUser.validate(user);
        try {
            DAOUser.update(user);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<User> search(String name) throws UserException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOUser.list();
            } else {
                return DAOUser.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public User get(Integer id) throws UserException, DataSourceException {
        try {
            return DAOUser.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws UserException, DataSourceException {
        try {
            DAOUser.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
