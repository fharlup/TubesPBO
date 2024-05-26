/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Database.Database;
import Model.Admin;
import Model.PenggalanganDana;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fajar
 */
public class AdminController implements UserInterface{
    
    private static int clickedPenggalanganId;

    @Override
    public User getById(int id){
        String sql = "SELECT * FROM user WHERE userId = ?";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String role = rs.getString("role");
                    String email = rs.getString("email");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    int userId = rs.getInt("userId");
                
                    Admin admin = new Admin(email,username,password,role,userId);
                    return admin;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public List<User> getAll(){
        List<User> adminList = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE role = 'admin'";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("userId");
                    String role = rs.getString("role");
                    String email = rs.getString("email");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                
                    Admin admin = new Admin(email, username, password, role, id);
                    adminList.add(admin);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adminList;
    }
    
    public boolean updateConfirm(int penggalanganId){
        String sql = "UPDATE penggalangandana SET confirm = true WHERE id = ?";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, penggalanganId);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Metode untuk menyimpan ID penggalangan yang diklik
    public static void setClickedPenggalanganId(int id) {
        clickedPenggalanganId = id;
    }

    // Metode untuk mengambil ID penggalangan yang diklik
    public static int getClickedPenggalanganId() {
        return clickedPenggalanganId;
    }

    // Implementasi metode yang tidak digunakan jika tidak diperlukan
    public static int getDonasiByPenggalanganId(int idPenggalangan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
