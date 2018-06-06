package br.com.store.service;

import br.com.store.db.dao.DAOSaleProduct;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.SaleProductException;
import br.com.store.model.SaleProduct;
import br.com.store.model.validator.ValidatorSaleProduct;
import java.sql.Connection;
import java.util.List;

public class ServiceSaleProduct {
    
    private static final ServiceSaleProduct INSTANCE = new ServiceSaleProduct();

    private ServiceSaleProduct() {
    }

    public static ServiceSaleProduct getInstance() {
        return INSTANCE;
    }

    public void insert(Connection con,  List<SaleProduct> saleProducts, Integer saleId) throws SaleProductException, DataSourceException {
        ValidatorSaleProduct.validate((SaleProduct) saleProducts); //need to be tested

        try {
            DAOSaleProduct.insert(con, saleProducts, saleId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }

    }

    public void deleteAll(Connection con, Integer saleId) throws SaleProductException, DataSourceException {
        try {
            DAOSaleProduct.deleteAll(con, saleId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public List<SaleProduct> list(Integer saleId) throws DataSourceException {
        List<SaleProduct> list = null;
        try {
            list = DAOSaleProduct.list(saleId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
        return list;
    }

    public List<SaleProduct> search(Integer id) throws SaleProductException, DataSourceException {
        try {
            if (id == null || "".equals(id)) {
                return DAOSaleProduct.list(id);
            } else {
                return DAOSaleProduct.search(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }

    public SaleProduct get(Integer id) throws SaleProductException, DataSourceException {
        try {
            return DAOSaleProduct.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados");
        }
    }
    
}
