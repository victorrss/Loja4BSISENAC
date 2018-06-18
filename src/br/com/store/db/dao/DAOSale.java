package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Customer;
import br.com.store.model.PaymentTerms;
import br.com.store.model.Sale;
import br.com.store.model.SaleListCancel;
import br.com.store.model.Seller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOSale {

    //Inserts a sale into the sale table of the database
    public static Integer insert(Connection con, Sale sale) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "sale (customer_id, seller_id, payment_terms_id, paid, discount, enabled) "
                + "VALUES (?,?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql, new String[]{"id"});
            stmt.setInt(1, sale.getCustomer().getId());
            stmt.setInt(2, sale.getSeller().getId());
            stmt.setInt(3, sale.getPaymentTerms().getId());
            stmt.setBoolean(4, true);
            stmt.setFloat(5, sale.getDiscount());
            stmt.setBoolean(6, true);

            //Executes the command in the DB
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return null;
        } finally {
            ConnectionUtils.finalize(stmt);
        }
    }

    //Performs the update of the data of a sale
    public static void update(Sale sale) throws SQLException, Exception {

        String sql = "UPDATE "
                + "sale SET customer_id=?, seller_id=?, payment_terms_id=?, paid=?, discount=?, created_at=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, sale.getCustomer().getId());
            stmt.setInt(2, sale.getSeller().getId());
            stmt.setInt(3, sale.getPaymentTerms().getId());
            stmt.setBoolean(4, true);
            stmt.setFloat(5, sale.getDiscount());
            stmt.setDate(6, new java.sql.Date(sale.getCreatedAt().getTime()));
            stmt.setInt(7, sale.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }

    }

    //Performs logical deletion of a sale in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        //String sql = "UPDATE sale SET enabled=? WHERE (id=?)";
        String sql = "{ call sp_saleCancel(?) }";
        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

//            stmt.setBoolean(1, false);
//            stmt.setInt(2, id);
            stmt.setInt(1, id);
            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //List all sales in the table sale
    public static List<Sale> list() throws SQLException, Exception {

        String sql = "SELECT * FROM sale WHERE (enabled=?)";

        List<Sale> listSale = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            stmt.setBoolean(1, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listSale == null) {
                    listSale = new ArrayList<Sale>();
                }

                Sale sale = new Sale();

                sale.setId(result.getInt("id"));
                sale.setProducts(DAOSaleProduct.list(sale.getId()));
                Customer customer = DAOCustomer.get(result.getInt("customer_id"));
                sale.setCustomer(customer);
                Seller seller = DAOSeller.get(result.getInt("seller_id"));
                sale.setSeller(seller);
                PaymentTerms paymentTerms = DAOPaymentTerms.get(result.getInt("payment_terms_id"));
                sale.setPaymentTerms(paymentTerms);
                sale.setPaid(result.getBoolean("paid"));
                sale.setDiscount(result.getFloat("discount"));
                Date ca = new Date(result.getDate("created_at").getTime());
                sale.setCreatedAt(ca);

                listSale.add(sale);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSale;
    }

    //List all sales in the table sale
    public static List<SaleListCancel> listCancel() throws SQLException, Exception {

        String sql = "SELECT "
                + "A.id as sale_id "
                + ", C.name "
                + ", SUM(B.price * B.quantity) - A.discount AS total "
                + ", A.created_at "
                + "FROM sale as A "
                + "INNER JOIN sale_product as B ON B.sale_id = A.id "
                + "INNER JOIN customer as C ON C.id = A.customer_id "
                + "WHERE (A.enabled=?) "
                + "group by A.id ";

        List<SaleListCancel> listSale = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            stmt.setBoolean(1, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listSale == null) {
                    listSale = new ArrayList<SaleListCancel>();
                }

                SaleListCancel sale = new SaleListCancel();

                sale.setSaleId(result.getInt("sale_id"));
                sale.setCustomerName(result.getString("name"));
                sale.setTotal(result.getFloat("total"));
                Date ca = new Date(result.getDate("created_at").getTime());
                sale.setCreatedAt(ca);

                listSale.add(sale);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSale;
    }

    //Search for a sale by id
    public static List<Sale> search(String id) throws SQLException, Exception {

        String sql = "SELECT * FROM sale WHERE (UPPER(id) LIKE UPPER(?) AND enabled=?)";

        List<Sale> listSale = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + id + "%");
            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listSale == null) {
                    listSale = new ArrayList<Sale>();
                }

                Sale sale = new Sale();

                sale.setId(result.getInt("id"));
                sale.setProducts(DAOSaleProduct.list(sale.getId()));
                Customer customer = DAOCustomer.get(result.getInt("customer_id"));
                sale.setCustomer(customer);
                Seller seller = DAOSeller.get(result.getInt("seller_id"));
                sale.setSeller(seller);
                PaymentTerms paymentTerms = DAOPaymentTerms.get(result.getInt("payment_terms_id"));
                sale.setPaymentTerms(paymentTerms);
                sale.setPaid(result.getBoolean("paid"));
                sale.setDiscount(result.getFloat("discount"));
                Date ca = new Date(result.getDate("created_at").getTime());
                sale.setCreatedAt(ca);

                listSale.add(sale);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSale;
    }

    //Get an instance of the sale class by id
    public static Sale get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM sale WHERE (id=? AND enabled=?)";

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            if (result.next()) {

                Sale sale = new Sale();

                sale.setId(result.getInt("id"));
                sale.setProducts(DAOSaleProduct.list(sale.getId()));
                Customer customer = DAOCustomer.get(result.getInt("customer_id"));
                sale.setCustomer(customer);
                Seller seller = DAOSeller.get(result.getInt("seller_id"));
                sale.setSeller(seller);
                PaymentTerms paymentTerms = DAOPaymentTerms.get(result.getInt("payment_terms_id"));
                sale.setPaymentTerms(paymentTerms);
                sale.setPaid(result.getBoolean("paid"));
                sale.setDiscount(result.getFloat("discount"));
                Date ca = new Date(result.getDate("created_at").getTime());
                sale.setCreatedAt(ca);

                return sale;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }

}
