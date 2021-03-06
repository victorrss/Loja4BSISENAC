package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.ContactType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOContactType {

    //Inserts a Contact type into the contact_type table of the database
    public static void insert(ContactType contactType) throws SQLException, Exception {

        String sql = "INSERT INTO contact_type (description, enabled) VALUES (?, ?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, contactType.getDescription());
            stmt.setBoolean(2, true);

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a contact type
    public static void update(ContactType contactType) throws SQLException, Exception {

        String sql = "UPDATE contact_type SET description=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, contactType.getDescription());
            stmt.setInt(2, contactType.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs logical deletion of a contact type in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE contact_type SET enabled=? WHERE (id=?)";

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

    //List all contact types in the table contact_type
    public static List<ContactType> list() throws SQLException, Exception {

        String sql = "SELECT * FROM contact_type WHERE enabled=?";

        List<ContactType> listContactType = null;

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

                if (listContactType == null) {
                    listContactType = new ArrayList<ContactType>();
                }
                // Create a ContactType instance and population with BD values
                ContactType contactType = new ContactType();

                contactType.setId(result.getInt("id"));
                contactType.setDescription(result.getString("description"));

                // Add the instance in the list
                listContactType.add(contactType);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listContactType;
    }

    //Search for a contact type by description
    public static List<ContactType> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM contact_type WHERE (UPPER(description) LIKE UPPER(?) AND enabled=?)";

        List<ContactType> listContactType = null;

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

                if (listContactType == null) {
                    listContactType = new ArrayList<ContactType>();
                }

                // Create a ContactType instance and population with BD values
                ContactType contactType = new ContactType();

                contactType.setId(result.getInt("id"));
                contactType.setDescription(result.getString("description"));

                // Add the instance in the list
                listContactType.add(contactType);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listContactType;
    }

    //Get an instance of the contact type class by id
    public static ContactType get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM contact_type WHERE (id=? AND enabled=?)";

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

                // Create a ContactType instance and population with BD values
                ContactType contactType = new ContactType();

                contactType.setId(result.getInt("id"));
                contactType.setDescription(result.getString("description"));

                return contactType;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }

}
