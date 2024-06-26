/*
 * To ch    ange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.DonationController;
import static Controler.DonationController.getTotalDonasiPenggalangan;
import Controler.OrganisasiController;
import Controler.ViewController;
import Model.Donasi;
import Model.PenggalanganDana;
import Model.User;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Alvan
 */
public class DonaturDetailDonate extends javax.swing.JFrame {
    private static boolean confrim;
    private int id;
    public int id1;
    public int id2;
    public int id3;
    public int id4;
    public DonaturDetailDonate(int id) {
        initComponents();
        this.id = id;
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
        target1.setText(Integer.toString(penggalangan.getTarget()));
        
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
        
        progress1.setMinimum(0);
        progress1.setMaximum(penggalangan.getTarget());
        progress1.setValue(getTotalDonasiPenggalangan(id));
        
        loadDonasi(1);
    }
    
    private void loadDonasi(int page){
        donasiCard1.setVisible(false);
        donasiCard2.setVisible(false);
        donasiCard3.setVisible(false);
        donasiCard4.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        page5.setVisible(false);
        page6.setVisible(false);
        
        List<Donasi> donasiList = DonationController.getDonasiByPenggalangan(id);
        
        loadButton(donasiList.size());
        
        int startIdx = (page - 1) * 4;
        
        int idx = 0;
        int count = 0;
        if (startIdx < donasiList.size()) {
            loadCard1(donasiList.get(startIdx));
            id1 = donasiList.get(startIdx).getIdDonasi();
            donasiCard1.setVisible(true);
        }
        if (startIdx + 1 < donasiList.size()) {
            loadCard2(donasiList.get(startIdx + 1));
            id2 = donasiList.get(startIdx+1).getIdDonasi();
            donasiCard2.setVisible(true);
        }
        if (startIdx + 2 < donasiList.size()) {
            loadCard3(donasiList.get(startIdx + 2));
            id3 = donasiList.get(startIdx+2).getIdDonasi();
            donasiCard3.setVisible(true);
        }
        if (startIdx + 3 < donasiList.size()) {
            loadCard4(donasiList.get(startIdx + 3));
            id4 = donasiList.get(startIdx+3).getIdDonasi();
            donasiCard4.setVisible(true);
        }
    }

    private void loadButton(int count){
        if (count/4 == 0 || count%4 >= 0){
            page1.setVisible(true);
        } 
        if (count/4 > 1 || (count/4 == 1 && count%4 >0)){
            page2.setVisible(true);
        } 
        if (count/4 > 2 || (count/4 == 2 && count%4 >0)){
            page3.setVisible(true);
        } 
        if (count/4 > 3 || (count/4 == 3 && count%4 >0)){
            page4.setVisible(true);
        } 
        if (count/4 > 4 || (count/4 == 4 && count%4 >0)){
            page5.setVisible(true);
        } 
        if (count/4 > 5 || (count/4 == 5 && count%4 >0)){
            page6.setVisible(true);
        }
    }
    
    private void loadCard1(Donasi obj){
        nama1.setText(obj.getNama());
        nominal1.setText(Integer.toString(obj.getNominal()));
        pesan1.setText(obj.getPesan());
    }
    
    private void loadCard2(Donasi obj){
        nama2.setText(obj.getNama());
        nominal2.setText(Integer.toString(obj.getNominal()));
        pesan2.setText(obj.getPesan());
    }
    
    private void loadCard3(Donasi obj){
        nama3.setText(obj.getNama());
        nominal3.setText(Integer.toString(obj.getNominal()));
        pesan3.setText(obj.getPesan());
    }
    
