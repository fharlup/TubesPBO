package Controler;

import Database.Database;
import Model.Donasi;
import Model.PenggalanganDana;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DonationController {
    Database db = new Database();
    
    public List<PenggalanganDana> getAllPenggalangan(){
        List<PenggalanganDana> PenggalanganList = new ArrayList<>();
        String sql = "SELECT * FROM penggalangandana";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String judul = rs.getString("judul");
                    String deskripsi = rs.getString("deskripsi");
                    String lokasi = rs.getString("lokasi");
                    boolean confirm = rs.getBoolean("confirm");
                    int idOrganisasi = rs.getInt("organisasiId ");
                    Blob image = rs.getBlob("image");
                
                    PenggalanganDana penggalangan = new PenggalanganDana(judul, deskripsi, lokasi,confirm,idOrganisasi,image);
                    PenggalanganList.add(penggalangan);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PenggalanganList;
    }
    
    public List<Donasi> getDonasiByPenggalangan(int idPenggalang){
        List<Donasi> donasiList = new ArrayList<>();
        String sql = "SELECT * FROM donasi WHERE penggalanganId = ?";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, idPenggalang);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idDonatur = rs.getInt("userId ");
                    int idPenggalangan = rs.getInt("penggalanganId");
                    int nominal = rs.getInt("nominal");
                    String pesan = rs.getString("pesan");
                
                    Donasi donasi = new Donasi(idDonatur, idPenggalangan, nominal, pesan);
                    donasiList.add(donasi);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donasiList;
    }
    
    public boolean addDonasi(Donasi donasi){
        String sql = "INSERT INTO donasi (nominal, pesan, userId , penggalanganId ) VALUES (?, ?, ?, ?)";
        try(Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, donasi.getNominal());
            stmt.setString(2, donasi.getPesan());
            stmt.setInt(3, donasi.getIdDonatur());
            stmt.setInt(4, donasi.getIdPenggalangan());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean addPenggalangan(PenggalanganDana penggalangan){
        String sql = "INSERT INTO penggalangandana (judul, deskripsi, lokasi, photo, confirm, organisasiId ) VALUES (?, ?, ?, ?, ?, ?)";
        try(Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, penggalangan.getJudul());
            stmt.setString(2, penggalangan.getDeskripsi());
            stmt.setString(3, penggalangan.getLokasi());
            stmt.setBlob(4, penggalangan.getImage());
            stmt.setBoolean(4, penggalangan.getConfirm());
            stmt.setInt(4, penggalangan.getOrganisasiId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}