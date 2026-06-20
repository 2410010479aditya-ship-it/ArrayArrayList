package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList1 {
    public static void main(String[] args) {
        // 1. Buat ArrayList<String> daftar belanja
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Tambah 4 item
        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Telur");
        daftarBelanja.add("Gula");
        
        // Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);
        
        // Tampilkan isi list beserta jumlah akhirnya
        System.out.println("Isi daftar belanja: " + daftarBelanja);
        System.out.println("Jumlah akhir item : " + daftarBelanja.size());
    }
}