    private void loadCard4(Donasi obj){
        nama4.setText(obj.getNama());
        nominal4.setText(Integer.toString(obj.getNominal()));
        pesan4.setText(obj.getPesan());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        paragraf1 = new javax.swing.JLabel();
        paragraf2 = new javax.swing.JLabel();
        paragraf3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lokasi3 = new javax.swing.JLabel();
        lokasi2 = new javax.swing.JLabel();
        lokasi1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        donasiCard1 = new javax.swing.JPanel();
        nama1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nominal1 = new javax.swing.JLabel();
        pesan1 = new javax.swing.JLabel();
        donasiCard2 = new javax.swing.JPanel();
        nama2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nominal2 = new javax.swing.JLabel();
        pesan2 = new javax.swing.JLabel();
        donasiCard3 = new javax.swing.JPanel();
        nama3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nominal3 = new javax.swing.JLabel();
        pesan3 = new javax.swing.JLabel();
        donasiCard4 = new javax.swing.JPanel();
        nama4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nominal4 = new javax.swing.JLabel();
        pesan4 = new javax.swing.JLabel();
        page1 = new javax.swing.JButton();
        page2 = new javax.swing.JButton();
        page3 = new javax.swing.JButton();
        page4 = new javax.swing.JButton();
        page5 = new javax.swing.JButton();
        page6 = new javax.swing.JButton();
        donasi1 = new javax.swing.JPanel();
        gmbr1 = new javax.swing.JLabel();
        judul1 = new javax.swing.JLabel();
        organisasi1 = new javax.swing.JLabel();
        progress1 = new javax.swing.JProgressBar();
        uang1 = new javax.swing.JLabel();
        donatur1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        target1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nama1.setText("Nama");

        jLabel3.setText("Berdonasi Sebesar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Rp.");

        nominal1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nominal1.setText("nominal");

        pesan1.setText("Pesan");

        javax.swing.GroupLayout donasiCard1Layout = new javax.swing.GroupLayout(donasiCard1);
        donasiCard1.setLayout(donasiCard1Layout);
        donasiCard1Layout.setHorizontalGroup(
            donasiCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasiCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(donasiCard1Layout.createSequentialGroup()
                        .addGroup(donasiCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama1)
                            .addGroup(donasiCard1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)
                                .addComponent(nominal1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        donasiCard1Layout.setVerticalGroup(
            donasiCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasiCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(nominal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesan1)
                .addGap(12, 12, 12))
        );

        jPanel1.add(donasiCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 298, -1));

        nama2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nama2.setText("Nama");

        jLabel11.setText("Berdonasi Sebesar");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Rp.");

        nominal2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nominal2.setText("nominal");

        pesan2.setText("Pesan");

        javax.swing.GroupLayout donasiCard2Layout = new javax.swing.GroupLayout(donasiCard2);
        donasiCard2.setLayout(donasiCard2Layout);
        donasiCard2Layout.setHorizontalGroup(
            donasiCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasiCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(donasiCard2Layout.createSequentialGroup()
                        .addGroup(donasiCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama2)
                            .addGroup(donasiCard2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(1, 1, 1)
                                .addComponent(nominal2)))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        donasiCard2Layout.setVerticalGroup(
            donasiCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasiCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(nominal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesan2)
                .addGap(12, 12, 12))
        );

        jPanel1.add(donasiCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, -1, -1));

        nama3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nama3.setText("Nama");

        jLabel13.setText("Berdonasi Sebesar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Rp.");

        nominal3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nominal3.setText("nominal");

        pesan3.setText("Pesan");

        javax.swing.GroupLayout donasiCard3Layout = new javax.swing.GroupLayout(donasiCard3);
        donasiCard3.setLayout(donasiCard3Layout);
        donasiCard3Layout.setHorizontalGroup(
            donasiCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasiCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(donasiCard3Layout.createSequentialGroup()
                        .addGroup(donasiCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama3)
                            .addGroup(donasiCard3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(1, 1, 1)
                                .addComponent(nominal3)))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        donasiCard3Layout.setVerticalGroup(
            donasiCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nama3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasiCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(nominal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesan3)
                .addGap(12, 12, 12))
        );

        jPanel1.add(donasiCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 199, -1, -1));

        nama4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nama4.setText("Nama");

        jLabel15.setText("Berdonasi Sebesar");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Rp.");

        nominal4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nominal4.setText("nominal");

        pesan4.setText("Pesan");

        javax.swing.GroupLayout donasiCard4Layout = new javax.swing.GroupLayout(donasiCard4);
        donasiCard4.setLayout(donasiCard4Layout);
        donasiCard4Layout.setHorizontalGroup(
            donasiCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donasiCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(donasiCard4Layout.createSequentialGroup()
                        .addGroup(donasiCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama4)
                            .addGroup(donasiCard4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(1, 1, 1)
                                .addComponent(nominal4)))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        donasiCard4Layout.setVerticalGroup(
            donasiCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasiCard4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nama4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donasiCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(nominal4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesan4)
                .addGap(12, 12, 12))
        );

