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
        String url = "jdbc:mysql://localhost:3306/store";
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

    public static void finalize(PreparedStatement stmt, Connection con) {
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

    public static void finalize(ResultSet result, PreparedStatement stmt, Connection con) {
        try {
            //If the result still open, it closes
            if (result != null && !result.isClosed()) {
                result.close();
            }
            finalize(stmt, con);
        } catch (Exception e) {
        }
    }

    public static void finalize(ResultSet result, PreparedStatement stmt) {
        try {
            //If the result still open, it closes
            if (result != null && !result.isClosed()) {
                result.close();
            }

            finalize(stmt);

        } catch (Exception e) {
        }
    }

    public static void finalize(PreparedStatement stmt) {
        try {
            //If the statement still open, it closes
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (Exception e) {
        }
    }

    public static void finalize(Connection con) {
        try {
            //If the connection still open, it closes
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
        }
    }
}
