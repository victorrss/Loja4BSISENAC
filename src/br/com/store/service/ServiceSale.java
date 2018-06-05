package br.com.store.service;

import br.com.store.db.dao.DAOSale;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.SaleException;
import br.com.store.model.Sale;
import br.com.store.model.validator.ValidatorSale;
import java.util.List;

public class ServiceSale {
    
    private static final ServiceSale INSTANCE = new ServiceSale();

    private ServiceSale() {
    }

    public static ServiceSale getInstance() {
        return INSTANCE;
    }

    public void insert(Sale sale) throws SaleException, DataSourceException {
        ValidatorSale.validate(sale);

        try {
            DAOSale.insert(sale);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public List<Sale> list() throws DataSourceException {
        List<Sale> list = null;
        try {
            list = DAOSale.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public void update(Sale sale) throws SaleException, DataSourceException {

        ValidatorSale.validate(sale);

        try {

            DAOSale.update(sale);
            return;
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<Sale> search(String id) throws DataSourceException {
        try {

            if (id == null || "".equals(id)) {
                return DAOSale.list();
            } else {
                return DAOSale.search(id);
            }
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public Sale get(Integer id) throws DataSourceException {
        try {

            return DAOSale.get(id);
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public void delete(Integer id) throws DataSourceException {
        try {
            DAOSale.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
}
