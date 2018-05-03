package br.com.store.service;

import br.com.store.db.dao.DAOUser;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.UserException;
import br.com.store.model.User;
import br.com.store.model.validator.ValidatorUser;
import java.sql.SQLException;

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
}
