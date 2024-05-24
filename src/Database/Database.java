package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static final String DB_URL="jdbc:mysql://127.0.0.1/pbo";
    private static final String DB_USER ="root";
    private static final String DB_PASS="";
    private static Connection conn;
    
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
