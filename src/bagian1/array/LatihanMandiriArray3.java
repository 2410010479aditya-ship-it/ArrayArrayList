package bagian1.array;

public class LatihanMandiriArray3 {
    public static void main(String[] args) {
        // 3. Diberikan array angka
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        
        // Hitung dan tampilkan berapa banyak angka genap di dalamnya
        for (int a : angka) {
            if (a % 2 == 0) {
                genap++;
            }
        }
        
        System.out.println("Jumlah angka genap: " + genap); // Hasil: 4
    }
}