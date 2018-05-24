package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOUser {

    //Inserts a user into the user table of the database
    public static void insert(User user) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "user (login, password, admin, enabled) "
                + "VALUES (?,?,?,?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.setBoolean(3, user.isAdmin());
            stmt.setBoolean(4, true);
            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a user
    public static void update(User user) throws SQLException, Exception {

        String sql = "UPDATE "
                + "user SET login=?, password=?, admin=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.setBoolean(3, user.isAdmin());
            stmt.setInt(4, user.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }

    }

    //Performs logical deletion of a user in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE user SET enabled=? WHERE (id=?)";

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

    //List all users in the table product
    public static List<User> list() throws SQLException, Exception {

        String sql = "SELECT * FROM user WHERE (enabled=?)";

        List<User> listUser = null;

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

                if (listUser == null) {
                    listUser = new ArrayList<User>();
                }

                User user = new User();
                user.setId(result.getInt("id"));
                user.setLogin(result.getString("login"));

                listUser.add(user);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listUser;
    }

    //Search for a user by login
    public static List<User> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM user WHERE (UPPER(login) LIKE UPPER(?) AND enabled=?)";

        List<User> listUser = null;

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

                if (listUser == null) {
                    listUser = new ArrayList<User>();
                }

                User user = new User();
                user.setId(result.getInt("id"));
                user.setLogin(result.getString("login"));

                listUser.add(user);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listUser;
    }

    //Get an instance of the user class by id
    public static User get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM user WHERE (id=? AND enabled=?)";

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

                User user = new User();
                user.setId(result.getInt("id"));
                user.setLogin(result.getString("login"));

                return user;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }

}
