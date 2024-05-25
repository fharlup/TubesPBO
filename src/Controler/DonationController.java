package Controler;

import Database.Database;
import Model.Donasi;
import Model.PenggalanganDana;
import Model.User;
import java.io.InputStream;
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
    
    public static List<PenggalanganDana> getAllPenggalangan(){
        List<PenggalanganDana> PenggalanganList = new ArrayList<>();
        String sql = "SELECT * FROM penggalangandana";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("idPenggalangan");
                    String judul = rs.getString("judul");
                    String deskripsi = rs.getString("deskripsi");
                    String lokasi = rs.getString("lokasi");
                    boolean confirm = rs.getBoolean("confirm");
                    int organisasiId  = rs.getInt("organisasiId");
                    InputStream image = rs.getBinaryStream("photo");
                
                    PenggalanganDana penggalangan = new PenggalanganDana(id,judul, deskripsi, lokasi,confirm,organisasiId ,image);
                    PenggalanganList.add(penggalangan);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PenggalanganList;
    }
    
    public static List<Donasi> getDonasiByPenggalangan(int idPenggalang){
        List<Donasi> donasiList = new ArrayList<>();
        String sql = "SELECT * FROM donasi WHERE penggalanganId = ?";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, idPenggalang);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idDonatur = rs.getInt("userId");
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
    
    public static User getUserByID(int id){
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
                
                    User user = new User(email,username,password,role,userId);
                    return user;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static PenggalanganDana getPenggalangByID(int id){
        String sql = "SELECT * FROM penggalangandana WHERE idPenggalangan = ?";
        try (Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt("idPenggalangan");
                    String judul = rs.getString("judul");
                    String deskripsi = rs.getString("deskripsi");
                    String lokasi = rs.getString("lokasi");
                    boolean confirm = rs.getBoolean("confirm");
                    int organisasiId  = rs.getInt("organisasiId");
                    InputStream image = rs.getBinaryStream("photo");
                
                    PenggalanganDana penggalangan = new PenggalanganDana(id,judul, deskripsi, lokasi,confirm,organisasiId ,image);
                    return penggalangan;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static int getTotalDonasiPenggalangan(int id){
        int totalNominal = 0;
        List<Donasi> donasiList = getDonasiByPenggalangan(id);
        for (Donasi donasi : donasiList) {
            totalNominal += donasi.getNominal();
        }
        return totalNominal;
    }
    
    public static int getTotalDonatur(int id){
        int totalDonatur = 0;
        List<Donasi> donasiList = getDonasiByPenggalangan(id);
        for (Donasi donasi : donasiList) {
            totalDonatur++;
        }
        return totalDonatur;
    }
    
    public static boolean addDonasi(Donasi donasi){
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
    
    public static boolean addPenggalangan(PenggalanganDana penggalangan){
        String sql = "INSERT INTO penggalangandana (judul, deskripsi, lokasi, photo, confirm, organisasiId ) VALUES (?, ?, ?, ?, ?, ?)";
        try(Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, penggalangan.getJudul());
            stmt.setString(2, penggalangan.getDeskripsi());
            stmt.setString(3, penggalangan.getLokasi());
            stmt.setBinaryStream(4, penggalangan.getImage());
            stmt.setBoolean(5, penggalangan.getConfirm());
            stmt.setInt(6, penggalangan.getOrganisasiId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DonationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}