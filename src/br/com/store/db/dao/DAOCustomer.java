package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Address;
import br.com.store.model.Customer;
import br.com.store.model.DocumentType;
import br.com.store.model.MaritalStatus;
import br.com.store.model.enums.CustomerSearchTypeEnum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOCustomer {

    //Inserts a customer into the customer table of the database
    public static Integer insert(Connection con, Customer customer) throws SQLException, Exception {
        String sql = "INSERT INTO "
                + "customer (address_id, maritalstatus_id, name, document_type_id, document, document_identifier, gender, birth_date, note, enabled)"
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = null;
        try {
            //Creates a statement for SQL commands
            //stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt = con.prepareStatement(sql, new String[]{"id"});

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, customer.getAddress().getId());
            stmt.setInt(2, customer.getMaritalStatus().getId());
            stmt.setString(3, customer.getName());
            stmt.setInt(4, customer.getDocumentType().getId());
            stmt.setString(5, customer.getDocument());
            stmt.setString(6, customer.getDocumentType().getName().trim() + customer.getDocument());
            stmt.setString(7, customer.getGender());
            stmt.setDate(8, new java.sql.Date(customer.getBirthDate().getTime()));
            stmt.setString(9, customer.getNote());
            stmt.setBoolean(10, true);

            //Executes the command in the DB
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return null;
        } finally {
            ConnectionUtils.finalize(stmt);
        }
    }
    //Performs the update of the data of a customer

    public static void update(Connection con, Customer customer) throws SQLException, Exception {

        String sql = "UPDATE customer SET address_id=?, maritalstatus_id=?, name=?, document_type_id=?, "
                + "document=?, document_identifier=?, gender=?, birth_date=?, note=? "
                + "WHERE (id=?)";

        PreparedStatement stmt = null;
        try {
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, customer.getAddress().getId());
            stmt.setInt(2, customer.getMaritalStatus().getId());
            stmt.setString(3, customer.getName());
            stmt.setInt(4, customer.getDocumentType().getId());
            stmt.setString(5, customer.getDocument());
            stmt.setString(6, customer.getDocumentType().getName().trim() + customer.getDocument());
            stmt.setString(7, customer.getGender());
            stmt.setDate(8, new java.sql.Date(customer.getBirthDate().getTime()));
            stmt.setString(9, customer.getNote());
            stmt.setInt(10, customer.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt);
        }
    }

    //Performs logical deletion of a customer in the DB
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
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //List all customers in the table customer
    public static List<Customer> list() throws SQLException, Exception {

        String sql = "SELECT * FROM customer WHERE (enabled=?)";

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
                // Create a Customer instance and population with BD values
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setContacts(DAOCustomerContact.list(customer.getId()));
                customer.setName(result.getString("name"));
                DocumentType documentType = DAODocumentType.get(result.getInt("document_type_id"));
                customer.setDocumentType(documentType);
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date bd = new Date(result.getDate("birth_date").getTime());
                customer.setBirthDate(bd);
                Address address = DAOAddress.get(result.getInt("address_id"));
                customer.setAddress(address);
                MaritalStatus maritalStatus = DAOMaritalStatus.get(result.getInt("maritalstatus_id"));
                customer.setMaritalStatus(maritalStatus);
                customer.setNote(result.getString("note"));
                Date ca = new Date(result.getDate("created_at").getTime());
                customer.setCreatedAt(ca);

                // Add the instance in the list
                listCustomer.add(customer);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }
        //Returns a list of database customers
        return listCustomer;
    }

    //Search for a customer by name
    public static List<Customer> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM customer WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

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

                // Create a Customer instance and population with BD values
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setContacts(DAOCustomerContact.list(customer.getId()));
                customer.setName(result.getString("name"));
                DocumentType documentType = DAODocumentType.get(result.getInt("document_type_id"));
                customer.setDocumentType(documentType);
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date bd = new Date(result.getDate("birth_date").getTime());
                customer.setBirthDate(bd);
                Address address = DAOAddress.get(result.getInt("address_id"));
                customer.setAddress(address);
                MaritalStatus maritalStatus = DAOMaritalStatus.get(result.getInt("maritalstatus_id"));
                customer.setMaritalStatus(maritalStatus);
                customer.setNote(result.getString("note"));
                Date ca = new Date(result.getDate("created_at").getTime());
                customer.setCreatedAt(ca);

                listCustomer.add(customer);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCustomer;
    }

    //Search for a customer custom
    public static List<Customer> search(CustomerSearchTypeEnum searchType, String value) throws SQLException, Exception {

        String sql = "SELECT * FROM customer ";

        switch (searchType) {
            case DOCUMENT:
                sql += "WHERE document LIKE ? AND enabled=?";
                break;
            case NAME:
                sql += "WHERE UPPER(name) LIKE UPPER(?) AND enabled=?";
                break;
//            case ID:
//                sql += "WHERE id=?  AND enabled=?";
//                break;
        }
        List<Customer> listCustomer = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            switch (searchType) {
//                case ID:
//                    if (DataUtil.parseInteger(value) == null) {
//                        stmt.setNull(1, Types.INTEGER);
//                    } else {
//                        stmt.setInt(1, DataUtil.parseInteger(value));
//                    }
//                    break;
                case NAME:
                case DOCUMENT:
                    stmt.setString(1, "%" + value + "%");
                    break;
            }

            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listCustomer == null) {
                    listCustomer = new ArrayList<Customer>();
                }

                // Create a Customer instance and population with BD values
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setContacts(DAOCustomerContact.list(customer.getId()));
                customer.setName(result.getString("name"));
                DocumentType documentType = DAODocumentType.get(result.getInt("document_type_id"));
                customer.setDocumentType(documentType);
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date bd = new Date(result.getDate("birth_date").getTime());
                customer.setBirthDate(bd);
                Address address = DAOAddress.get(result.getInt("address_id"));
                customer.setAddress(address);
                MaritalStatus maritalStatus = DAOMaritalStatus.get(result.getInt("maritalstatus_id"));
                customer.setMaritalStatus(maritalStatus);
                customer.setNote(result.getString("note"));
                Date ca = new Date(result.getDate("created_at").getTime());
                customer.setCreatedAt(ca);

                listCustomer.add(customer);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCustomer;
    }

    //Get an instance of the customer class by id
    public static Customer get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM customer WHERE (id=? AND enabled=?)";

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
                Customer customer = new Customer();

                customer.setId(result.getInt("id"));
                customer.setContacts(DAOCustomerContact.list(customer.getId()));
                customer.setName(result.getString("name"));
                DocumentType documentType = DAODocumentType.get(result.getInt("document_type_id"));
                customer.setDocumentType(documentType);
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date bd = new Date(result.getDate("birth_date").getTime());
                customer.setBirthDate(bd);
                Address address = DAOAddress.get(result.getInt("address_id"));
                customer.setAddress(address);
                MaritalStatus maritalStatus = DAOMaritalStatus.get(result.getInt("maritalstatus_id"));
                customer.setMaritalStatus(maritalStatus);
                customer.setNote(result.getString("note"));
                Date ca = new Date(result.getDate("created_at").getTime());
                customer.setCreatedAt(ca);

                return customer;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }
}
