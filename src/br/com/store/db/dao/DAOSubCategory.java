package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.SubCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSubCategory {
    
    //Inserts a brand into the subcategory table of the database
    public static void insert(SubCategory subcategory) throws SQLException, Exception {

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
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a subcategory
    public static void update(SubCategory subcategory) throws SQLException, Exception {

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
            stmt.setInt(2, subcategory.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
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
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //List all subcategories in the table subcategory
    public static List<SubCategory> list() throws SQLException, Exception {

        String sql = "SELECT * FROM subcategory WHERE (enabled=?)";

        List<SubCategory> listSubcategory = null;

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
                    listSubcategory = new ArrayList<SubCategory>();
                }

                SubCategory subcategory = new SubCategory();
                subcategory.setId(result.getInt("subcategory_id"));
                subcategory.setName(result.getString("name"));

                listSubcategory.add(subcategory);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listSubcategory;
    }

    //Search for a subcategory by name
    public static List<SubCategory> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM Subcategory WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<SubCategory> listSubcategory = null;

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
                    listSubcategory = new ArrayList<SubCategory>();
                }

                SubCategory subcategory = new SubCategory();
                subcategory.setId(result.getInt("subcategory_id"));
                subcategory.setName(result.getString("name"));

                listSubcategory.add(subcategory);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listSubcategory;
    }

    //Get an instance of the subcategory class by id
    public static SubCategory get(Integer id) throws SQLException, Exception {

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

                SubCategory subcategory = new SubCategory();
                subcategory.setId(result.getInt("subcategory_id"));
                subcategory.setName(result.getString("name"));

                return subcategory;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }
}
