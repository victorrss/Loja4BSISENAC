package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.MaritalStatus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOMaritalStatus {

    //Inserts a Marital status into the maritalstatus table of the database
    public static void insert(MaritalStatus maritalStatus) throws SQLException, Exception {

        String sql = "INSERT INTO maritalstatus (description, enabled) VALUES (?, ?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, maritalStatus.getDescription());
            stmt.setBoolean(2, true);

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a marital status
    public static void update(MaritalStatus maritalStatus) throws SQLException, Exception {

        String sql = "UPDATE maritalstatus SET description=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, maritalStatus.getDescription());
            stmt.setInt(2, maritalStatus.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs logical deletion of a marital status in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE maritalstatus SET enabled=? WHERE (id=?)";

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

    //List all marital status in the table maritalstatus
    public static List<MaritalStatus> list() throws SQLException, Exception {

        String sql = "SELECT * FROM maritalstatus WHERE enabled =?";

        List<MaritalStatus> listMaritalStatus = null;

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

                if (listMaritalStatus == null) {
                    listMaritalStatus = new ArrayList<MaritalStatus>();
                }
                // Create a MaritalStatus instance and population with BD values
                MaritalStatus maritalStatus = new MaritalStatus();

                maritalStatus.setId(result.getInt("id"));
                maritalStatus.setDescription(result.getString("description"));

                // Add the instance in the list
                listMaritalStatus.add(maritalStatus);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listMaritalStatus;
    }

    //Search for a marital status by description
    public static List<MaritalStatus> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM maritalstatus WHERE (UPPER(description) LIKE UPPER(?) AND enabled=?)";

        List<MaritalStatus> listMaritalStatus = null;

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

                if (listMaritalStatus == null) {
                    listMaritalStatus = new ArrayList<MaritalStatus>();
                }

                // Create a MaritalStatus instance and population with BD values
                MaritalStatus maritalStatus = new MaritalStatus();

                maritalStatus.setId(result.getInt("id"));
                maritalStatus.setDescription(result.getString("description"));

                // Add the instance in the list
                listMaritalStatus.add(maritalStatus);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listMaritalStatus;
    }

    //Get an instance of the marital status class by id
    public static MaritalStatus get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM maritalstatus WHERE (id=? AND enabled=?)";

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

                // Create a MaritalStatus instance and population with BD values
                MaritalStatus maritalStatus = new MaritalStatus();

                maritalStatus.setId(result.getInt("id"));
                maritalStatus.setDescription(result.getString("description"));

                // Add the instance in the list
                return maritalStatus;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }
}
