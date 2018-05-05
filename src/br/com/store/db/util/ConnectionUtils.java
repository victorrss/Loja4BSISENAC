package br.com.store.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtils {

    public static Connection getConnection() throws SQLException {

        Connection con = null;
        String url = "jdbc:msysql://localhost:3306/usuarios";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "adminadmin");

        try {
            con = DriverManager.getConnection(url, prop);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void closeConnection(Connection con) throws SQLException {
        if (con != null || !con.isClosed()) {
            con.close();
        }
    }

    public static void finalizeStatementConnection(PreparedStatement stmt, Connection con) {
        try {
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
        }
    }

    public static void finalizeResultsetStatementConnection(ResultSet result, PreparedStatement stmt, Connection con) {
        try {
            //If the result still open, it closes
            if (result != null && !result.isClosed()) {
                result.close();
            }
            finalizeStatementConnection(stmt, con);
        } catch (Exception e) {
        }
    }

}
