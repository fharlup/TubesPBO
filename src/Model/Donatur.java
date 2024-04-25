package Model;

public class Donatur extends User {
    private String idDonatur;

    public Donatur(String idDonatur, String email, String username, String password) {
        super(email, username, password);
        this.idDonatur = idDonatur;
    }

    @Override
    public void createAccount() {
        System.out.println("Donatur account created with ID: " + idDonatur);
    }

    public void berdonasi() {
        // Donation logic
    }

    public void lihatPenggalanganDana() {
        // View fundraising campaign logic
    }

    public void pembayaran() {
        // Payment logic
    }
}
