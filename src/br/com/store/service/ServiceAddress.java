package br.com.store.service;

import br.com.store.db.dao.DAOAddress;
import br.com.store.exception.AddressException;
import br.com.store.exception.DataSourceException;
import br.com.store.model.Address;
import br.com.store.model.validator.ValidatorAddress;
import java.util.List;

public class ServiceAddress {

    private static final ServiceAddress INSTANCE = new ServiceAddress();

    private ServiceAddress() {
    }

    public static ServiceAddress getInstance() {
        return INSTANCE;
    }

    public void insert(Address address) throws AddressException, DataSourceException {
        ValidatorAddress.validate(address);

        try {
            DAOAddress.insert(address);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void update(Address address) throws AddressException, DataSourceException {
        ValidatorAddress.validate(address);
        try {
            DAOAddress.update(address);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws AddressException, DataSourceException {
        try {
            DAOAddress.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Address> list() throws DataSourceException {
        List<Address> list = null;
        try {
            list = DAOAddress.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<Address> search(String publicPlace) throws AddressException, DataSourceException {
        try {
            if (publicPlace == null || "".equals(publicPlace)) {
                return DAOAddress.list();
            } else {
                return DAOAddress.search(publicPlace);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public Address get(Integer id) throws AddressException, DataSourceException {
        try {
            return DAOAddress.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

}
