package Model;

public class Organisasi extends User {
    private String idOrganisasi;
    private PenggalanganDana[] arrPenggalanganDana;

    public Organisasi(String idOrganisasi, String email, String username, String password) {
        super(email, username, password);
        this.idOrganisasi = idOrganisasi;
        this.arrPenggalanganDana = new PenggalanganDana[10]; // Example size, adjust as needed
    }

    @Override
    public void createAccount() {
        System.out.println("Organisasi account created with ID: " + idOrganisasi);
    }

    public void BuatPenggalanganDana() {
        // Create fundraising campaign logic
    }

    public void lihatPenggalanganDana() {
        // View fundraising campaign logic
    }

    public void editPenggalanganDana() {
        // Edit fundraising campaign logic
    }
}
