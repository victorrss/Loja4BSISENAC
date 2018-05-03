package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Subcategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSubcategory {
    
    //Inserts a brand into the subcategory table of the database
    public static void insert(Subcategory subcategory) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "subcategory (name) "
                + "VALUES (?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, subcategory.getName());

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

    //Performs the update of the data of a subcategory
    public static void update(Subcategory subcategory) throws SQLException, Exception {

        String sql = "UPDATE "
                + "subcategory SET name=? "
                + "WHERE (subcategory_id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, subcategory.getName());
            stmt.setInt(2, subcategory.getSubCategoryId());

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

    //Performs logical deletion of a subcategory in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE subcategory SET enabled=? WHERE (subcategory_id=?)";

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

    //List all subcategories in the table subcategory
    public static List<Subcategory> list() throws SQLException, Exception {

        String sql = "SELECT * FROM subcategory WHERE (enabled=?)";

        List<Subcategory> listSubcategory = null;

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

                if (listSubcategory == null) {
                    listSubcategory = new ArrayList<Subcategory>();
                }

                Subcategory subcategory = new Subcategory();
                subcategory.setSubCategoryId(result.getInt("subcategory_id"));
                subcategory.setName(result.getString("name"));

                listSubcategory.add(subcategory);
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

        return listSubcategory;
    }

    //Search for a subcategory by name
    public static List<Subcategory> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM Subcategory WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<Subcategory> listSubcategory = null;

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

                if (listSubcategory == null) {
                    listSubcategory = new ArrayList<Subcategory>();
                }

                Subcategory subcategory = new Subcategory();
                subcategory.setSubCategoryId(result.getInt("subcategory_id"));
                subcategory.setName(result.getString("name"));

                listSubcategory.add(subcategory);
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

        return listSubcategory;
    }

    //Get an instance of the subcategory class by id
    public static Subcategory get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM subcategory WHERE (subcategory_id=? AND enabled=?)";

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

                Subcategory subcategory = new Subcategory();
                subcategory.setSubCategoryId(result.getInt("subcategory_id"));
                subcategory.setName(result.getString("name"));

                return subcategory;
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
