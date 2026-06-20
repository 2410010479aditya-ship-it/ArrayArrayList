//nama: aditya effendi
//npm: 2410010479
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        
        System.out.println("==============================================");
        System.out.println("DAFTAR MATA KULIAH TERSURAT:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println("==============================================\n");

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Ahmad", "241013121001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Siti", "241013121002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "241013121003", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "244013121004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "241013121005", 90.0));

        System.out.println("Daftar Mahasiswa Awal:");
        kelas.tampilkanSemua();

        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus() + " orang");
        System.out.println();

        System.out.println("[Sistem] Menambahkan 1 mahasiswa baru...");
        Mahasiswa mhsBaru = new Mahasiswa("Fitri", "221013121006", 65.0);
        kelas.tambahMahasiswa(mhsBaru);

        System.out.println("Jumlah Data Mahasiswa Terbaru: " + kelas.getJumlahData() + " data.");
        System.out.println("\nDaftar Mahasiswa Terbaru setelah Penambahan:");
        kelas.tampilkanSemua();
        
        System.out.printf("Rata-rata Nilai Kelas Terbaru : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus Terbaru: " + kelas.jumlahLulus() + " orang");
        System.out.println("==============================================");
    }
}