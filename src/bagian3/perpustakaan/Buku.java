package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    // Latihan 3.4 No. 2: Tambah atribut tahunTerbit
    private int tahunTerbit; 

    // Constructor yang diperbarui untuk menerima tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // Latihan 3.4 No. 2: Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Method info() yang disesuaikan untuk menampilkan tahun terbit
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}