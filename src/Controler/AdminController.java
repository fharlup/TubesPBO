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

  

  
     private static int clickedPenggalanganId;

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
