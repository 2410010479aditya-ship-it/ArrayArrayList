package bagian1.array;

public class LatihanMandiriArray1 {
    public static void main(String[] args) {
        // 1. Buat array berisi 6 suhu harian (bertipe double)
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        
        // Tampilkan suhu tertinggi dan terendah
        double max = suhu[0];
        double min = suhu[0];
        
        for (double s : suhu) {
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }
        
        System.out.println("Suhu Tertinggi: " + max);
        System.out.println("Suhu Terendah : " + min);
    }
}