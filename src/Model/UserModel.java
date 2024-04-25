package Model;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private List<User> users;

    public UserModel() {
        users = new ArrayList<>();
    }

    public void createDonaturAccount(String idDonatur, String email, String username, String password) {
        users.add(new Donatur(idDonatur, email, username, password));
        System.out.println("Donatur account created with ID: " + idDonatur);
    }

    public void createAdminAccount(String idAdmin, String email, String username, String password) {
        users.add(new Admin(idAdmin, email, username, password));
        System.out.println("Admin account created with ID: " + idAdmin);
    }

    public void createOrganisasiAccount(String idOrganisasi, String email, String username, String password) {
        users.add(new Organisasi(idOrganisasi, email, username, password));
        System.out.println("Organisasi account created with ID: " + idOrganisasi);
    }

    public List<User> getUsers() {
        return users;
    }
}