        jPanel1.add(donasiCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 292, -1, -1));

        page1.setText("1");
        page1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1ActionPerformed(evt);
            }
        });
        jPanel1.add(page1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 396, -1, -1));

        page2.setText("2");
        page2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2ActionPerformed(evt);
            }
        });
        jPanel1.add(page2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 396, -1, -1));

        page3.setText("3");
        page3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page3ActionPerformed(evt);
            }
        });
        jPanel1.add(page3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 396, -1, -1));

        page4.setText("4");
        page4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page4ActionPerformed(evt);
            }
        });
        jPanel1.add(page4, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 396, -1, -1));

        page5.setText("5");
        page5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page5ActionPerformed(evt);
            }
        });
        jPanel1.add(page5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 396, -1, -1));

        page6.setText("6");
        page6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page6ActionPerformed(evt);
            }
        });
        jPanel1.add(page6, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 396, -1, -1));

        donasi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donasi1MouseClicked(evt);
            }
        });

        gmbr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/346x130.png"))); // NOI18N

        judul1.setText("Judul");

        organisasi1.setText("Nama Organisasi");

        uang1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        uang1.setText("Uang");

        donatur1.setText("Donatur");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Rp.");

        jLabel6.setText("Terkumpul dari");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Rp.");

        target1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        target1.setText("target");

        jLabel8.setText("Donatur");

        jButton1.setText("Donasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout donasi1Layout = new javax.swing.GroupLayout(donasi1);
        donasi1.setLayout(donasi1Layout);
        donasi1Layout.setHorizontalGroup(
            donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi1Layout.createSequentialGroup()
                .addComponent(gmbr1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donasi1Layout.createSequentialGroup()
                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(donasi1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(donasi1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(donasi1Layout.createSequentialGroup()
                                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(judul1)
                                    .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(donasi1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uang1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(target1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donasi1Layout.createSequentialGroup()
                                .addComponent(organisasi1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(donatur1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))))
                .addContainerGap())
        );
        donasi1Layout.setVerticalGroup(
            donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donasi1Layout.createSequentialGroup()
                .addComponent(gmbr1)
                .addGap(7, 7, 7)
                .addComponent(judul1)
                .addGap(7, 7, 7)
                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organisasi1)
                    .addComponent(donatur1)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(donasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uang1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(target1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(paragraf1)
                            .addComponent(paragraf2)
                            .addComponent(paragraf3)
                            .addComponent(jLabel2)
                            .addComponent(lokasi1)
                            .addComponent(lokasi2)
                            .addComponent(lokasi3))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back)
                            .addComponent(donasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(4, 4, 4))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new DonaturListDonate().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void page1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page1ActionPerformed
        loadDonasi(1);
    }//GEN-LAST:event_page1ActionPerformed

    private void page2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2ActionPerformed
        loadDonasi(2);
    }//GEN-LAST:event_page2ActionPerformed

    private void page3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page3ActionPerformed
        loadDonasi(3);
    }//GEN-LAST:event_page3ActionPerformed

    private void page4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page4ActionPerformed
        loadDonasi(4);
    }//GEN-LAST:event_page4ActionPerformed

    private void page5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page5ActionPerformed
        loadDonasi(5);
    }//GEN-LAST:event_page5ActionPerformed

    private void page6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page6ActionPerformed
        loadDonasi(6);
    }//GEN-LAST:event_page6ActionPerformed

    private void donasi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donasi1MouseClicked
        setVisible(false);
        new DonaturDetailDonate(id1).setVisible(true);
    }//GEN-LAST:event_donasi1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new DonaturPayment(id).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DonaturDetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonaturDetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonaturDetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonaturDetailDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonaturDetailDonate(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel donasi1;
    private javax.swing.JPanel donasiCard1;
    private javax.swing.JPanel donasiCard2;
    private javax.swing.JPanel donasiCard3;
    private javax.swing.JPanel donasiCard4;
    private javax.swing.JLabel donatur1;
    private javax.swing.JLabel gmbr1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel lokasi1;
    private javax.swing.JLabel lokasi2;
    private javax.swing.JLabel lokasi3;
    private javax.swing.JLabel nama1;
    private javax.swing.JLabel nama2;
    private javax.swing.JLabel nama3;
    private javax.swing.JLabel nama4;
    private javax.swing.JLabel nominal1;
    private javax.swing.JLabel nominal2;
    private javax.swing.JLabel nominal3;
    private javax.swing.JLabel nominal4;
    private javax.swing.JLabel organisasi1;
    private javax.swing.JButton page1;
    private javax.swing.JButton page2;
    private javax.swing.JButton page3;
    private javax.swing.JButton page4;
    private javax.swing.JButton page5;
    private javax.swing.JButton page6;
    private javax.swing.JLabel paragraf1;
    private javax.swing.JLabel paragraf2;
    private javax.swing.JLabel paragraf3;
    private javax.swing.JLabel pesan1;
    private javax.swing.JLabel pesan2;
    private javax.swing.JLabel pesan3;
    private javax.swing.JLabel pesan4;
    private javax.swing.JProgressBar progress1;
    private javax.swing.JLabel target1;
    private javax.swing.JLabel uang1;
    // End of variables declaration//GEN-END:variables
}
