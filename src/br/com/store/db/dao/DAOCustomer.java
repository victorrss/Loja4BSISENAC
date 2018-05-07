package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Address;
import br.com.store.model.City;
import br.com.store.model.Customer;
import br.com.store.model.DocumentType;
import br.com.store.model.MaritalStatus;
import br.com.store.model.PublicPlaceType;
import br.com.store.model.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOCustomer {

    //Inserts a product into the product table of the database
    public static void insert(Customer customer) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "customer (name, document_type_id, document, gender, birth_date, address_id, maritalstatus_id, note, created_at, enabled)"
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, customer.getName());
//<<<<<<< HEAD
            stmt.setObject(2, customer.getDocumentType());
            stmt.setString(3, customer.getDocument());
            stmt.setString(4, customer.getGender());
            Timestamp bd = new Timestamp(customer.getBirthDate().getTime());
            stmt.setTimestamp(5, bd);
            stmt.setObject(6, customer.getAddress());
            stmt.setObject(7, customer.getMaritalStatus());
//=======
           // stmt.setObject(2, customer.getDocumentTypeID());
            stmt.setString(3, customer.getDocument());
            stmt.setString(4, customer.getGender());
           // Timestamp t = new Timestamp(customer.getBirth_date().getTime());
         //   stmt.setTimestamp(5, t);
           // stmt.setObject(6, customer.getAddressID());
           // stmt.setObject(7, customer.getMaritalStatusID());
