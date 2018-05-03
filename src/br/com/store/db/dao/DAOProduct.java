package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Brand;
import br.com.store.model.Category;
import br.com.store.model.Product;
import br.com.store.model.Subcategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOProduct {

    //Inserts a product into the product table of the database
    public static void insert(Product product) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "product (brand, category, subcategory, name, barcode, description, warranty, model, picture, enabled, stock, price) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setObject(1, product.getBrand());
            stmt.setObject(2, product.getCategory());
            stmt.setObject(3, product.getSubCategory());
            stmt.setString(4, product.getName());
            stmt.setString(5, product.getBarCode());
            stmt.setString(6, product.getDescription());
            stmt.setInt(7, product.getWarranty());
            stmt.setString(8, product.getModel());
            stmt.setBytes(9, product.getPicture());
            stmt.setBoolean(10, true);
            stmt.setInt(11, product.getStock());
            stmt.setFloat(12, product.getPrice());

            //executes the command in the DB
            stmt.execute();
        } finally {
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }
    }

    //Performs the update of the data of a product
    public static void update(Product product) throws SQLException, Exception {

        String sql = "UPDATE "
                + "product SET brand=?, category=?, subcategory=?, name=?, barcode=?, description=?, warranty=?, model=?, picture=?, stock=?, price=? "
                + "WHERE (product_id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setObject(1, product.getBrand());
            stmt.setObject(2, product.getCategory());
            stmt.setObject(3, product.getSubCategory());
            stmt.setString(4, product.getName());
            stmt.setString(5, product.getBarCode());
            stmt.setString(6, product.getDescription());
            stmt.setInt(7, product.getWarranty());
            stmt.setString(8, product.getModel());
            stmt.setBytes(9, product.getPicture());
            stmt.setInt(10, product.getStock());
            stmt.setFloat(11, product.getPrice());
            stmt.setInt(12, product.getProductId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }

    }

    //Performs logical deletion of a product in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE product SET enabled=? WHERE (product_id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setBoolean(1, false);
            stmt.setInt(2, id);

            //executes the command in the DB
            stmt.execute();
        } finally {
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }
    }

    //List all products in the table product
    public static List<Product> list() throws SQLException, Exception {

        String sql = "SELECT * FROM product WHERE (enabled=?)";

        List<Product> listProduct = null;

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

                if (listProduct == null) {
                    listProduct = new ArrayList<Product>();
                }

                Product product = new Product();
                product.setProductId(result.getInt("product_id"));
                product.setBrand((Brand) result.getObject("brand"));// Need to be tested
                product.setCategory((Category) result.getObject("category"));// Need to be tested
                product.setSubCategory((Subcategory) result.getObject("subcategory"));// Need to be tested
                product.setName(result.getString("name"));
                product.setBarCode("barcode");
                product.setDescription("description");
                product.setWarranty(result.getInt("warranty"));
                product.setModel(result.getString("model"));
                product.setPicture(result.getBytes("picture"));
                product.setStock(result.getInt("stock"));
                product.setPrice(result.getFloat("price"));

                listProduct.add(product);
            }
        } finally {
            //If the result still open, it closes
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }

        return listProduct;
    }

    //Search for a product by name
    public static List<Product> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM product WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<Product> listProduct = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + value + "%");
            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listProduct == null) {
                    listProduct = new ArrayList<Product>();
                }

                Product product = new Product();
                product.setProductId(result.getInt("product_id"));
                product.setBrand((Brand) result.getObject("brand"));// Need to be tested
                product.setCategory((Category) result.getObject("category"));// Need to be tested
                product.setSubCategory((Subcategory) result.getObject("subcategory"));// Need to be tested
                product.setName(result.getString("name"));
                product.setBarCode("barcode");
                product.setDescription("description");
                product.setWarranty(result.getInt("warranty"));
                product.setModel(result.getString("model"));
                product.setPicture(result.getBytes("picture"));
                product.setStock(result.getInt("stock"));
                product.setPrice(result.getFloat("price"));

                listProduct.add(product);
            }
        } finally {
            //If the result still open, it closes
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }

        return listProduct;
    }

    //Get an instance of the product class by id
    public static Product get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM product WHERE (product_id=? AND enabled=?)";

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

                Product product = new Product();
                product.setProductId(result.getInt("product_id"));
                product.setBrand((Brand) result.getObject("brand"));// Need to be tested
                product.setCategory((Category) result.getObject("category"));// Need to be tested
                product.setSubCategory((Subcategory) result.getObject("subcategory"));// Need to be tested
                product.setName(result.getString("name"));
                product.setBarCode("barcode");
                product.setDescription("description");
                product.setWarranty(result.getInt("warranty"));
                product.setModel(result.getString("model"));
                product.setPicture(result.getBytes("picture"));
                product.setStock(result.getInt("stock"));
                product.setPrice(result.getFloat("price"));

                return product;
            }
        } finally {
            //If the result still open, it closes
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }

        return null;
    }

}
