package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Brand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOBrand {

    public static void insert(Brand brand) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getConnection();

            String sql = "INSERT INTO "
                    + "product (name) "
                    + "VALUES (?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, brand.getName());

            stmt.executeUpdate();
        } finally {
            ConnectionUtils.closeConnection(con);
        }
    }

}
