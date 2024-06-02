/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.DonationController;
import Controler.OrganisasiController;
import Controler.ViewController;
import Model.PenggalanganDana;
import Model.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author asyif
 */
public class AddDonate extends javax.swing.JFrame {

    /**
     * Creates new form AddDonate
     */
    private static boolean conn = false;
    private static int idOrganisasi;
    private int idPenggalanganDana;
    private File selectedFile;
    private PenggalanganDana penggalanganDana;

    public AddDonate() {
        initComponents();
        
        OrganisasiController orgCtrl = new OrganisasiController();
        PenggalanganDana penggalangan = DonationController.getPenggalangByID(idPenggalanganDana);
        User user = orgCtrl.getById(penggalangan.getOrganisasiId());
        ImageIcon img = new ImageIcon(ViewController.blobToImage(penggalangan.getImage()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LokasiInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DeskripsiInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TargetInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Media = new javax.swing.JFileChooser();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JudulInput = new javax.swing.JTextField();
        ConfirmDonate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Lokasi");

        LokasiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LokasiInputActionPerformed(evt);
            }
        });

        jLabel4.setText("Deskripsi");

        DeskripsiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeskripsiInputActionPerformed(evt);
            }
        });

        jLabel5.setText("Target Penggalangan Dana");

        TargetInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TargetInputActionPerformed(evt);
            }
        });

        jLabel6.setText("Unggah Media");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Buat Penggalangan Dana");

        Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel2.setText("Judul");

        JudulInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulInputActionPerformed(evt);
            }
        });

        ConfirmDonate.setText("Confirm");
        ConfirmDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmDonate)
                            .addComponent(Media, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(TargetInput, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JudulInput, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LokasiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeskripsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JudulInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LokasiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeskripsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TargetInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Media, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ConfirmDonate)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaActionPerformed
        // TODO add your handling code here:
        selectedFile = Media.getSelectedFile();
    }//GEN-LAST:event_MediaActionPerformed

    private void ConfirmDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmDonateActionPerformed
        // TODO add your handling code here:
        String judul = JudulInput.getText();
        String lokasi = LokasiInput.getText();
        String deskripsi = DeskripsiInput.getText();
        String target = TargetInput.getText();

        long newTarget;
        try {
            newTarget = Long.parseLong(target);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Target must be a valid number!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (judul.isEmpty() || deskripsi.isEmpty() | lokasi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            InputStream imageStream = null;
            if (selectedFile != null) {
                imageStream = new FileInputStream(selectedFile);
            }

            PenggalanganDana newPenggalangan = new PenggalanganDana(idPenggalanganDana, judul, deskripsi, lokasi, conn, idOrganisasi, imageStream);

            boolean success = DonationController.addPenggalangan(newPenggalangan);
            if (success) {
                JOptionPane.showMessageDialog(this, "Penggalangan Dana added successfully", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add Penggalangan Dana", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to add Penggalangan Dana", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmDonateActionPerformed

    private void JudulInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JudulInputActionPerformed

    private void LokasiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LokasiInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LokasiInputActionPerformed

    private void DeskripsiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeskripsiInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeskripsiInputActionPerformed

    private void TargetInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TargetInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TargetInputActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new OrganisasiView().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDonate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton ConfirmDonate;
    private javax.swing.JTextField DeskripsiInput;
    private javax.swing.JTextField JudulInput;
    private javax.swing.JTextField LokasiInput;
    private javax.swing.JFileChooser Media;
    private javax.swing.JTextField TargetInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
