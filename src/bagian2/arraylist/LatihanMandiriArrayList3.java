package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList3 {
    public static void main(String[] args) {
        // 3. Tambah 6 nama ke dalam ArrayList
        ArrayList<String> daftarNama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        
        for (String d : data) {
            daftarNama.add(d);
        }
        
        // Cetak hanya nama yang diawali huruf A
        System.out.println("Nama yang diawali huruf 'A':");
        for (String n : daftarNama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}