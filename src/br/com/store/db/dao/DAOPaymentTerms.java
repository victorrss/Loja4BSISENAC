package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.PaymentTerms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPaymentTerms {

//Inserts a payment term into the payment_terms table of the database
    public static void insert(PaymentTerms paymentTerms) throws SQLException, Exception {
        
        String sql = "INSERT INTO "
                + "payment_terms (name, enabled) "
                + "VALUES (?,?)";
        
        Connection con = null;
        
        PreparedStatement stmt = null;
        
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, paymentTerms.getName());
            stmt.setBoolean(2, true);

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a payment term
    public static void update(PaymentTerms paymentTerms) throws SQLException, Exception {
        
        String sql = "UPDATE "
                + "payment_terms SET name=? "
                + "WHERE (id=?)";
        
        Connection con = null;
        
        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, paymentTerms.getName());
            stmt.setInt(2, paymentTerms.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
        
    }

    //Performs logical deletion of a payment term in the DB
    public static void delete(Integer id) throws SQLException, Exception {
        
        String sql = "UPDATE payment_terms SET enabled=? WHERE (id=?)";
        
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
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //List all payment terms in the table payment_terms
    public static List<PaymentTerms> list() throws SQLException, Exception {
        
        String sql = "SELECT * FROM payment_terms WHERE (enabled=?)";
        
        List<PaymentTerms> listPaymentTerms = null;
        
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
                
                if (listPaymentTerms == null) {
                    listPaymentTerms = new ArrayList<PaymentTerms>();
                }
                
                PaymentTerms paymentTerms = new PaymentTerms();
                paymentTerms.setId(result.getInt("id"));
                paymentTerms.setName(result.getString("name"));
                
                listPaymentTerms.add(paymentTerms);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }
        
        return listPaymentTerms;
    }

    //Search for a payment term by name
    public static List<PaymentTerms> search(String name) throws SQLException, Exception {
        
        String sql = "SELECT * FROM payment_terms WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";
        
        List<PaymentTerms> listPaymentTerms = null;
        
        Connection con = null;
        
        PreparedStatement stmt = null;
        
        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, "%" + name + "%");
            stmt.setBoolean(2, true);
            
            result = stmt.executeQuery();
            
            while (result.next()) {
                
                if (listPaymentTerms == null) {
                    listPaymentTerms = new ArrayList<PaymentTerms>();
                }
                
                PaymentTerms paymentTerms = new PaymentTerms();
                
                paymentTerms.setName(result.getString("name"));
                
                listPaymentTerms.add(paymentTerms);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }
        
        return listPaymentTerms;
    }

    //Get an instance of the payment terms class by id
    public static PaymentTerms get(Integer id) throws SQLException, Exception {
        
        String sql = "SELECT * FROM payment_terms WHERE (id=? AND enabled=?)";
        
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
                
                PaymentTerms paymentTerms = new PaymentTerms();
                
                paymentTerms.setName(result.getString("name"));
                
                return paymentTerms;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }
        
        return null;
    }
    
}
