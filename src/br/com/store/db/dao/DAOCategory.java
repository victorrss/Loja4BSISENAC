package br.com.store.db.dao;

import br.com.empresa.db.util.ConnectionUtils;
import br.com.store.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCategory {

    public static void insert(Category category) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getConnection();

            String sql = "INSERT INTO "
                    + "product (name) "
                    + "VALUES (?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, category.getName());

            stmt.executeUpdate();
        } finally {
            ConnectionUtils.closeConnection(con);
        }
    }

}
