package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Address;
import br.com.store.model.City;
import br.com.store.model.PublicPlaceType;
import br.com.store.utils.DataUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class DAOAddress {

    //Inserts a Address into the address table of the database
    public static Integer insert(Address address) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "address (publicplace_type_id, city_id, publicplace, number, complement, district, zipcode, enabled)"
                + "  VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, address.getPublicPlaceType().getId());
            stmt.setInt(2, address.getCity().getId());
            stmt.setString(3, address.getPublicPlace());
            if (address.getNumber() == null) {
                stmt.setNull(4, Types.INTEGER);
            } else {
                stmt.setInt(4, address.getNumber());
            }
            stmt.setString(5, address.getComplement());
            stmt.setString(6, address.getDistrict());
            stmt.setInt(7, address.getZipcode());
            stmt.setBoolean(8, true);

            //Executes the command in the DB
            return stmt.executeUpdate();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a address
    public static void update(Address address) throws SQLException, Exception {

        String sql = "UPDATE address SET publicplace_type_id=?, city_id=?, publicplace=?, number=?,"
                + " complement=?, district=?, zipcode=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, address.getPublicPlaceType().getId());
            stmt.setInt(2, address.getCity().getId());
            stmt.setString(3, address.getPublicPlace());
            stmt.setInt(4, address.getNumber());
            stmt.setString(5, address.getComplement());
            stmt.setString(6, address.getDistrict());
            stmt.setInt(7, address.getZipcode());
            stmt.setInt(8, address.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs logical deletion of a address in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE address SET enabled=? WHERE (id=?)";

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
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //List all address in the table address
    public static List<Address> list() throws SQLException, Exception {

        String sql = "SELECT * FROM address WHERE (enabled=?)";

        List<Address> listAddress = null;

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

                if (listAddress == null) {
                    listAddress = new ArrayList<Address>();
                }
                // Create a Address instance and population with BD values
                Address address = new Address();

                address.setId(result.getInt("id"));
                PublicPlaceType publicPlaceType = DAOPublicPlaceType.get(result.getInt("id"));
                address.setPublicPlaceType(publicPlaceType);
                City city = DAOCity.get(result.getInt("id"));
                address.setCity(city);
                address.setPublicPlace(result.getString("publicplace"));
                address.setNumber(result.getInt("number"));
                address.setComplement(result.getString("complement"));
                address.setDistrict(result.getString("district"));
                address.setZipcode(result.getInt("zipcode"));

                // Add the instance in the list
                listAddress.add(address);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listAddress;
    }

    //Search for a address by public place
    public static List<Address> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM address WHERE (UPPER(publicplace) LIKE UPPER(?) AND enabled=?)";

        List<Address> listAddress = null;

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

                if (listAddress == null) {
                    listAddress = new ArrayList<Address>();
                }

                // Create a Address instance and population with BD values
                Address address = new Address();

                address.setId(result.getInt("id"));
                PublicPlaceType publicPlaceType = DAOPublicPlaceType.get(result.getInt("id"));
                address.setPublicPlaceType(publicPlaceType);
                City city = DAOCity.get(result.getInt("id"));
                address.setCity(city);
                address.setPublicPlace(result.getString("publicplace"));
                address.setNumber(result.getInt("number"));
                address.setComplement(result.getString("complement"));
                address.setDistrict(result.getString("district"));
                address.setZipcode(result.getInt("zipcode"));

                // Add the instance in the list
                listAddress.add(address);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listAddress;
    }

    //Get an instance of the address class by id
    public static Address get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM address WHERE (id=? AND enabled=?)";

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

                // Create a Address instance and population with BD values
                Address address = new Address();

                address.setId(result.getInt("id"));
                PublicPlaceType publicPlaceType = DAOPublicPlaceType.get(result.getInt("publicplace_type_id"));
                address.setPublicPlaceType(publicPlaceType);
                City city = DAOCity.get(result.getInt("city_id"));
                address.setCity(city);
                address.setPublicPlace(result.getString("publicplace"));
                address.setNumber(result.getInt("number"));
                address.setComplement(result.getString("complement"));
                address.setDistrict(result.getString("district"));
                address.setZipcode(result.getInt("zipcode"));

                return address;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }
}
