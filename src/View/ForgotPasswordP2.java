package View;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ForgotPasswordP2 extends javax.swing.JFrame {

    static String email;
    
    public ForgotPasswordP2(String email) {
        initComponents();
        this.email = email;
        setTitle("Forgot Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PasswordResetLabel = new javax.swing.JLabel();
        OTPlTextField = new javax.swing.JTextField();
        ContinueFPButton = new javax.swing.JButton();
        WeSent = new javax.swing.JLabel();
        EmailNotFound = new javax.swing.JLabel();
        BackLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255, 100));

        PasswordResetLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PasswordResetLabel.setText("Password Reset");

        ContinueFPButton.setText("Submit");
        ContinueFPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueFPButtonActionPerformed(evt);
            }
        });

        WeSent.setText("We sent a code to your email");

        EmailNotFound.setText(" ");

        BackLabel.setText("Back");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmailNotFound)
                .addGap(384, 384, 384))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackLabel)
                    .addComponent(ContinueFPButton)
                    .addComponent(WeSent)
                    .addComponent(PasswordResetLabel)
                    .addComponent(OTPlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(BackLabel)
                .addGap(18, 18, 18)
                .addComponent(PasswordResetLabel)
                .addGap(63, 63, 63)
                .addComponent(WeSent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OTPlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ContinueFPButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailNotFound))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(340, 60, 236, 273);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiona\\Downloads\\Background1.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 11, 720, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueFPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueFPButtonActionPerformed
        String OTP = OTPlTextField.getText();
        if ("1111".equals(OTP)) {
            setVisible(false);
            new ForgotPasswordP3(email).setVisible(true);
        } else {
            // Show a popup indicating that the OTP is not valid
            JOptionPane.showMessageDialog(this, "Invalid OTP", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ContinueFPButtonActionPerformed

    private void BackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelMouseClicked
        setVisible(false);
        new ForgotPasswordP1().setVisible(true);
    }//GEN-LAST:event_BackLabelMouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPasswordP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordP2(email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JButton ContinueFPButton;
    private javax.swing.JLabel EmailNotFound;
    private javax.swing.JTextField OTPlTextField;
    private javax.swing.JLabel PasswordResetLabel;
    private javax.swing.JLabel WeSent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
