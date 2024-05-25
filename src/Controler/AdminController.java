/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Database.Database;
import Model.PenggalanganDana;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fajar
 */
public class AdminController {
     Database db = new Database();
    
    
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
      public boolean editPenggalangan(PenggalanganDana penggalangan, int penggalanganId) {
        String sql = "UPDATE penggalangandana SET judul = ?, deskripsi = ?, lokasi = ?, image = ?, confirm = ?, organisasiId = ? WHERE id = ?";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, penggalangan.getJudul());
            stmt.setString(2, penggalangan.getDeskripsi());
            stmt.setString(3, penggalangan.getLokasi());
            stmt.setBlob(4, penggalangan.getImage());
            stmt.setBoolean(5, penggalangan.getConfirm());
            stmt.setInt(6, penggalangan.getOrganisasiId());
            stmt.setInt(7, penggalanganId);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
