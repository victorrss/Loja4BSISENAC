package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.PublicPlaceType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPublicPlaceType {

    //Inserts a Public place type into the publicplace_type table of the database
    public static void insert(PublicPlaceType publicPlaceType) throws SQLException, Exception {

        String sql = "INSERT INTO publicplace_type (name, abbreviation, enabled) VALUES (?, ?, ?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, publicPlaceType.getName());
            stmt.setString(2, publicPlaceType.getAbbreviation());
            stmt.setBoolean(3, true);

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a public place type
    public static void update(PublicPlaceType publicPlaceType) throws SQLException, Exception {

        String sql = "UPDATE publicplace_type SET name=?, abbreviation=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, publicPlaceType.getName());
            stmt.setString(2, publicPlaceType.getAbbreviation());
            stmt.setInt(3, publicPlaceType.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs logical deletion of a public place type in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE publicplace_type SET enabled=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            //Configures the parameters of the "PreparedStatement"
            stmt.setBoolean(1, false);
            stmt.setInt(2, id);

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //List all Public place types in the table publicplace_type
    public static List<PublicPlaceType> list() throws SQLException, Exception {

        String sql = "SELECT * FROM publicplace_type WHERE enabled =?";

        List<PublicPlaceType> listPublicPlaceType = null;

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

                if (listPublicPlaceType == null) {
                    listPublicPlaceType = new ArrayList<PublicPlaceType>();
                }
                // Create a PublicPlaceType instance and population with BD values
                PublicPlaceType publicPlaceType = new PublicPlaceType();

                publicPlaceType.setId(result.getInt("id"));
                publicPlaceType.setName(result.getString("name"));
                publicPlaceType.setAbbreviation("abbreviation");

                // Add the instance in the list
                listPublicPlaceType.add(publicPlaceType);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listPublicPlaceType;
    }

    //Search for a public place type by name
    public static List<PublicPlaceType> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM publicplace_type WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<PublicPlaceType> listPublicPlaceType = null;

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

                if (listPublicPlaceType == null) {
                    listPublicPlaceType = new ArrayList<PublicPlaceType>();
                }

                // Create a PublicPlaceType instance and population with BD values
                PublicPlaceType publicPlaceType = new PublicPlaceType();

                publicPlaceType.setId(result.getInt("id"));
                publicPlaceType.setName(result.getString("name"));
                publicPlaceType.setAbbreviation("abbreviation");

                // Add the instance in the list
                listPublicPlaceType.add(publicPlaceType);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listPublicPlaceType;
    }

    //Get an instance of the public place type class by id
    public static PublicPlaceType get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM publicplace_type WHERE (id=? AND enabled=?)";

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

                // Create a PublicPlaceType instance and population with BD values
                PublicPlaceType publicPlaceType = new PublicPlaceType();

                publicPlaceType.setId(result.getInt("id"));
                publicPlaceType.setName(result.getString("name"));
                publicPlaceType.setAbbreviation("abbreviation");

                return publicPlaceType;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }
}
