package Model;

public class Donasi {
    private Donatur donatur;
    private int nominal;
    private String pesan;

    public Donasi(Donatur donatur, int nominal, String pesan) {
        this.donatur = donatur;
        this.nominal = nominal;
        this.pesan = pesan;
    }

    public Donatur getDonatur() {
        return donatur;
    }

    public void setDonatur(Donatur donatur) {
        this.donatur = donatur;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public boolean paymentMethod() {
        // Payment method logic
        return true;
    }
}
