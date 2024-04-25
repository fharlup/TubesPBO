package Model;

public class Admin extends User {
    private String idAdmin;

    public Admin(String idAdmin, String email, String username, String password) {
        super(email, username, password);
        this.idAdmin = idAdmin;
    }

    @Override
    public void createAccount() {
        System.out.println("Admin account created with ID: " + idAdmin);
    }

    public boolean verifyPenggalanganDana(PenggalanganDana penggalanganDana) {
        // Verification logic
        return true;
    }

    public PenggalanganDana editPenggalanganDana(PenggalanganDana penggalanganDana) {
        // Edit logic
        return penggalanganDana;
    }
}
