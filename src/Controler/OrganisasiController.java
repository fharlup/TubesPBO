/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Database.Database;
import Model.Organisasi;
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
 * @author Alvan
 */
public class OrganisasiController implements UserInterface {
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
                
                    Organisasi organisasi = new Organisasi(email,username,password,role,userId);
                    return organisasi;
                }
            } catch (Exception ex) {
                Logger.getLogger(OrganisasiController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public List<User> getAll(){
        List<User> organisasiList = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE role = 'organisasi'";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("userId");
                    String role = rs.getString("role");
                    String email = rs.getString("email");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                
                    Organisasi organisasi = new Organisasi(email, username, password, role, id);
                    organisasiList.add(organisasi);
                }
            } catch (Exception ex) {
                Logger.getLogger(OrganisasiController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return organisasiList;
    }
}
