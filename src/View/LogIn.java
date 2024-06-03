package View;

import Controler.AuthController;
import Model.User;
import Model.UserSession;
import java.awt.Image;
import java.awt.MediaTracker;
import javax.swing.*;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        setTitle("Login");

        // Load and set the image
        ImageIcon icon = new ImageIcon(getClass().getResource("/View/IMG/Logo.png"));
        if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
            JOptionPane.showMessageDialog(this, "Image not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Image image = icon.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        jLabel1.setIcon(icon);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JTextField();
        UsernameTextField = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        SwitchSignUpMenu = new javax.swing.JLabel();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        SwitchForgotPassword = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignUpLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SignUpLabel.setText("Log In Now");

        LogInButton.setText("Log In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        SwitchSignUpMenu.setText("Don't have an account? Sign Up");
        SwitchSignUpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchSignUpMenuMouseClicked(evt);
            }
        });

        LabelUsername.setText("Username");

        LabelPassword.setText("Password");

        SwitchForgotPassword.setText("Forgot Password");
        SwitchForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchForgotPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SwitchForgotPassword)
                    .addComponent(LabelPassword)
                    .addComponent(LabelUsername)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LogInButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SwitchSignUpMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(SignUpLabel)
                .addGap(39, 39, 39)
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SwitchForgotPassword)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogInButton)
                    .addComponent(SwitchSignUpMenu))
                .addContainerGap(103, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        String username = UsernameTextField.getText();
        String password = PasswordTextField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in both username and password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        AuthController authController = new AuthController();
        User user = authController.getUserDetails(username, password);

        if (user != null) {
            System.out.println("User session: " + user.getUsername());
            UserSession.setEmail(user.getEmail());
            UserSession.setUsername(user.getUsername());
            UserSession.setPassword(user.getPassword());
            UserSession.setRole(user.getRole());
            UserSession.setId(user.getId());
            JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            String role = UserSession.getRole();
            System.out.println(role);
            if (role.matches("donatur")){
                setVisible(false);
                new ListDonate().setVisible(true);
            } else if (role.matches("organisasi")){
                setVisible(false);
                new OrganisasiView().setVisible(true);
            } else {
                setVisible(false);
                new Adminview().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void SwitchSignUpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchSignUpMenuMouseClicked
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_SwitchSignUpMenuMouseClicked

    private void SwitchForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchForgotPasswordMouseClicked
        setVisible(false);
        new ForgotPasswordP1().setVisible(true);
    }//GEN-LAST:event_SwitchForgotPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JButton LogInButton;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel SwitchForgotPassword;
    private javax.swing.JLabel SwitchSignUpMenu;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
