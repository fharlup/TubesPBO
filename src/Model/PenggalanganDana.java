package Model;

import java.sql.Blob;

public class PenggalanganDana   {
    private String judul;
    private String deskripsi;
    private String lokasi;
    private boolean confirm;
    private int organisasiId;
    private Blob image;

    public PenggalanganDana(String judul, String deskripsi, String lokasi, boolean confirm, int organisasiId, Blob image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.confirm = confirm;
        this.organisasiId = organisasiId;
        this.image = image;
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
    public boolean getConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public int getOrganisasiId() {
        return organisasiId;
    }

    public void setOrganisasiId(int organisasiId) {
        this.organisasiId = organisasiId;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
    
    
}
