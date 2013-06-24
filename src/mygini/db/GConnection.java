package mygini.db;

/**
 *
 * @author urbanspieces
 */
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GConnection {

    private Connection gc = null;

    public GConnection() {
        this("root", "", "localhost", "3306", "gini_dat");
    }

    public GConnection(String dbUser, String dbPassword) {
        this(dbUser, dbPassword, "localhost", "3306", "gini_dat");
    }

    public GConnection(String dbUser, String dbPassword, String dbHost, String dbPort, String dbName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://" + dbHost + "/" + dbName;
            //Set the properties for the database connection
            Properties prop = new Properties();
            prop.put("user", dbUser);
            prop.put("password", dbPassword);
            prop.put("useUnicode", "true");
            prop.put("characterEncoding", "utf8");
            prop.put("characterSetResults", "utf8");
            prop.put("connectionCollation", "utf8_general_ci");
            //Get the connection
            this.gc = DriverManager.getConnection(dbURL, prop);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("An Error Occured");
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.gc;
    }

    public java.sql.ResultSet getResultSet(String sql) {
        java.sql.Statement stmt = null;
        java.sql.ResultSet rs = null;
        try {
            stmt = gc.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return rs;
        }
    }

    public void close(java.sql.Statement stmt) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
    }

    public void close(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }

    public void destroy() throws SQLException {
        if (gc != null) {
            gc.close();
        }
    }
}
