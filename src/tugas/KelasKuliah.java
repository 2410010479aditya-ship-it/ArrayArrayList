package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan daftar mahasiswa menggunakan ArrayList
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Method untuk menambah mahasiswa baru ke koleksi
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung nilai rata-rata kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menampilkan semua data mahasiswa saat ini
    public void tampilkanSemua() {
        System.out.println("----------------------------------------------");
        System.out.printf("%-15s | %-12s | %-6s | %-8s\n", "Nama", "NPM", "Nilai", "Status");
        System.out.println("----------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-15s | %-12s | %-6.2f | %-8s\n", 
                    mhs.getNama(), mhs.getNpm(), mhs.getNilai(), status);
        }
        System.out.println("----------------------------------------------");
    }

    // Getter untuk mengetahui jumlah total data terbaru di ArrayList
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}