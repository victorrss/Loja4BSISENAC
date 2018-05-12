package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Brand;
import br.com.store.model.Category;
import br.com.store.model.Product;
import br.com.store.model.SubCategory;
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
                + "product (brand_id, category_id, subcategory_id, name, barcode, description, warranty, model, picture, enabled, stock, price) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        Connection con = null;

        PreparedStatement stmt = null;

        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, product.getBrand().getId());
            stmt.setInt(2, product.getCategory().getId());
            stmt.setInt(3, product.getSubCategory().getId());
            stmt.setString(4, product.getName());
            stmt.setString(5, product.getBarcode());
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
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a product
    public static void update(Product product) throws SQLException, Exception {

        String sql = "UPDATE "
                + "product SET brand_id=?, category_id=?, subcategory_id=?, name=?, barcode=?, description=?, warranty=?, model=?, picture=?, stock=?, price=? "
                + "WHERE (product_id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, product.getBrand().getId());
            stmt.setInt(2, product.getCategory().getId());
            stmt.setInt(3, product.getSubCategory().getId());
            stmt.setString(4, product.getName());
            stmt.setString(5, product.getBarcode());
            stmt.setString(6, product.getDescription());
            stmt.setInt(7, product.getWarranty());
            stmt.setString(8, product.getModel());
            stmt.setBytes(9, product.getPicture());
            stmt.setInt(10, product.getStock());
            stmt.setFloat(11, product.getPrice());
            stmt.setInt(12, product.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }

    }

    //Performs logical deletion of a product in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE product SET enabled=? WHERE (id=?)";

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
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //List all products in the table product
    public static List<Product> list() throws SQLException, Exception {

        String sql = "SELECT a.*, "
                + "b.id as brand_id, b.name as brand_name, "
                + "c.id as category_id, c.name as category_name, "
                + "d.id as subcategory_id, d.name as subcategory_name "
                + "FROM product a "
                + "INNER JOIN brand b ON b.id = a.brand_id "
                + "INNER JOIN category c ON c.id = a.category_id "
                + "INNER JOIN subcategory d ON d.id = a.subcategory_id "
                + "WHERE (a.enabled=?)";

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
                product.setId(result.getInt("id"));
                product.setBrand(new Brand(result.getInt("brand_id"), result.getString("brand_name"), true));
                product.setCategory(new Category(result.getInt("category_id"), result.getString("category_name"), true));
                product.setSubCategory(new SubCategory(result.getInt("subcategory_id"), result.getString("subcategory_name"), true));
                product.setName(result.getString("name"));
                product.setBarcode(result.getString("barcode"));
                product.setDescription(result.getString("description"));
                product.setWarranty(result.getInt("warranty"));
                product.setModel(result.getString("model"));
                product.setPicture(result.getBytes("picture"));
                product.setStock(result.getInt("stock"));
                product.setPrice(result.getFloat("price"));

                listProduct.add(product);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listProduct;
    }

    //Search for a product by name
    public static List<Product> search(String value) throws SQLException, Exception {

        String sql = "SELECT a.*, "
                + "b.id as brand_id, b.name as brand_name, "
                + "c.id as category_id, c.name as category_name, "
                + "d.id as subcategory_id, d.name as subcategory_name "
                + "FROM product a "
                + "INNER JOIN brand b ON b.id = a.brand_id "
                + "INNER JOIN category c ON c.id = a.category_id "
                + "INNER JOIN subcategory d ON d.id = a.subcategory_id "
                + "WHERE (UPPER(a.name) LIKE UPPER(?) AND a.enabled=?)";

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
                product.setId(result.getInt("id"));
                product.setBrand(new Brand(result.getInt("brand_id"), result.getString("brand_name"), true));
                product.setCategory(new Category(result.getInt("category_id"), result.getString("category_name"), true));
                product.setSubCategory(new SubCategory(result.getInt("subcategory_id"), result.getString("subcategory_name"), true));
                product.setName(result.getString("name"));
                product.setBarcode(result.getString("barcode"));
                product.setDescription(result.getString("description"));
                product.setWarranty(result.getInt("warranty"));
                product.setModel(result.getString("model"));
                product.setPicture(result.getBytes("picture"));
                product.setStock(result.getInt("stock"));
                product.setPrice(result.getFloat("price"));

                listProduct.add(product);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listProduct;
    }

    //Get an instance of the product class by id
    public static Product get(Integer id) throws SQLException, Exception {

        String sql = "SELECT a.*, "
                + "b.id as brand_id, b.name as brand_name, "
                + "c.id as category_id, c.name as category_name, "
                + "d.id as subcategory_id, d.name as subcategory_name "
                + "FROM product a "
                + "INNER JOIN brand b ON b.id = a.brand_id "
                + "INNER JOIN category c ON c.id = a.category_id "
                + "INNER JOIN subcategory d ON d.id = a.subcategory_id "
                + "WHERE (a.product_id=? AND a.enabled=?)";

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
                product.setId(result.getInt("id"));
                product.setBrand(new Brand(result.getInt("brand_id"), result.getString("brand_name"), true));
                product.setCategory(new Category(result.getInt("category_id"), result.getString("category_name"), true));
                product.setSubCategory(new SubCategory(result.getInt("subcategory_id"), result.getString("subcategory_name"), true));
                product.setName(result.getString("name"));
                product.setBarcode(result.getString("barcode"));
                product.setDescription(result.getString("description"));
                product.setWarranty(result.getInt("warranty"));
                product.setModel(result.getString("model"));
                product.setPicture(result.getBytes("picture"));
                product.setStock(result.getInt("stock"));
                product.setPrice(result.getFloat("price"));

                return product;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }

}
