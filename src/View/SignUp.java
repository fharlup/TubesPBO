package View;

import Controler.AuthController;
import Model.User;
import java.awt.Image;
import java.awt.MediaTracker;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        setTitle("Sign Up");

        
        // Disable the sign-up button initially
        SignUpButton.setEnabled(false);

        // Add a document listener to the password field
        PasswordTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validatePassword();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validatePassword();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validatePassword();
            }
        });
    }
    
    private boolean validatePassword() {
        String password = PasswordTextField.getText();

        if (password.length() < 8 || !password.matches(".*[a-zA-Z].*[0-9\\W_].*")) {
            LabelAturanPassword.setText("Use 8 or more characters with a mix of letters, numbers & symbols");
            SignUpButton.setEnabled(false);
            return false;
        } else {
            LabelAturanPassword.setText("Valid Password");
            return true;
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        UsernameTextField = new javax.swing.JTextField();
        RadioButtonDonatur = new javax.swing.JRadioButton();
        RadioButtonOrganisasi = new javax.swing.JRadioButton();
        AgreeTermsCondition = new javax.swing.JCheckBox();
        SignUpButton = new javax.swing.JButton();
        SwitchLogInMenu = new javax.swing.JLabel();
        LabelUsername = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        LabelAturanPassword = new javax.swing.JLabel();
        LabelPilihRole = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255, 100));

        SignUpLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SignUpLabel.setText("Sign Up now");

        RadioButtonDonatur.setText("Donatur");
        RadioButtonDonatur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonDonaturActionPerformed(evt);
            }
        });

        RadioButtonOrganisasi.setText("Organisasi");
        RadioButtonOrganisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonOrganisasiActionPerformed(evt);
            }
        });

        AgreeTermsCondition.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AgreeTermsCondition.setText("By creating an account, I agree to our Terms of use and Privacy Policy");
        AgreeTermsCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeTermsConditionActionPerformed(evt);
            }
        });

        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        SwitchLogInMenu.setText("Already have an account? Log In");
        SwitchLogInMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchLogInMenuMouseClicked(evt);
            }
        });

        LabelUsername.setText("Username");

        LabelEmail.setText("Email");

        LabelPassword.setText("Password");

        LabelAturanPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LabelAturanPassword.setText("Use 8 or more characters with a mix of letters, numbers & symbols");

        LabelPilihRole.setText("Choose role");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelPilihRole)
                    .addComponent(LabelAturanPassword)
                    .addComponent(LabelPassword)
                    .addComponent(LabelEmail)
                    .addComponent(LabelUsername)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SignUpButton)
                        .addGap(18, 18, 18)
                        .addComponent(SwitchLogInMenu))
                    .addComponent(SignUpLabel)
                    .addComponent(PasswordTextField)
                    .addComponent(EmailTextField)
                    .addComponent(UsernameTextField)
                    .addComponent(AgreeTermsCondition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioButtonDonatur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioButtonOrganisasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(SignUpLabel)
                .addGap(18, 18, 18)
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(LabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAturanPassword)
                .addGap(5, 5, 5)
                .addComponent(LabelPilihRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButtonDonatur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonOrganisasi)
                .addGap(11, 11, 11)
                .addComponent(AgreeTermsCondition)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpButton)
                    .addComponent(SwitchLogInMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(310, 30, 430, 460);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/IMG/Background1_1.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 10, 720, 500);

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

    private void RadioButtonDonaturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonDonaturActionPerformed
        RadioButtonOrganisasi.setSelected(false);
    }//GEN-LAST:event_RadioButtonDonaturActionPerformed

    private void RadioButtonOrganisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonOrganisasiActionPerformed
        RadioButtonDonatur.setSelected(false);
    }//GEN-LAST:event_RadioButtonOrganisasiActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        if (!AgreeTermsCondition.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please agree to the terms and conditions", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String username = UsernameTextField.getText();
        String email = EmailTextField.getText();
        String password = PasswordTextField.getText();
        String role = "";

        if (RadioButtonDonatur.isSelected()) {
            role = "donatur";
        } else if (RadioButtonOrganisasi.isSelected()) {
            role = "organisasi";
        }

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || role.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        AuthController authController = new AuthController();
        User user = new User(email, username, password, role,0) {}; 
        boolean duplicateExists = authController.checkDuplicateUser(user); 

        if (duplicateExists) {
            JOptionPane.showMessageDialog(this, "Username or Email already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        authController.insertUser(user); 

        JOptionPane.showMessageDialog(this, "Sign-Up Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void AgreeTermsConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeTermsConditionActionPerformed
        if (AgreeTermsCondition.isSelected() && validatePassword()) {
            SignUpButton.setEnabled(true);
        } else {
            SignUpButton.setEnabled(false);
        }
    }//GEN-LAST:event_AgreeTermsConditionActionPerformed

    private void SwitchLogInMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLogInMenuMouseClicked
        setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_SwitchLogInMenuMouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AgreeTermsCondition;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel LabelAturanPassword;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelPilihRole;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JRadioButton RadioButtonDonatur;
    private javax.swing.JRadioButton RadioButtonOrganisasi;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel SwitchLogInMenu;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
