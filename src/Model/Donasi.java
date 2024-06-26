package Model;

public class Donasi {
    private final int idDonatur;
    private final int idPenggalangan;
    private final int idDonasi;
    private int nominal;
    private String pesan;
    private String metodePembayaran;
    private String nama;

    public Donasi(int idDonatur, int idPenggalangan, int idDonasi, int nominal, String pesan, String metodePembayaran, String nama) throws Exception {
        if (nominal>1000000000){
            throw new Exception("Batas maksimal donasi adalah Rp1.000.000.000");
        }
        if(pesan.length()>100){
            throw new Exception("Panjang pesan tidak boleh lebih dari 256");
        }
        if (metodePembayaran == null){
            throw new Exception("Pilih Metode Pembayaran");
        }
        this.idDonatur = idDonatur;
        this.idPenggalangan = idPenggalangan;
        this.idDonasi = idDonasi;
        this.nominal = nominal;
        this.pesan = pesan;
        this.metodePembayaran = metodePembayaran;
        this.nama = nama;
    }

    public int getIdDonasi() {
        return idDonasi;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
