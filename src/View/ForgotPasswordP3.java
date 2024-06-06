package View;

import Controler.AuthController;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ForgotPasswordP3 extends javax.swing.JFrame {

    private boolean passwordsMatch = false;
    static String email;
    
    public ForgotPasswordP3(String email) {
        initComponents();
        this.email = email;
        setTitle("Forgot Password");

        // Disable the button initially
        ContinueFPButton.setEnabled(false);

        // Add KeyListener to ConfirmPassword field
        ConfirmPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkPasswordsMatch();
            }
        });
    }
    
    private void checkPasswordsMatch() {
        String password1 = Password.getText();
        String password2 = ConfirmPassword.getText();

        if (password1.equals(password2)) {
            LabelConfirmPassword.setText("Passwords match");
            ContinueFPButton.setEnabled(true);
        } else {
            LabelConfirmPassword.setText("Passwords do not match");
            ContinueFPButton.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        EnterEmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        ContinueFPButton = new javax.swing.JButton();
        LabelUsername = new javax.swing.JLabel();
        EmailNotFound = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SetNewPasswordLabel = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        ContinueFPButton1 = new javax.swing.JButton();
        LabelAturanPassword = new javax.swing.JLabel();
        EmailNotFound1 = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JTextField();
        LabelConfirmPassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EnterEmailLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EnterEmailLabel.setText("Enter Your Email");

        ContinueFPButton.setText("Continue");
        ContinueFPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueFPButtonActionPerformed(evt);
            }
        });

        LabelUsername.setText("Enter the email address associated with your account and we’ll  send you a link to reset your password.");

        EmailNotFound.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterEmailLabel)
                    .addComponent(EmailNotFound)
                    .addComponent(ContinueFPButton)
                    .addComponent(LabelUsername)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(EnterEmailLabel)
                .addGap(60, 60, 60)
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmailNotFound)
                .addGap(35, 35, 35)
                .addComponent(ContinueFPButton)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255, 100));

        SetNewPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SetNewPasswordLabel.setText("Set New Password");

        ContinueFPButton1.setText("Reset Password");
        ContinueFPButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueFPButton1ActionPerformed(evt);
            }
        });

        LabelAturanPassword.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        LabelAturanPassword.setText("Use 8 or more characters with a mix of letters, numbers & symbols");

        EmailNotFound1.setText(" ");

        LabelPassword.setText("Password");

        LabelConfirmPassword.setText("Confirm Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmailNotFound1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelConfirmPassword)
                    .addComponent(SetNewPasswordLabel)
                    .addComponent(ContinueFPButton1)
                    .addComponent(LabelAturanPassword)
                    .addComponent(LabelPassword)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(ConfirmPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SetNewPasswordLabel)
                .addGap(18, 18, 18)
                .addComponent(LabelAturanPassword)
                .addGap(14, 14, 14)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContinueFPButton1)
                .addGap(4, 4, 4)
                .addComponent(EmailNotFound1))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(330, 50, 365, 259);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiona\\Downloads\\Background1.png")); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 11, 720, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueFPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueFPButtonActionPerformed
        //kenapa g bs ilang yak 
    }//GEN-LAST:event_ContinueFPButtonActionPerformed

    private void ContinueFPButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueFPButton1ActionPerformed
        String newPassword = Password.getText();

        AuthController authController = new AuthController();
        boolean passwordChanged = authController.updatePassword(email, newPassword);

        if (passwordChanged) {
            JOptionPane.showMessageDialog(this, "Password updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            new LogIn().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ContinueFPButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordP3(email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmPassword;
    private javax.swing.JButton ContinueFPButton;
    private javax.swing.JButton ContinueFPButton1;
    private javax.swing.JLabel EmailNotFound;
    private javax.swing.JLabel EmailNotFound1;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel EnterEmailLabel;
    private javax.swing.JLabel LabelAturanPassword;
    private javax.swing.JLabel LabelConfirmPassword;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel SetNewPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
