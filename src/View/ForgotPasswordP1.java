package View;

import Controler.AuthController;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;

public class ForgotPasswordP1 extends javax.swing.JFrame {

    public ForgotPasswordP1() {
        initComponents();
        
        setTitle("Forgot Password");
    

        // Disable the button initially
        ContinueFPButton.setEnabled(false);

        // Add a focus listener to the EmailTextField
        EmailTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkEmailExists();
            }
        });


    }
    
    private void checkEmailExists() {
        String email = EmailTextField.getText().trim();
        if (email.isEmpty()) {
            // Clear the label and disable the button if the email field is empty
            EmailNotFound.setText("");
            ContinueFPButton.setEnabled(false);
            return;
        }

        AuthController authController = new AuthController();
        if (authController.checkEmailExists(email)) {
            // Email exists, enable the ContinueFPButton
            EmailNotFound.setText("");
            ContinueFPButton.setEnabled(true);
        } else {
            // Email does not exist, show message in EmailNotFound label
            EmailNotFound.setText("Email doesn't exist");
            ContinueFPButton.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        EnterEmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        ContinueFPButton = new javax.swing.JButton();
        LabelUsername = new javax.swing.JLabel();
        EmailNotFound = new javax.swing.JLabel();
        LabelUsername1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255, 100));

        EnterEmailLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EnterEmailLabel.setText("Enter Your Email");

        ContinueFPButton.setText("Continue");
        ContinueFPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueFPButtonActionPerformed(evt);
            }
        });

        LabelUsername.setText("and we’ll  send you a link to reset your password.");

        EmailNotFound.setText(" ");

        LabelUsername1.setText("Enter the email address associated with your account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmailNotFound)
                .addGap(503, 503, 503))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterEmailLabel)
                    .addComponent(ContinueFPButton)
                    .addComponent(LabelUsername)
                    .addComponent(LabelUsername1)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterEmailLabel)
                .addGap(40, 40, 40)
                .addComponent(LabelUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(ContinueFPButton)
                .addGap(3, 3, 3)
                .addComponent(EmailNotFound)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(340, 110, 380, 260);

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
        String email = EmailTextField.getText().trim();
        if (!email.isEmpty()) {
            setVisible(false);
            new ForgotPasswordP3(email).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Email Kosong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ContinueFPButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueFPButton;
    private javax.swing.JLabel EmailNotFound;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel EnterEmailLabel;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JLabel LabelUsername1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
