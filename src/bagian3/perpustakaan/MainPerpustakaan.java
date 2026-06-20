package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // Mengisi objek Buku lengkap dengan parameter tahunTerbit
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        // 1. Tampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // 2. Uji coba proses peminjaman
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        // 3. Uji Latihan 3.4 No. 1: Proses Pengembalian Buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        // 4. Uji Latihan 3.4 No. 3: Pencarian Berdasarkan Penulis
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();

        // Tampilkan status koleksi akhir
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}