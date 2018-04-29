package br.com.empresa.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
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

}
