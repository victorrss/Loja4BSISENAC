package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Product;
import br.com.store.model.Sale;
import br.com.store.model.SaleProduct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSaleProduct {

    //Inserts a Sale product into the sale_product table of the database
    public static void insert(Connection con, List<SaleProduct> saleProducts, Integer saleId) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "sale_product (sale_id, product_id, sequence, quantity, price, enabled) "
                + "VALUES (?,?,?,?,?,?)";

        PreparedStatement stmt = null;
        int i = 1;
        for (SaleProduct saleProduct : saleProducts) {
            try {
                //Creates a statement for SQL commands
                stmt = con.prepareStatement(sql);

                stmt.setInt(1, saleId);
                stmt.setInt(2, saleProduct.getProduct().getId());
                stmt.setInt(3, i);
                stmt.setInt(4, saleProduct.getQuantity());
                stmt.setFloat(5, saleProduct.getPrice());
                stmt.setBoolean(6, true);

                //executes the command in the DB
                stmt.execute();
            } finally {
                 ConnectionUtils.finalize(stmt);
            }
            i++;
        }

    }

    // Executes logical exclusion of all sale_products from a sale in the database
    public static void deleteAll(Connection con, Integer saleId) throws SQLException, Exception {

        String sql = "UPDATE sale_product SET enabled=? WHERE (sale_id=?)";

        PreparedStatement stmt = null;
        try {
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            //Configures the parameters of the "PreparedStatement"
            stmt.setBoolean(1, false);
            stmt.setInt(2, saleId);

            //executes the command in the DB
            stmt.execute();
        } finally {
        }
    }

    // List all sale_products from a sale
    public static List<SaleProduct> list(Integer saleId) throws SQLException, Exception {

        String sql = "SELECT * FROM sale_product "
                + "WHERE sale_id = ? AND (enabled=?)";

        List<SaleProduct> listSaleProduct = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, saleId);
            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listSaleProduct == null) {
                    listSaleProduct = new ArrayList<SaleProduct>();
                }

                SaleProduct saleProduct = new SaleProduct();

                saleProduct.setId(result.getInt("id"));
                Sale sale = DAOSale.get(result.getInt("sale_id"));
                saleProduct.setSale(sale);
                Product product = DAOProduct.get(result.getInt("product_id"));
                saleProduct.setProduct(product);
                saleProduct.setSequence(result.getInt("sequence"));
                saleProduct.setQuantity(result.getInt("quantity"));
                saleProduct.setPrice(result.getFloat("price"));

                // Add the instance in the list
                listSaleProduct.add(saleProduct);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSaleProduct;
    }

    //Search for a sale_product contact by id
    public static List<SaleProduct> search(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM sale_product WHERE id = ? AND enabled=?";

        List<SaleProduct> listSaleProduct = null;

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

                if (listSaleProduct == null) {
                    listSaleProduct = new ArrayList<SaleProduct>();
                }

                SaleProduct saleProduct = new SaleProduct();

                saleProduct.setId(result.getInt("id"));
                Sale sale = DAOSale.get(result.getInt("sale_id"));
                saleProduct.setSale(sale);
                Product product = DAOProduct.get(result.getInt("product_id"));
                saleProduct.setProduct(product);
                saleProduct.setSequence(result.getInt("sequence"));
                saleProduct.setQuantity(result.getInt("quantity"));
                saleProduct.setPrice(result.getFloat("price"));

                // Add the instance in the list
                listSaleProduct.add(saleProduct);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSaleProduct;
    }

    //Get an instance of the sale_product class by id
    public static SaleProduct get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM sale_product WHERE (id=? AND enabled=?)";

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

                SaleProduct saleProduct = new SaleProduct();

                saleProduct.setId(result.getInt("id"));
                Sale sale = DAOSale.get(result.getInt("sale_id"));
                saleProduct.setSale(sale);
                Product product = DAOProduct.get(result.getInt("product_id"));
                saleProduct.setProduct(product);
                saleProduct.setSequence(result.getInt("sequence"));
                saleProduct.setQuantity(result.getInt("quantity"));
                saleProduct.setPrice(result.getFloat("price"));

                return saleProduct;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }

}
