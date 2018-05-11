package br.com.store.service;

import br.com.store.db.dao.DAOState;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.StateException;
import br.com.store.model.State;
import br.com.store.model.validator.ValidatorState;
import java.util.List;

public class ServiceState {
    
    private static final ServiceState INSTANCE = new ServiceState();

    private ServiceState() {
    }

    public static ServiceState getInstance() {
        return INSTANCE;
    }

    public void insert(State state) throws StateException, DataSourceException {
        ValidatorState.validate(state);

        try {
            DAOState.insert(state);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(State state) throws StateException, DataSourceException {
        ValidatorState.validate(state);
        try {
            DAOState.update(state);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws StateException, DataSourceException {
        try {
            DAOState.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<State> list() throws DataSourceException {
        List<State> list = null;
        try {
            list = DAOState.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<State> search(String name) throws StateException, DataSourceException {
        try {
            if (name == null || "".equals(name)) {
                return DAOState.list();
            } else {
                return DAOState.search(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public State get(Integer id) throws StateException, DataSourceException {
        try {
            return DAOState.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
}
