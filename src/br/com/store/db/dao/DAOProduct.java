package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOProduct {

    public static void insert(Product product) throws SQLException {
        Connection con = null;
        try {
            con = ConnectionUtils.getConnection();

            String sql = "INSERT INTO "
                    + "product (brand, category, subcategory, name, barcode, description, warranty, model, picture, enable, stock, price) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setObject(1, product.getBrand());
            stmt.setObject(2, product.getCategory());
            stmt.setObject(3, product.getSubCategory());
            stmt.setString(4, product.getName());
            stmt.setString(5, product.getBarCode());
            stmt.setString(6, product.getDescription());
            stmt.setInt(7, product.getWarranty());
            stmt.setString(8, product.getModel());
            stmt.setBytes(9, product.getPicture());
            stmt.setBoolean(10, product.isEnable());
            stmt.setInt(11, product.getStock());
            stmt.setFloat(12, product.getPrice());

            stmt.executeUpdate();
        } finally {
            ConnectionUtils.closeConnection(con);
        }
    }

}
