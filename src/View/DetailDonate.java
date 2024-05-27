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
import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author Alvan
 */
public class DetailDonate extends javax.swing.JFrame {
    private static boolean confrim;
    private static int id;
    public DetailDonate(int id) {
        initComponents();
        OrganisasiController orgCtrl = new OrganisasiController();
        PenggalanganDana penggalangan = DonationController.getPenggalangByID(id);
        PenggalanganDana kon = DonationController.getPenggalangByConfirm(confrim);
        System.out.println("penggalandanda");
        System.out.println(penggalangan);
        System.out.println("cacacacaca");
        System.out.println(kon);
        User user = orgCtrl.getById(penggalangan.getOrganisasiId());
        ImageIcon img = new ImageIcon(ViewController.blobToImage(penggalangan.getImage()));
        
        gmbr1.setIcon(img);
        judul1.setText(penggalangan.getJudul());
        organisasi1.setText(user.getUsername());
        uang1.setText(String.valueOf(DonationController.getTotalDonasiPenggalangan(penggalangan.getId())));
        donatur1.setText(String.valueOf(DonationController.getTotalDonatur(penggalangan.getId()))+" Donatur");
        
        String[] deskripsi = penggalangan.getDeskripsi().split("(?<=\\G.{100})");
        paragraf2.setVisible(false);
        paragraf3.setVisible(false);
        
        System.out.println(deskripsi.length);
        paragraf1.setText(deskripsi[0]);
        if (deskripsi.length==2){
            paragraf2.setVisible(true);
            paragraf2.setText(deskripsi[1]);    
        }
        if (deskripsi.length==3){
            paragraf2.setVisible(true);
            paragraf3.setVisible(true);
            paragraf2.setText(deskripsi[1]);  
            paragraf3.setText(deskripsi[2]);    
        }
        
        String[] lokasi = penggalangan.getLokasi().split("(?<=\\G.{100})");
        lokasi2.setVisible(false);
        lokasi3.setVisible(false);
        
        System.out.println(deskripsi.length);
        lokasi1.setText(lokasi[0]);
        if (lokasi.length==2){
            lokasi2.setVisible(true);
            lokasi2.setText(lokasi[1]);    
        }
        if (lokasi.length==3){
            lokasi2.setVisible(true);
            lokasi3.setVisible(true);
            lokasi2.setText(lokasi[1]);  
            lokasi3.setText(lokasi[2]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donasi1 = new javax.swing.JPanel();
        gmbr1 = new javax.swing.JLabel();
        judul1 = new javax.swing.JLabel();
        organisasi1 = new javax.swing.JLabel();
        progress1 = new javax.swing.JProgressBar();
        uang1 = new javax.swing.JLabel();
        donatur1 = new javax.swing.JLabel();
        donate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paragraf1 = new javax.swing.JLabel();
        paragraf2 = new javax.swing.JLabel();
        paragraf3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lokasi3 = new javax.swing.JLabel();
        lokasi2 = new javax.swing.JLabel();
        lokasi1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gmbr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/346x130.png"))); // NOI18N

        judul1.setText("Judul");

        organisasi1.setText("Nama Organisasi");

        uang1.setText("Uang");

        donatur1.setText("Donatur");

        donate.setText("Donasi");
        donate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout donasi1Layout = new javax.swing.GroupLayout(donasi1);
        donasi1.setLayout(donasi1Layout);
        donasi1Layout.setHorizontalGroup(
            donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi1Layout.createSequentialGroup()
                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gmbr1)
                    .addGroup(donasi1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judul1)
                            .addComponent(organisasi1)
                            .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(donasi1Layout.createSequentialGroup()
                                .addComponent(uang1)
                                .addGap(227, 227, 227)
                                .addComponent(donatur1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(donate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        donasi1Layout.setVerticalGroup(
            donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi1Layout.createSequentialGroup()
                .addComponent(gmbr1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(judul1)
                .addGap(7, 7, 7)
                .addComponent(organisasi1)
                .addGap(7, 7, 7)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uang1)
                    .addComponent(donatur1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donate)
                .addContainerGap())
        );

        jLabel1.setText("Detail");

        paragraf1.setText("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        paragraf2.setText("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        paragraf3.setText("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setText("Lokasi");

        lokasi3.setText("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        lokasi2.setText("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        lokasi1.setText("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        jLabel3.setText("edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)))
                        .addGap(133, 133, 133)
                        .addComponent(donasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(paragraf1)
                    .addComponent(paragraf2)
                    .addComponent(paragraf3)
                    .addComponent(jLabel2)
                    .addComponent(lokasi1)
                    .addComponent(lokasi2)
                    .addComponent(lokasi3))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(donasi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paragraf1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paragraf2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paragraf3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasi3)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new ListDonate().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void donateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateActionPerformed
    
    }//GEN-LAST:event_donateActionPerformed

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
            java.util.logging.Logger.getLogger(DetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailDonate(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel donasi1;
    private javax.swing.JButton donate;
    private javax.swing.JLabel donatur1;
    private javax.swing.JLabel gmbr1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel lokasi1;
    private javax.swing.JLabel lokasi2;
    private javax.swing.JLabel lokasi3;
    private javax.swing.JLabel organisasi1;
    private javax.swing.JLabel paragraf1;
    private javax.swing.JLabel paragraf2;
    private javax.swing.JLabel paragraf3;
    private javax.swing.JProgressBar progress1;
    private javax.swing.JLabel uang1;
    // End of variables declaration//GEN-END:variables
}
