package br.com.empresa.db.dao;

import br.com.empresa.db.util.ConnectionUtils;
import br.com.empresa.model.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOUser {

    public static void insert(User user) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getConnection();

            String sql = "INSERT INTO "
                    + "usuario (nome, senha, data_cadastro, enabled) "
                    + "VALUES (?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getPassword());
            stmt.setDate(3, new Date(user.getDateRegister().getTime()));
            stmt.setBoolean(4, true);

            stmt.executeUpdate();
        } finally {
            ConnectionUtils.closeConnection(con);
        }
    }
}
