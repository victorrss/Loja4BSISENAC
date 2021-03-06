package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.City;
import br.com.store.model.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOCity {

    //Inserts a City into the city table of the database
    public static void insert(City city) throws SQLException, Exception {

        String sql = "INSERT INTO city (state_id, name, enabled) VALUES (?, ?, ?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, city.getState().getId());
            stmt.setString(2, city.getName());
            stmt.setBoolean(3, true);

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs the update of the data of a city
    public static void update(City city) throws SQLException, Exception {

        String sql = "UPDATE city SET state_id=?, name=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, city.getState().getId());
            stmt.setString(2, city.getName());
            stmt.setInt(3, city.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalize(stmt, con);
        }
    }

    //Performs logical deletion of a city in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE city SET enabled=? WHERE (id=?)";

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

    //List all cities in the table city
    public static List<City> list() throws SQLException, Exception {

        String sql = "SELECT * FROM city WHERE (enabled=?)";

        List<City> listCity = null;

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

                if (listCity == null) {
                    listCity = new ArrayList<City>();
                }
                // Create a City instance and population with BD values
                City city = new City();

                city.setId(result.getInt("id"));
                State state = DAOState.get(result.getInt("state_id"));
                city.setState(state);
                city.setName(result.getString("name"));

                // Add the instance in the list
                listCity.add(city);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCity;
    }

    //List all cities in the state id
    public static List<City> list(Integer stateId) throws SQLException, Exception {

        String sql = "SELECT * FROM city WHERE  (state_id=? AND enabled=?)";

        List<City> listCity = null;

        Connection con = null;

        PreparedStatement stmt = null;

        ResultSet result = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, stateId);
            stmt.setBoolean(2, true);

            result = stmt.executeQuery();

            while (result.next()) {

                if (listCity == null) {
                    listCity = new ArrayList<City>();
                }
                // Create a City instance and population with BD values
                City city = new City();

                city.setId(result.getInt("id"));
                State state = DAOState.get(result.getInt("state_id"));
                city.setState(state);
                city.setName(result.getString("name"));

                // Add the instance in the list
                listCity.add(city);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCity;
    }

    //Search for a city by name
    public static List<City> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM city WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<City> listCity = null;

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

                if (listCity == null) {
                    listCity = new ArrayList<City>();
                }

                // Create a City instance and population with BD values
                City city = new City();

                city.setId(result.getInt("id"));
                State state = DAOState.get(result.getInt("state_id"));
                city.setState(state);
                city.setName(result.getString("name"));

                // Add the instance in the list
                listCity.add(city);
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return listCity;
    }

    //Get an instance of the city class by id
    public static City get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM city WHERE (id=? AND enabled=?)";

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

                // Create a City instance and population with BD values
                City city = new City();

                city.setId(result.getInt("id"));
                State state = DAOState.get(result.getInt("state_id"));
                city.setState(state);
                city.setName(result.getString("name"));;

                return city;
            }
        } finally {
            ConnectionUtils.finalize(result, stmt, con);
        }

        return null;
    }
}
