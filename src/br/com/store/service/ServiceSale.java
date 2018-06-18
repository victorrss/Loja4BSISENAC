package br.com.store.service;

import br.com.store.db.dao.DAOSale;
import br.com.store.db.dao.DAOSaleProduct;
import br.com.store.db.util.ConnectionUtils;
import br.com.store.exception.DataSourceException;
import br.com.store.exception.SaleException;
import br.com.store.exception.SaleProductException;
import br.com.store.model.Sale;
import br.com.store.model.SaleListCancel;
import br.com.store.model.validator.ValidatorSale;
import br.com.store.model.validator.ValidatorSaleProduct;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ServiceSale {

    private static final ServiceSale INSTANCE = new ServiceSale();

    private ServiceSale() {
    }

    public static ServiceSale getInstance() {
        return INSTANCE;
    }

    public void insert(Sale sale) throws SaleException, DataSourceException, SaleProductException, SQLException {
        Integer newIdSale;
        ValidatorSale.validate(sale);
        ValidatorSaleProduct.validate(sale.getProducts());

        Connection con = null;

        try {
            con = ConnectionUtils.getConnection();
            con.setAutoCommit(false);

            newIdSale = DAOSale.insert(con, sale);
            if (newIdSale == null) {
                throw new SaleException("Falha ao gravar a venda: Não foi possível salvar o cabeçalho");
            }

            DAOSaleProduct.insert(con, sale.getProducts(), newIdSale);

            // commit transactions
            con.commit();
        } catch (Exception e) {
            con.rollback();
            throw new DataSourceException("Falha ao gravar a venda");
        } finally {
            ConnectionUtils.finalize(con);
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

    public List<SaleListCancel> listCancel() throws DataSourceException {
        List<SaleListCancel> list = null;
        try {
            list = DAOSale.listCancel();
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
