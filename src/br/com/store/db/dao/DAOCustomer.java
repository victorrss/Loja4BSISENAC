package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Address;
import br.com.store.model.Customer;
import br.com.store.model.DocumentType;
import br.com.store.model.MaritalStatus;
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
                + "customer (name, document_type_id, document, gender, birth_date, address_id, maritalstatus_id, note, enabled)"
                +"  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection con = null;
        
        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            
            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, customer.getName());
            stmt.setObject(2, customer.getDocumentTypeID());
            stmt.setString(3, customer.getDocument());
            stmt.setString(4, customer.getGender());
            Timestamp t = new Timestamp(customer.getBirth_date().getTime());
            stmt.setTimestamp(5, t);
            stmt.setObject(6, customer.getAddressID());
            stmt.setObject(7, customer.getMaritalStatusID());
            stmt.setString(8, customer.getNote());
            stmt.setBoolean(9, true);

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

        String sql = "UPDATE customer SET address_id=?, maritalstatus_id=?, name=?, document_type_id=?, document=?, gender=?, birth_date=?, note=? "
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
            stmt.setObject(2, customer.getDocumentTypeID());
            stmt.setString(3, customer.getDocument());
            stmt.setString(4, customer.getGender());
            Timestamp t = new Timestamp(customer.getBirth_date().getTime());
            stmt.setTimestamp(5, t);
            stmt.setObject(6, customer.getAddressID());
            stmt.setObject(7, customer.getMaritalStatusID());
            stmt.setString(8, customer.getNote());
            stmt.setInt(9, customer.getId());

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

        String sql = "SELECT * FROM cliente WHERE (enabled=?)";

        List<Customer> listaCustomer = null;

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

                if (listaCustomer == null) {
                    listaCustomer = new ArrayList<Customer>();
                }
                // Create a Client instance and population with BD values
                Customer customer = new Customer();
            
                customer.setId(result.getInt("id"));
                customer.setName(result.getString("name"));
                customer.setDocumentTypeID((DocumentType) result.getObject("document_type_id"));// Need to be tested
                customer.setDocument(result.getString("document"));
                customer.setGender(result.getString("gender"));
                Date d = new Date(result.getTimestamp("birth_date").getTime());
                customer.setBirth_date(d);
                customer.setAddressID((Address) result.getObject("address_id"));// Need to be tested
                customer.setMaritalStatusID((MaritalStatus) result.getObject("maritalstatus_id"));// Need to be tested
                customer.setNote(result.getString("note"));
                
                // Add the instance in the list
                listaCustomer.add(customer);
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
        //Retorna a lista de clientes do banco de dados
        return listaCustomer;
    }
    
}
