package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Brand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOBrand {

    //Inserts a brand into the brand table of the database
    public static void insert(Brand brand) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "brand (name, enabled) "
                + "VALUES (?,?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, brand.getName());
            stmt.setBoolean(2, true);
            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a brand
    public static void update(Brand brand) throws SQLException, Exception {

        String sql = "UPDATE "
                + "brand SET name=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, brand.getName());
            stmt.setInt(2, brand.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }

    }

    //Performs logical deletion of a brand in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE brand SET enabled=? WHERE (id=?)";

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

    //List all brands in the table product
    public static List<Brand> list() throws SQLException, Exception {

        String sql = "SELECT * FROM brand WHERE (enabled=?)";

        List<Brand> listBrand = null;

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

                if (listBrand == null) {
                    listBrand = new ArrayList<Brand>();
                }

                Brand brand = new Brand();
                brand.setId(result.getInt("id"));
                brand.setName(result.getString("name"));

                listBrand.add(brand);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listBrand;
    }

    //Search for a brand by name
    public static List<Brand> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM brand WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<Brand> listBrand = null;

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

                if (listBrand == null) {
                    listBrand = new ArrayList<Brand>();
                }

                Brand brand = new Brand();
                brand.setId(result.getInt("id"));
                brand.setName(result.getString("name"));

                listBrand.add(brand);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listBrand;
    }

    //Get an instance of the brand class by id
    public static Brand get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM brand WHERE (id=? AND enabled=?)";

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

                Brand brand = new Brand();
                brand.setId(result.getInt("id"));
                brand.setName(result.getString("name"));

                return brand;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }

}
