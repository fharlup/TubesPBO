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
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Alvan
 */
public class ListDonate extends javax.swing.JFrame {

    OrganisasiController orgCtrl = new OrganisasiController();
    public int id1;
    public int id2;
    public int id3;
    public int id4;
    public ListDonate() {
        initComponents();
        loadPenggalangan(1);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page2 = new javax.swing.JButton();
        page1 = new javax.swing.JButton();
        page3 = new javax.swing.JButton();
        page4 = new javax.swing.JButton();
        page5 = new javax.swing.JButton();
        page6 = new javax.swing.JButton();
        page7 = new javax.swing.JButton();
        page10 = new javax.swing.JButton();
        page9 = new javax.swing.JButton();
        page8 = new javax.swing.JButton();
        donasi1 = new javax.swing.JPanel();
        gmbr1 = new javax.swing.JLabel();
        judul1 = new javax.swing.JLabel();
        organisasi1 = new javax.swing.JLabel();
        progress1 = new javax.swing.JProgressBar();
        uang1 = new javax.swing.JLabel();
        donatur1 = new javax.swing.JLabel();
        donasi2 = new javax.swing.JPanel();
        gmbr2 = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        organisasi2 = new javax.swing.JLabel();
        progress2 = new javax.swing.JProgressBar();
        uang2 = new javax.swing.JLabel();
        donatur2 = new javax.swing.JLabel();
        donasi3 = new javax.swing.JPanel();
        gmbr3 = new javax.swing.JLabel();
        judul3 = new javax.swing.JLabel();
        organisasi3 = new javax.swing.JLabel();
        progress3 = new javax.swing.JProgressBar();
        uang3 = new javax.swing.JLabel();
        donatur3 = new javax.swing.JLabel();
        donasi4 = new javax.swing.JPanel();
        gmbr4 = new javax.swing.JLabel();
        judul4 = new javax.swing.JLabel();
        organisasi4 = new javax.swing.JLabel();
        progress4 = new javax.swing.JProgressBar();
        uang4 = new javax.swing.JLabel();
        donatur4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        page2.setText("2");
        page2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2ActionPerformed(evt);
            }
        });

        page1.setText("1");
        page1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1ActionPerformed(evt);
            }
        });

        page3.setText("3");
        page3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page3ActionPerformed(evt);
            }
        });

        page4.setText("4");
        page4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page4ActionPerformed(evt);
            }
        });

        page5.setText("5");
        page5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page5ActionPerformed(evt);
            }
        });

        page6.setText("6");
        page6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page6ActionPerformed(evt);
            }
        });

        page7.setText("7");
        page7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page7ActionPerformed(evt);
            }
        });

        page10.setText("10");
        page10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page10ActionPerformed(evt);
            }
        });

        page9.setText("9");
        page9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page9ActionPerformed(evt);
            }
        });

        page8.setText("8");
        page8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page8ActionPerformed(evt);
            }
        });

        donasi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donasi1MouseClicked(evt);
            }
        });

        gmbr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/346x130.png"))); // NOI18N

        judul1.setText("Judul");

        organisasi1.setText("Nama Organisasi");

        uang1.setText("Uang");

        donatur1.setText("Donatur");

        javax.swing.GroupLayout donasi1Layout = new javax.swing.GroupLayout(donasi1);
        donasi1.setLayout(donasi1Layout);
        donasi1Layout.setHorizontalGroup(
            donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(donatur1))))
        );
        donasi1Layout.setVerticalGroup(
            donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi1Layout.createSequentialGroup()
                .addComponent(gmbr1)
                .addGap(7, 7, 7)
                .addComponent(judul1)
                .addGap(7, 7, 7)
                .addComponent(organisasi1)
                .addGap(7, 7, 7)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uang1)
                    .addComponent(donatur1)))
        );

        donasi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donasi2MouseClicked(evt);
            }
        });

        gmbr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/346x130.png"))); // NOI18N

        judul2.setText("Judul");

        organisasi2.setText("Nama Organisasi");

        uang2.setText("Uang");

        donatur2.setText("Donatur");

        javax.swing.GroupLayout donasi2Layout = new javax.swing.GroupLayout(donasi2);
        donasi2.setLayout(donasi2Layout);
        donasi2Layout.setHorizontalGroup(
            donasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gmbr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(donasi2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donasi2Layout.createSequentialGroup()
                        .addGroup(donasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(donasi2Layout.createSequentialGroup()
                                .addGroup(donasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(judul2)
                                    .addComponent(organisasi2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(donasi2Layout.createSequentialGroup()
                        .addComponent(uang2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donatur2)
                        .addGap(33, 33, 33))))
        );
        donasi2Layout.setVerticalGroup(
            donasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi2Layout.createSequentialGroup()
                .addComponent(gmbr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organisasi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uang2)
                    .addComponent(donatur2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        donasi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donasi3MouseClicked(evt);
            }
        });

        gmbr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/346x130.png"))); // NOI18N

        judul3.setText("Judul");

        organisasi3.setText("Nama Organisasi");

        uang3.setText("Uang");

        donatur3.setText("Donatur");

        javax.swing.GroupLayout donasi3Layout = new javax.swing.GroupLayout(donasi3);
        donasi3.setLayout(donasi3Layout);
        donasi3Layout.setHorizontalGroup(
            donasi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gmbr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(donasi3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donasi3Layout.createSequentialGroup()
                        .addGroup(donasi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(donasi3Layout.createSequentialGroup()
                                .addGroup(donasi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(judul3)
                                    .addComponent(organisasi3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(donasi3Layout.createSequentialGroup()
                        .addComponent(uang3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donatur3)
                        .addGap(33, 33, 33))))
        );
        donasi3Layout.setVerticalGroup(
            donasi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi3Layout.createSequentialGroup()
                .addComponent(gmbr3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judul3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organisasi3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uang3)
                    .addComponent(donatur3))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        donasi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donasi4MouseClicked(evt);
            }
        });

        gmbr4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/346x130.png"))); // NOI18N

        judul4.setText("Judul");

        organisasi4.setText("Nama Organisasi");

        uang4.setText("Uang");

        donatur4.setText("Donatur");

        javax.swing.GroupLayout donasi4Layout = new javax.swing.GroupLayout(donasi4);
        donasi4.setLayout(donasi4Layout);
        donasi4Layout.setHorizontalGroup(
            donasi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gmbr4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(donasi4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donasi4Layout.createSequentialGroup()
                        .addGroup(donasi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progress4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(donasi4Layout.createSequentialGroup()
                                .addGroup(donasi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(judul4)
                                    .addComponent(organisasi4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(donasi4Layout.createSequentialGroup()
                        .addComponent(uang4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donatur4)
                        .addGap(33, 33, 33))))
        );
        donasi4Layout.setVerticalGroup(
            donasi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi4Layout.createSequentialGroup()
                .addComponent(gmbr4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judul4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organisasi4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uang4)
                    .addComponent(donatur4))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(donasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donasi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(donasi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(donasi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(page1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(donasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donasi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donasi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donasi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page2)
                    .addComponent(page1)
                    .addComponent(page3)
                    .addComponent(page5)
                    .addComponent(page4)
                    .addComponent(page6)
                    .addComponent(page7)
                    .addComponent(page8)
                    .addComponent(page9)
                    .addComponent(page10))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void page2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2ActionPerformed
        loadPenggalangan(2);
    }//GEN-LAST:event_page2ActionPerformed

    private void page3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page3ActionPerformed
        loadPenggalangan(3);
    }//GEN-LAST:event_page3ActionPerformed

    private void page5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page5ActionPerformed
        loadPenggalangan(5);
    }//GEN-LAST:event_page5ActionPerformed

    private void page6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page6ActionPerformed
        loadPenggalangan(6);
    }//GEN-LAST:event_page6ActionPerformed

    private void page7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page7ActionPerformed
        loadPenggalangan(7);
    }//GEN-LAST:event_page7ActionPerformed

    private void page10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page10ActionPerformed
        loadPenggalangan(10);
    }//GEN-LAST:event_page10ActionPerformed

    private void page9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page9ActionPerformed
        loadPenggalangan(9);
    }//GEN-LAST:event_page9ActionPerformed

    private void page8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page8ActionPerformed
        loadPenggalangan(8);
    }//GEN-LAST:event_page8ActionPerformed

    private void page1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page1ActionPerformed
        loadPenggalangan(1);
    }//GEN-LAST:event_page1ActionPerformed

    private void page4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page4ActionPerformed
        loadPenggalangan(4);
    }//GEN-LAST:event_page4ActionPerformed

    private void donasi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donasi1MouseClicked
        setVisible(false);
        new DetailDonate(id1).setVisible(true);
    }//GEN-LAST:event_donasi1MouseClicked

    private void donasi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donasi2MouseClicked
        setVisible(false);
        new DetailDonate(id2).setVisible(true);
    }//GEN-LAST:event_donasi2MouseClicked

    private void donasi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donasi3MouseClicked
        setVisible(false);
        new DetailDonate(id3).setVisible(true);
    }//GEN-LAST:event_donasi3MouseClicked

    private void donasi4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donasi4MouseClicked
        setVisible(false);
        new DetailDonate(id4).setVisible(true);
    }//GEN-LAST:event_donasi4MouseClicked

    private void loadButton(int count){
        if (count/4 == 0 || count%4 >0){
            page1.setVisible(true);
        } 
        if (count/4 == 1 || (count/4 == 1 && count%4 >0)){
            page2.setVisible(true);
        } 
        if (count/4 == 2 || (count/4 == 2 && count%4 >0)){
            page3.setVisible(true);
        } 
        if (count/4 == 3 || (count/4 == 3 && count%4 >0)){
            page4.setVisible(true);
        } 
        if (count/4 == 4 || (count/4 == 4 && count%4 >0)){
            page5.setVisible(true);
        } 
        if (count/4 == 5 || (count/4 == 5 && count%4 >0)){
            page6.setVisible(true);
        } 
        if (count/4 == 6 || (count/4 == 6 && count%4 >0)){
            page7.setVisible(true);
        } 
        if (count/4 == 7 ||(count/4 == 7 && count%4 >0)){
            page8.setVisible(true);
        } 
        if (count/4 == 8 || (count/4 == 8 && count%4 >0)){
            page9.setVisible(true);
        }
        if (count/4 == 9 || (count/4 == 9 && count%4 >0)){
            page10.setVisible(true);
        }
    }
    
    private void loadPenggalangan(int page){
        donasi1.setVisible(false);
        donasi2.setVisible(false);
        donasi3.setVisible(false);
        donasi4.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        page5.setVisible(false);
        page6.setVisible(false);
        page7.setVisible(false);
        page8.setVisible(false);
        page9.setVisible(false);
        page10.setVisible(false);
        
        List<PenggalanganDana> penggalanganList = DonationController.getAllPenggalangan();
        
        // hapus yg blom confirm
        for (int i = 0; i < penggalanganList.size(); i++) {
            if (!penggalanganList.get(i).getConfirm()) {
                penggalanganList.remove(i);
                i--;
            }
        }
        
        loadButton(penggalanganList.size());
        int startIdx = (page - 1) * 4;
        
        int idx = 0;
        int count = 0;
        if (startIdx < penggalanganList.size()) {
            loadCard1(penggalanganList.get(startIdx));
            id1 = penggalanganList.get(startIdx).getId();
            donasi1.setVisible(true);
        }
        if (startIdx + 1 < penggalanganList.size()) {
            loadCard2(penggalanganList.get(startIdx + 1));
            id2 = penggalanganList.get(startIdx+1).getId();
            donasi2.setVisible(true);
        }
        if (startIdx + 2 < penggalanganList.size()) {
            loadCard3(penggalanganList.get(startIdx + 2));
            id3 = penggalanganList.get(startIdx+2).getId();
            donasi3.setVisible(true);
        }
        if (startIdx + 3 < penggalanganList.size()) {
            loadCard4(penggalanganList.get(startIdx + 3));
            id4 = penggalanganList.get(startIdx+3).getId();
            donasi4.setVisible(true);
        }
    }
    
    private void loadCard1(PenggalanganDana obj){
        User user = orgCtrl.getById(obj.getOrganisasiId());
        ImageIcon img = new ImageIcon(ViewController.blobToImage(obj.getImage()));
        gmbr1.setIcon(img);
        judul1.setText(obj.getJudul());
        organisasi1.setText(user.getUsername());
        uang1.setText(String.valueOf(DonationController.getTotalDonasiPenggalangan(obj.getId())));
        donatur1.setText(String.valueOf(DonationController.getTotalDonatur(obj.getId()))+" Donatur");
    }
    
    private void loadCard2(PenggalanganDana obj){
        User user = orgCtrl.getById(obj.getOrganisasiId());
        ImageIcon img = new ImageIcon(ViewController.blobToImage(obj.getImage()));
        gmbr2.setIcon(img);
        judul2.setText(obj.getJudul());
        organisasi2.setText(user.getUsername());
        uang2.setText(String.valueOf(DonationController.getTotalDonasiPenggalangan(obj.getId())));
        donatur2.setText(String.valueOf(DonationController.getTotalDonatur(obj.getId()))+" Donatur");
    }
    
    private void loadCard3(PenggalanganDana obj){
        User user = orgCtrl.getById(obj.getOrganisasiId());
        ImageIcon img = new ImageIcon(ViewController.blobToImage(obj.getImage()));
        gmbr3.setIcon(img);
        judul3.setText(obj.getJudul());
        organisasi3.setText(user.getUsername());
        uang3.setText(String.valueOf(DonationController.getTotalDonasiPenggalangan(obj.getId())));
        donatur3.setText(String.valueOf(DonationController.getTotalDonatur(obj.getId()))+" Donatur");
    }
    
    private void loadCard4(PenggalanganDana obj){
        User user = orgCtrl.getById(obj.getOrganisasiId());
        ImageIcon img = new ImageIcon(ViewController.blobToImage(obj.getImage()));
        gmbr4.setIcon(img);
        judul4.setText(obj.getJudul());
        organisasi4.setText(user.getUsername());
        uang4.setText(String.valueOf(DonationController.getTotalDonasiPenggalangan(obj.getId())));
        donatur4.setText(String.valueOf(DonationController.getTotalDonatur(obj.getId()))+" Donatur");
    }
    
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
            java.util.logging.Logger.getLogger(ListDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListDonate().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel donasi1;
    private javax.swing.JPanel donasi2;
    private javax.swing.JPanel donasi3;
    private javax.swing.JPanel donasi4;
    private javax.swing.JLabel donatur1;
    private javax.swing.JLabel donatur2;
    private javax.swing.JLabel donatur3;
    private javax.swing.JLabel donatur4;
    private javax.swing.JLabel gmbr1;
    private javax.swing.JLabel gmbr2;
    private javax.swing.JLabel gmbr3;
    private javax.swing.JLabel gmbr4;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel organisasi1;
    private javax.swing.JLabel organisasi2;
    private javax.swing.JLabel organisasi3;
    private javax.swing.JLabel organisasi4;
    private javax.swing.JButton page1;
    private javax.swing.JButton page10;
    private javax.swing.JButton page2;
    private javax.swing.JButton page3;
    private javax.swing.JButton page4;
    private javax.swing.JButton page5;
    private javax.swing.JButton page6;
    private javax.swing.JButton page7;
    private javax.swing.JButton page8;
    private javax.swing.JButton page9;
    private javax.swing.JProgressBar progress1;
    private javax.swing.JProgressBar progress2;
    private javax.swing.JProgressBar progress3;
    private javax.swing.JProgressBar progress4;
    private javax.swing.JLabel uang1;
    private javax.swing.JLabel uang2;
    private javax.swing.JLabel uang3;
    private javax.swing.JLabel uang4;
    // End of variables declaration//GEN-END:variables
}
