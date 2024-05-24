package Model;

public class Donasi {
    private final int idDonatur;
    private final int idPenggalangan;
    private int nominal;
    private String pesan;

    public Donasi(int idDonatur, int idPenggalangan, int nominal, String pesan) {
        this.idDonatur = idDonatur;
        this.idPenggalangan = idPenggalangan;
        this.nominal = nominal;
        this.pesan = pesan;
    }

    public int getIdDonatur() {
        return idDonatur;
    }
    
    public int getIdPenggalangan() {
        return idPenggalangan;
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
}
