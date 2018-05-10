package br.com.store.db.dao;

import br.com.store.db.util.ConnectionUtils;
import br.com.store.model.DocumentType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAODocumentType {

    //Inserts a document type into the document_type table of the database
    public static void insert(DocumentType documentType) throws SQLException, Exception {

        String sql = "INSERT INTO document_type (name) VALUES (?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, documentType.getName());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs the update of the data of a document type
    public static void update(DocumentType documentType)
            throws SQLException, Exception {

        String sql = "UPDATE document_type SET name=? WHERE (id=?)";

        Connection con = null;

        PreparedStatement stmt = null;
        try {
            //Opens a connection to the DB
            con = ConnectionUtils.getConnection();
            //Creates a statement for SQL commands
            stmt = con.prepareStatement(sql);

            //Configures the parameters of the "PreparedStatement"
            stmt.setString(1, documentType.getName());
            stmt.setInt(2, documentType.getId());

            //Executes the command in the DB
            stmt.execute();
        } finally {
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //Performs logical deletion of a document type in the DB
    public static void delete(Integer id) throws SQLException, Exception {

        String sql = "UPDATE document_type SET enabled=? WHERE (id=?)";

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
            ConnectionUtils.finalizeStatementConnection(stmt, con);
        }
    }

    //List all document types in the table document_type
    public static List<DocumentType> list(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM document_type WHERE enabled =?";

        List<DocumentType> listDocumentType = null;

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

                if (listDocumentType == null) {
                    listDocumentType = new ArrayList<DocumentType>();
                }

                DocumentType documentType = new DocumentType();
                documentType.setId(result.getInt("id"));
                documentType.setName(result.getString("name"));

                listDocumentType.add(documentType);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listDocumentType;
    }

    //Search for a document type by name
    public static List<DocumentType> search(String value) throws SQLException, Exception {

        String sql = "SELECT * FROM document_type WHERE (UPPER(name) LIKE UPPER(?) AND enabled=?)";

        List<DocumentType> listDocumentType = null;

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

                if (listDocumentType == null) {
                    listDocumentType = new ArrayList<DocumentType>();
                }

                DocumentType documentType = new DocumentType();
                documentType.setId(result.getInt("id"));
                documentType.setName(result.getString("name"));

                listDocumentType.add(documentType);
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return listDocumentType;
    }

    //Get an instance of the document type class by id
    public static DocumentType get(Integer id) throws SQLException, Exception {

        String sql = "SELECT * FROM document_type WHERE (id=? AND enabled=?)";

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

                DocumentType documentType = new DocumentType();
                documentType.setId(result.getInt("id"));
                documentType.setName(result.getString("name"));

                return documentType;
            }
        } finally {
            ConnectionUtils.finalizeResultsetStatementConnection(result, stmt, con);
        }

        return null;
    }
}
