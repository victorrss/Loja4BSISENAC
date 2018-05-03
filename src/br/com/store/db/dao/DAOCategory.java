package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOCategory {

    //Inserts a brand into the category table of the database
    public static void insert(Category category) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "category (name) "
                + "VALUES (?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, category.getName());

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

    //Performs the update of the data of a category
    public static void update(Category category) throws SQLException, Exception {

        String sql = "UPDATE "
                + "category SET name=? "
                + "WHERE (category_id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, category.getName());
            stmt.setInt(2, category.getCategoryId());

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

    //Performs logical deletion of a category in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE category SET enabled=? WHERE (category_id=?)";

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

    //List all categories in the table category
    public static List<Category> list() throws SQLException, Exception {

        String sql = "SELECT * FROM category WHERE (enabled=?)";

        List<Category> listCategory = null;

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

                if (listCategory == null) {
                    listCategory = new ArrayList<Category>();
                }

                Category category = new Category();
                category.setCategoryId(result.getInt("category_id"));
                category.setName(result.getString("name"));

                listCategory.add(category);
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

        return listCategory;
    }

    //Search for a category by name
    public static List<Category> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM category WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<Category> listCategory = null;

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

                if (listCategory == null) {
                    listCategory = new ArrayList<Category>();
                }

                Category category = new Category();
                category.setCategoryId(result.getInt("category_id"));
                category.setName(result.getString("name"));

                listCategory.add(category);
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

        return listCategory;
    }

    //Get an instance of the category class by id
    public static Category get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM category WHERE (category_id=? AND enabled=?)";

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

                Category category = new Category();
                category.setCategoryId(result.getInt("category_id"));
                category.setName(result.getString("name"));

                return category;
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
