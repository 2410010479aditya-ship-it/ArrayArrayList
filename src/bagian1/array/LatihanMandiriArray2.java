package bagian1.array;

public class LatihanMandiriArray2 {
    public static void main(String[] args) {
        // 2. Buat array String berisi 5 nama hari
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        // Cetak hanya nama hari yang memiliki lebih dari 5 huruf
        System.out.println("Hari dengan lebih dari 5 huruf:");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
    }
}