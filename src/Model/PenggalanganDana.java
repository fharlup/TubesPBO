package Model;

public class PenggalanganDana   {
    private String judul;
    private String deskripsi;
    private Donasi[] arrDonasi;
    private String lokasi;
    private String photo;
    private boolean confirm;

    public PenggalanganDana(String judul, String deskripsi, String lokasi, String photo,Donasi newdonasi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.photo = photo;
        this.confirm = false; 
        this.arrDonasi = new Donasi[10]; 
        
        
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int hitungTotal() {
        // Calculate total donation amount logic
        
        int total=0;
        for (Donasi d : arrDonasi){
            total=+d.getNominal();

        }

            return total;
        
    }

    public boolean getConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }
}
