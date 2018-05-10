package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.ContactType;
import br.com.store.model.Customer;
import br.com.store.model.CustomerContact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOCustomerContact {

    //Inserts a customer contact into the customer_contact table of the database
    public static void insert(CustomerContact customerContact) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "customer_contact (customer_id, contact_type_id, value, enabled) "
                + "VALUES (?,?,?,?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, customerContact.getCustomer().getId());
            stmt.setInt(2, customerContact.getContactType().getId());
            stmt.setString(3, customerContact.getValue());
            stmt.setBoolean(4, true);

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a customer contact
    public static void update(CustomerContact customerContact) throws SQLException, Exception {

        String sql = "UPDATE "
                + "customer_contact SET customer_id=?, contact_type_id=?, value=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, customerContact.getCustomer().getId());
            stmt.setInt(2, customerContact.getContactType().getId());
            stmt.setString(3, customerContact.getValue());
            stmt.setInt(4, customerContact.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs logical deletion of a customer contact in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE customer_contact SET enabled=? WHERE (id=?)";

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

    //List all contact types in the table costumer_contact
    public static List<CustomerContact> list(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM customer_contact WHERE (enabled=?)";

        List<CustomerContact> listCustomerContact = null;

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

                if (listCustomerContact == null) {
                    listCustomerContact = new ArrayList<CustomerContact>();
                }

                CustomerContact customerContact = new CustomerContact();
                customerContact.setId(result.getInt("id"));
                Customer customerId = DAOCustomer.get(result.getInt("id"));
                customerContact.setCustomer(customerId);
                ContactType contactTypeId = DAOContactType.get(result.getInt("id"));
                customerContact.setContactType(contactTypeId);
                customerContact.setValue(result.getString("value"));

                listCustomerContact.add(customerContact);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listCustomerContact;
    }

    //Search for a customer contact by name
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

                // Create a Customer instance and population with BD values
                CustomerContact customerContact = new CustomerContact();

                customerContact.setId(result.getInt("id"));
                Customer customerId = DAOCustomer.get(result.getInt("id"));
                customerContact.setCustomer(customerId);
                ContactType contactTypeId = DAOContactType.get(result.getInt("id"));
                customerContact.setContactType(contactTypeId);
                customerContact.setValue(result.getString("value"));

                listCustomerContact.add(customerContact);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listCustomerContact;
    }

    //Get an instance of the customer contact class by id
    public static CustomerContact get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM customer_contact WHERE (enabled=?)";

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

                // Create a Customer instance and population with BD values
                CustomerContact customerContact = new CustomerContact();

                customerContact.setId(result.getInt("id"));
                Customer customerId = DAOCustomer.get(result.getInt("id"));
                customerContact.setCustomer(customerId);
                ContactType contactTypeId = DAOContactType.get(result.getInt("id"));
                customerContact.setContactType(contactTypeId);
                customerContact.setValue(result.getString("value"));

                return customerContact;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }
}