//>>>>>>> 2f348254dd5995540aac8e7c35889d0145419659
            stmt.setString(8, customer.getNote());
            Timestamp c = new Timestamp(customer.getCreatedAt().getTime());
            stmt.setTimestamp(9, c);
            stmt.setBoolean(10, true);

            //Executes the command in the DB
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

    //Performs the update of the data of a product
    public static void update(Customer customer)
            throws SQLException, Exception {

        String sql = "UPDATE customer SET name=?, document_type_id=?, document=?, gender=?, birth_date=?, address_id=?, maritalstatus_id=?, note=?, created_at=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, customer.getName());
//<<<<<<< HEAD
            stmt.setObject(2, customer.getDocumentType());
            stmt.setString(3, customer.getDocument());
            stmt.setString(4, customer.getGender());
            Timestamp bd = new Timestamp(customer.getBirthDate().getTime());
            stmt.setTimestamp(5, bd);
            stmt.setObject(6, customer.getAddress());
            stmt.setObject(7, customer.getMaritalStatus());
//=======
          //  stmt.setObject(2, customer.getDocumentTypeID());
            stmt.setString(3, customer.getDocument());
            stmt.setString(4, customer.getGender());
          //  Timestamp t = new Timestamp(customer.getBirth_date().getTime());
         //   stmt.setTimestamp(5, t);
           // stmt.setObject(6, customer.getAddressID());
          //  stmt.setObject(7, customer.getMaritalStatusID());
//>>>>>>> 2f348254dd5995540aac8e7c35889d0145419659
            stmt.setString(8, customer.getNote());
            Timestamp c = new Timestamp(customer.getCreatedAt().getTime());
            stmt.setTimestamp(9, c);
            stmt.setInt(10, customer.getId());

            //Executes the command in the DB
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

    //Performs logical deletion of a product in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE customer SET enabled=? WHERE (id=?)";

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

    //List all products in the table product
    public static List<Customer> list() throws SQLException, Exception {

        String sql = "SELECT a.*, "
                + "b.address_id AS address_id, "
                + "b1.publicplace_type_id AS address_publicplacetype_id, b1.name AS publicplace_type_name,"
                + "b1.abbreviation AS publicplace_type_abbreviation, "
                + "b2.city_id AS city_id, b2.state_id AS state_id, b2.name AS city_name,"
                + "b3.state_id AS state_id, b3.name AS state_name, b3.abbreviation AS state_abbreviation,  "
                + "b.publicplace AS address_publicplace, b.number AS address_number, "
                + "b.complement AS address_complement, b.district AS address_district, b.zipcode AS address_zipcode, "
                + "c.id AS maritalstatus_id, c.description AS maritalstatus_description, "
                + "d.id AS document_type_id, d.name AS document_type_name "
                + "FROM customer a "
                + "INNER JOIN address b ON b.address_id = a.address_id "
                + "INNER JOIN publicplace_type b1 ON b1.publicplace_type_id = b.publicplace_type_id"
                + "INNER JOIN city b2 ON b2.city_id = b.city_id"
                + "INNER JOIN state b3 ON b3.state_id = b2.state_id"
                + "INNER JOIN maritalstatus c ON c.maritalstatus_id = a.maritalstatus_id "
                + "INNER JOIN document_type d ON d.document_type_id = a.document_type_id "
                + "WHERE enabled=?)";

        List<Customer> listCustomer = null;

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

                if (listCustomer == null) {
                    listCustomer = new ArrayList<Customer>();
                }
                // Create a Client instance and population with BD values
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setName(result.getString("name"));
//<<<<<<< HEAD
                customer.setDocumentType(new DocumentType(result.getInt("document_type_id"), result.getString("document_type_name")));
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date d = new Date(result.getTimestamp("birth_date").getTime());
                customer.setBirthDate(d);
                customer.setAddress(new Address(result.getInt("address_id"),
                        new PublicPlaceType(result.getInt("publicplace_type_id"), result.getString("publicplace_type_name"), result.getString("publicplace_type_abbreviation")),
                         new City(result.getInt("city_id"), new State(result.getInt("state_id"), result.getString("state_name"), result.getString("state_abbreviation")),
                                 result.getString("city_name")),
                        result.getString("publicplace"), result.getInt("number"), result.getString("complement"),
                        result.getString("district"), result.getInt("zipcode")));
                customer.setMaritalStatus(new MaritalStatus(result.getInt("maritalstatus_id"), result.getString("maritalstatus_description")));// Need to be tested
//=======
              //  customer.setDocumentTypeID((DocumentType) result.getObject("document_type_id"));// Need to be tested
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                //Date d = new Date(result.getTimestamp("birth_date").getTime());
               // customer.setBirth_date(d);
              //  customer.setAddressID((Address) result.getObject("address_id"));// Need to be tested
               // customer.setMaritalStatusID((MaritalStatus) result.getObject("maritalstatus_id"));// Need to be tested
//>>>>>>> 2f348254dd5995540aac8e7c35889d0145419659
                customer.setNote(result.getString("note"));

                // Add the instance in the list
                listCustomer.add(customer);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }
        //Returns a list of database clients
        return listCustomer;
    }

    //Search for a product by name
    public static List<Customer> search(String value) throws SQLException, Exception {

        String sql = "SELECT a.*, "
                + "b.address_id AS address_id, "
                + "b1.publicplace_type_id AS address_publicplacetype_id, b1.name AS publicplace_type_name,"
                + "b1.abbreviation AS publicplace_type_abbreviation, "
                + "b2.city_id AS city_id, b2.state_id AS state_id, b2.name AS city_name,"
                + "b3.state_id AS state_id, b3.name AS state_name, b3.abbreviation AS state_abbreviation,  "
                + "b.publicplace AS address_publicplace, b.number AS address_number, "
                + "b.complement AS address_complement, b.district AS address_district, b.zipcode AS address_zipcode, "
                + "c.id AS maritalstatus_id, c.description AS maritalstatus_description, "
                + "d.id AS document_type_id, d.name AS document_type_name "
                + "FROM customer a "
                + "INNER JOIN address b ON b.address_id = a.address_id "
                + "INNER JOIN publicplace_type b1 ON b1.publicplace_type_id = b.publicplace_type_id"
                + "INNER JOIN city b2 ON b2.city_id = b.city_id"
                + "INNER JOIN state b3 ON b3.state_id = b2.state_id"
                + "INNER JOIN maritalstatus c ON c.maritalstatus_id = a.maritalstatus_id "
                + "INNER JOIN document_type d ON d.document_type_id = a.document_type_id "
                + "WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<Customer> listCustomer = null;

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

                if (listCustomer == null) {
                    listCustomer = new ArrayList<Customer>();
                }

                // Create a Client instance and population with BD values
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setName(result.getString("name"));
                customer.setDocumentType(new DocumentType(result.getInt("document_type_id"), result.getString("document_type_name")));
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date d = new Date(result.getTimestamp("birth_date").getTime());
                customer.setBirthDate(d);
                customer.setAddress(new Address(result.getInt("address_id"),
                        new PublicPlaceType(result.getInt("publicplace_type_id"), result.getString("publicplace_type_name"), result.getString("publicplace_type_abbreviation")),
                         new City(result.getInt("city_id"), new State(result.getInt("state_id"), result.getString("state_name"), result.getString("state_abbreviation")),
                                 result.getString("city_name")),
                        result.getString("publicplace"), result.getInt("number"), result.getString("complement"),
                        result.getString("district"), result.getInt("zipcode")));
                customer.setMaritalStatus(new MaritalStatus(result.getInt("maritalstatus_id"), result.getString("maritalstatus_description")));// Need to be tested
                customer.setNote(result.getString("note"));

                listCustomer.add(customer);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listCustomer;
    }

    //Get an instance of the product class by id
    public static Customer get(Integer id) throws SQLException, Exception {

                String sql = "SELECT a.*, "
                + "b.address_id AS address_id, "
                + "b1.publicplace_type_id AS address_publicplacetype_id, b1.name AS publicplace_type_name,"
                + "b1.abbreviation AS publicplace_type_abbreviation, "
                + "b2.city_id AS city_id, b2.state_id AS state_id, b2.name AS city_name,"
                + "b3.state_id AS state_id, b3.name AS state_name, b3.abbreviation AS state_abbreviation,  "
                + "b.publicplace AS address_publicplace, b.number AS address_number, "
                + "b.complement AS address_complement, b.district AS address_district, b.zipcode AS address_zipcode, "
                + "c.id AS maritalstatus_id, c.description AS maritalstatus_description, "
                + "d.id AS document_type_id, d.name AS document_type_name "
                + "FROM customer a "
                + "INNER JOIN address b ON b.address_id = a.address_id "
                + "INNER JOIN publicplace_type b1 ON b1.publicplace_type_id = b.publicplace_type_id"
                + "INNER JOIN city b2 ON b2.city_id = b.city_id"
                + "INNER JOIN state b3 ON b3.state_id = b2.state_id"
                + "INNER JOIN maritalstatus c ON c.maritalstatus_id = a.maritalstatus_id "
                + "INNER JOIN document_type d ON d.document_type_id = a.document_type_id "
                + "WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

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

                // Create a Client instance and population with BD values
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setName(result.getString("name"));
                customer.setDocumentType(new DocumentType(result.getInt("document_type_id"), result.getString("document_type_name")));
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date d = new Date(result.getTimestamp("birth_date").getTime());
                customer.setBirthDate(d);
                customer.setAddress(new Address(result.getInt("address_id"),
                        new PublicPlaceType(result.getInt("publicplace_type_id"), result.getString("publicplace_type_name"), result.getString("publicplace_type_abbreviation")),
                         new City(result.getInt("city_id"), new State(result.getInt("state_id"), result.getString("state_name"), result.getString("state_abbreviation")),
                                 result.getString("city_name")),
                        result.getString("publicplace"), result.getInt("number"), result.getString("complement"),
                        result.getString("district"), result.getInt("zipcode")));
                customer.setMaritalStatus(new MaritalStatus(result.getInt("maritalstatus_id"), result.getString("maritalstatus_description")));// Need to be tested
                customer.setNote(result.getString("note"));

                return customer;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }
}
