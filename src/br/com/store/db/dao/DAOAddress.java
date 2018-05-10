package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOAddress {
    
    //Inserts a Address into the address table of the database
    public static void insert(Address address) throws SQLException, Exception {

        String sql = "INSERT INTO "
                + "address (publicplace_type_id, city_id, publicplace, number, complement, district, zipcode, enabled)"
                + "  VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setInt(1, address.getPublicPlaceType().getId());
            stmt.setInt(2, address.getCity().getId());
            stmt.setString(3, address.getPublicPlace());
            stmt.setInt(4, address.getNumber());
            stmt.setString(5, address.getComplement());
            stmt.setString(6, address.getDistrict());
            stmt.setInt(7, address.getZipcode());
            stmt.setBoolean(8, true);

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }
    
}
