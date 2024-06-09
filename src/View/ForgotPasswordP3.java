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
        ContinueFPButton1.setEnabled(false);

        // Add KeyListener to Password and ConfirmPassword fields
        Password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkPasswordsMatch();
            }
        });
        ConfirmPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkPasswordsMatch();
            }
        });
    }
    
    private boolean checkPasswordsMatch() {
        String password1 = Password.getText();
        String password2 = ConfirmPassword.getText();

        if (!password1.isEmpty() && password1.equals(password2)) {
            LabelConfirmPassword.setText("Passwords match");
            ContinueFPButton1.setEnabled(true);
            return true;
        } else {
            LabelConfirmPassword.setText("Passwords do not match");
            ContinueFPButton1.setEnabled(false);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        SetNewPasswordLabel = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        ContinueFPButton1 = new javax.swing.JButton();
        LabelAturanPassword = new javax.swing.JLabel();
        EmailNotFound1 = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JTextField();
        LabelConfirmPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
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
                .addComponent(EmailNotFound1)
                .addGap(22, 22, 22))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/Background1_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueFPButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueFPButton1ActionPerformed
        if (!checkPasswordsMatch()) {
            JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
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
    private javax.swing.JButton ContinueFPButton1;
    private javax.swing.JLabel EmailNotFound1;
    private javax.swing.JLabel LabelAturanPassword;
    private javax.swing.JLabel LabelConfirmPassword;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel SetNewPasswordLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
