package Controler;

import Database.Database;
import Model.Admin;
import Model.Donatur;
import Model.Organisasi;
import Model.User;
import Model.UserSession; // Import the UserSession class
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AuthController {

    public boolean checkEmailExists(String email) {
        boolean exists = false;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                String sql = "SELECT * FROM user WHERE email = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, email);
                ResultSet resultSet = statement.executeQuery();

                exists = resultSet.next();

                resultSet.close();
                statement.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return exists;
    }

    public boolean checkCredentials(String username, String password) {
        boolean isValid = false;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
                ResultSet resultSet = statement.executeQuery();

                isValid = resultSet.next();

                resultSet.close();
                statement.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return isValid;
    }

    public boolean checkDuplicateUser(User user) {
        boolean exists = false;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                String sql = "SELECT * FROM user WHERE username = ? OR email = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getEmail());
                ResultSet resultSet = statement.executeQuery();

                exists = resultSet.next();

                resultSet.close();
                statement.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return exists;
    }

    public void insertUser(User user) {
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                String sql = "INSERT INTO user (username, email, password, role) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getPassword());
                statement.setString(4, user.getRole());

                statement.executeUpdate();
                statement.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean updatePassword(String email, String newPassword) {
        boolean passwordChanged = false;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                String sql = "UPDATE user SET password = ? WHERE email = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, newPassword);
                statement.setString(2, email);

                int rowsUpdated = statement.executeUpdate();
                passwordChanged = rowsUpdated > 0;

                statement.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return passwordChanged;
    }
    
    public User getUserDetails(String username, String password) {
        Donatur donatur = null;
        Admin admin = null;
        Organisasi organisasi = null;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                

                String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
                
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
                

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    int id = resultSet.getInt("userId");
                    String email = resultSet.getString("email");
                    String role = resultSet.getString("role");
                    if (role.matches("donatur")){
                        donatur = new Donatur(email, username, password, role, id);
                        donatur.setId(id);
                        return donatur;
                    } else if (role.matches("donatur")){
                        organisasi = new Organisasi(email, username, password, role, id);
                        organisasi.setId(id);
                        return organisasi
                                ;
                    } else {
                        admin = new Admin(email, username, password, role, id);
                        admin.setId(id);
                        return admin;
                    }

                } else {
                    System.out.println("No user found with the given username and password");
                }

                resultSet.close();
                statement.close();
            } else {
                System.out.println("Connection failed");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
