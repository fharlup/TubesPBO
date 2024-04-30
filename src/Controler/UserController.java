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

    public boolean login(String email, String password) {
        boolean loggedIn = userModel.login(email, password);
        if (loggedIn) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        return loggedIn;
    }

    public void logout(String username) {
        //return userLoginView on view
    }

    public void showUsersByRole(String role) {
        // Show users by role logic
    }

    public void register(String email, String password, String role) {
        if (role.equalsIgnoreCase("donatur")) {
            userModel.createDonaturAccount(generateId(), email, email, password);
        } else if (role.equalsIgnoreCase("organisasi")) {
            userModel.createOrganisasiAccount(generateId(), email, email, password);
        } else {
            System.out.println("Unsupported user role: " + role);
        }
    }

    private String generateId() {
        return "TEST1S";
    }
}
