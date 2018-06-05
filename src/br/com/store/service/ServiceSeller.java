package br.com.store.service;

import br.com.store.db.dao.DAOSeller;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.SellerException;
import br.com.store.model.Seller;
import br.com.store.model.validator.ValidatorSeller;
import java.util.List;

public class ServiceSeller {
    
    private static final ServiceSeller INSTANCE = new ServiceSeller();

    private ServiceSeller() {
    }

    public static ServiceSeller getInstance() {
        return INSTANCE;
    }

    public void insert(Seller seller) throws SellerException, DataSourceException {
        ValidatorSeller.validate(seller);

        try {
            DAOSeller.insert(seller);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public List<Seller> list() throws DataSourceException {
        List<Seller> list = null;
        try {
            list = DAOSeller.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(Seller seller) throws SellerException, DataSourceException {

        ValidatorSeller.validate(seller);

        try {

            DAOSeller.update(seller);
            return;
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Seller> search(String name) throws DataSourceException {
        try {

            if (name == null || "".equals(name)) {
                return DAOSeller.list();
            } else {
                return DAOSeller.search(name);
            }
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public Seller get(Integer id) throws DataSourceException {
        try {

            return DAOSeller.get(id);
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws DataSourceException {
        try {
            DAOSeller.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
}
