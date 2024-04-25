package Controler;

import Model.*;

public class UserController {
    private UserModel userModel;

    public UserController(UserModel userModel) {
        this.userModel = userModel;
    }

    public void createDonaturAccount(String idDonatur, String email, String username, String password) {
        userModel.createDonaturAccount(idDonatur, email, username, password);
    }
    
    public void createAdminAccount(String idAdmin, String email, String username, String password) {
        userModel.createAdminAccount(idAdmin, email, username, password);
    }

    public void createOrganisasiAccount(String idOrganisasi, String email, String username, String password) {
        userModel.createOrganisasiAccount(idOrganisasi, email, username, password);
    }

    public void login(String username, String password) {
        // Login logic
    }

    public void logout(String username) {
        // Logout logic
    }

    public void showUsersByRole(String role) {
        // Show users by role logic
    }
}