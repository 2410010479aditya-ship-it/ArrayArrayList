package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    System.out.println("Buku '" + judul + "' sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println("Buku '" + judul + "' berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // Latihan 3.4 No. 1: Method kembalikanBuku
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    b.setDipinjam(false);
                    System.out.println("Buku '" + judul + "' telah dikembalikan.");
                } else {
                    System.out.println("Buku '" + judul + "' memang tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // Latihan 3.4 No. 3: Method cariPenulis
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Buku Karya: " + penulis + " ==");
        boolean ditemukan = false;
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang ditemukan dari penulis tersebut.");
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}