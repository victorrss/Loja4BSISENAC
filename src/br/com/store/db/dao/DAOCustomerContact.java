package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.ContactType;
import br.com.store.model.CustomerContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOCustomerContact {

    //Inserts a Customer contact into the customer_contact table of the database
    public static void insert(Connection con, List<CustomerContact> customerContacts, Integer customerId) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "customer_contact (customer_id, contact_type_id, value, enabled) "
                + "VALUES (?,?,?,?)";

        PreparedStatement stmt = null;

        for (CustomerContact customerContact : customerContacts) {
            try {
                //Creates a statement for SQL commands
                stmt = con.prepareStatement(sql);

                stmt.setInt(1, customerId);
                stmt.setInt(2, customerContact.getContactType().getId());
                stmt.setString(3, customerContact.getValue());
                stmt.setBoolean(4, true);

                //executes the command in the DB
                stmt.execute();
            } finally {
            }
        }

    }

    // Executes logical exclusion of all contacts from a client in the database
    public static void deleteAll(Connection con, Integer customerId) throws SQLException, Exception {

        String sql = "UPDATE customer_contact SET enabled=? WHERE (customer_id=?)";

        PreparedStatement stmt = null;
        try {
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            //Configures the parameters of the "PreparedStatement"
            stmt.setBoolean(1, false);
            stmt.setInt(2, customerId);

            //executes the command in the DB
            stmt.execute();
        } finally {
        }
    }

    // List all contacts from a customer
    public static List<CustomerContact> list(Integer customerId) throws SQLException, Exception {

        String sql = "SELECT * FROM customer_contact "
                + "WHERE customer_id = ? AND (enabled=?)";

        List<CustomerContact> listCustomerContact = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, customerId);
            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listCustomerContact == null) {
                    listCustomerContact = new ArrayList<CustomerContact>();
                }
                // Create a CustomerContact instance and population with BD values
                CustomerContact customerContact = new CustomerContact();

                customerContact.setId(result.getInt("id"));
                customerContact.setCustomerId(result.getInt("customer_id"));
                ContactType contactType = DAOContactType.get(result.getInt("contact_type_id"));
                customerContact.setContactType(contactType);
                customerContact.setValue(result.getString("value"));

                // Add the instance in the list
                listCustomerContact.add(customerContact);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCustomerContact;
    }

    //Search for a customer contact by value
    public static List<CustomerContact> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM customer_contact WHERE (UPPER(value) LIKE UPPER(?) AND enabled=?)";

        List<CustomerContact> listCustomerContact = null;

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

                if (listCustomerContact == null) {
                    listCustomerContact = new ArrayList<CustomerContact>();
                }

                // Create a CustomerContact instance and population with BD values
                CustomerContact customerContact = new CustomerContact();

                customerContact.setId(result.getInt("id"));
                customerContact.setCustomerId(result.getInt("customer_id"));
                ContactType contactType = DAOContactType.get(result.getInt("contact_type_id"));
                customerContact.setContactType(contactType);
                customerContact.setValue(result.getString("value"));

                // Add the instance in the list
                listCustomerContact.add(customerContact);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCustomerContact;
    }

    //Get an instance of the customer contact class by id
    public static CustomerContact get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM customer_contact WHERE (id=? AND enabled=?)";

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

                // Create a CustomerContactType instance and population with BD values
                CustomerContact customerContact = new CustomerContact();

                customerContact.setId(result.getInt("id"));
                customerContact.setCustomerId(result.getInt("customer_id"));
                ContactType contactType = DAOContactType.get(result.getInt("contact_type_id"));
                customerContact.setContactType(contactType);
                customerContact.setValue(result.getString("value"));

                return customerContact;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }
}
