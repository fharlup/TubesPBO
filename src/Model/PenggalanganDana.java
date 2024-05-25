package Model;

import java.io.InputStream;

public class PenggalanganDana {
    private String judul;
    private String deskripsi;
    private String lokasi;
    private boolean confirm;
    private int organisasiId;
    private InputStream image;

    public PenggalanganDana(String judul, String deskripsi, String lokasi, boolean confirm, int organisasiId, InputStream image) {
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

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }
}
