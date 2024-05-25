package Controler;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AuthController {

    public boolean checkEmailExists(String email) {
        boolean exists = false;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                // Check if email exists
                String sql = "SELECT * FROM users WHERE email = ?";
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
                // Check if username and password match
                String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
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

    public boolean checkDuplicateUser(String username, String email) {
        boolean exists = false;
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                // Check for duplicate username or email
                String sql = "SELECT * FROM users WHERE username = ? OR email = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, email);
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

    public void insertUser(String username, String email, String password, String role) {
        try (Connection connection = Database.getConnection()) {
            if (connection != null) {
                // Insert new user
                String sql = "INSERT INTO users (username, email, password, role) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, email);
                statement.setString(3, password);
                statement.setString(4, role);

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
                // Update password for the given email
                String sql = "UPDATE users SET password = ? WHERE email = ?";
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
}
