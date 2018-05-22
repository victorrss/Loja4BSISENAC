package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOState {

    //Inserts a State into the state table of the database
    public static void insert(State state) throws SQLException, Exception {

        String sql = "INSERT INTO state (name, abbreviation, enabled) VALUES (?, ?, ?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, state.getName());
            stmt.setString(2, state.getAbbreviation());
            stmt.setBoolean(3, true);

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a state
    public static void update(State state) throws SQLException, Exception {

        String sql = "UPDATE state SET name=?, abbreviation=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, state.getName());
            stmt.setString(2, state.getAbbreviation());
            stmt.setInt(3, state.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs logical deletion of a state in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE state SET enabled=? WHERE (id=?)";

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
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //List all states in the table state
    public static List<State> list() throws SQLException, Exception {

        String sql = "SELECT * FROM state WHERE (enabled =?)";

        List<State> listState = null;

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

                if (listState == null) {
                    listState = new ArrayList<State>();
                }
                // Create a State instance and population with BD values
                State state = new State();

                state.setId(result.getInt("id"));
                state.setName(result.getString("name"));
                state.setAbbreviation("abbreviation");

                // Add the instance in the list
                listState.add(state);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listState;
    }

    //Search for a state by name
    public static List<State> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM state WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<State> listState = null;

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

                if (listState == null) {
                    listState = new ArrayList<State>();
                }

                // Create a State instance and population with BD values
                State state = new State();

                state.setId(result.getInt("id"));
                state.setName(result.getString("name"));
                state.setAbbreviation("abbreviation");

                // Add the instance in the list
                listState.add(state);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listState;
    }

    //Get an instance of the state class by id
    public static State get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM state WHERE (id=? AND enabled=?)";

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

                // Create a State instance and population with BD values
                State state = new State();

                state.setId(result.getInt("id"));
                state.setName(result.getString("name"));
                state.setAbbreviation("abbreviation");

                return state;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }
}
