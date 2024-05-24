import Controler.UserController;
import Database.Database;
import Model.*;
import View.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            Database db = new Database();
            db.query("insert into user (role,email,username,password)values ('donatur','tes','tes','test')");
            ResultSet rs = db.getData("select * from user");
            try {
                if (rs.next()){
                    System.out.println(rs.getString("username"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
    }

}