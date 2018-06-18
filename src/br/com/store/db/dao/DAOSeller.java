package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Seller;
import br.com.store.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSeller {

    //Inserts a seller into the seller table of the database
    public static void insert(Seller seller) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "seller (user_id, name, manager, enabled) "
                + "VALUES (?,?,?,?)";

        Connection con = null;

        PreparedStatement stmt = null;

        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, seller.getUser().getId());
            stmt.setString(2, seller.getName());
            stmt.setBoolean(3, seller.isManager());
            stmt.setBoolean(4, true);

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a seller
    public static void update(Seller seller) throws SQLException, Exception {

        String sql = "UPDATE "
                + "seller SET user_id=?, name=?, manager=? "
                + "WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, seller.getUser().getId());
            stmt.setString(2, seller.getName());
            stmt.setBoolean(3, seller.isManager());
            stmt.setInt(4, seller.getId());

            //executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }

    }

    //Performs logical deletion of a seller in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE seller SET enabled=? WHERE (id=?)";

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

    //List all sellers in the table seller
    public static List<Seller> list() throws SQLException, Exception {

        String sql = "SELECT * FROM seller WHERE (enabled=?)";

        List<Seller> listSeller = null;

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

                if (listSeller == null) {
                    listSeller = new ArrayList<Seller>();
                }

                Seller seller = new Seller();

                seller.setId(result.getInt("id"));
                User user = DAOUser.get(result.getInt("user_id"));
                seller.setUser(user);
                seller.setName(result.getString("name"));
                seller.setManager(seller.isManager());

                listSeller.add(seller);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSeller;
    }

    //Search for a seller by name
    public static List<Seller> search(String name) throws SQLException, Exception {

        String sql = "SELECT * FROM seller WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<Seller> listSeller = null;

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

                if (listSeller == null) {
                    listSeller = new ArrayList<Seller>();
                }

                Seller seller = new Seller();

                seller.setId(result.getInt("id"));
                User user = DAOUser.get(result.getInt("user_id"));
                seller.setUser(user);
                seller.setName(result.getString("name"));
                seller.setManager(seller.isManager());

                listSeller.add(seller);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listSeller;
    }

    //Get an instance of the seller class by id
    public static Seller get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM seller WHERE (id=? AND enabled=?)";

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

                Seller seller = new Seller();

                seller.setId(result.getInt("id"));
                User user = DAOUser.get(result.getInt("user_id"));
                seller.setUser(user);
                seller.setName(result.getString("name"));
                seller.setManager(seller.isManager());

                return seller;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }

}
