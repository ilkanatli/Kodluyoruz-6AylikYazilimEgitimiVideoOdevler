public class Main {
    public static void main(String[] args) {
        /*
        // Dizideki elemanların ortalamasını hesaplayan program.
        // Değişkenlerimizi yazıyoruz.
        int[] dizi = {1, 2, 3, 4, 5}; // Dizi tanımladık
        double result = 0;            // Toplam değikeni tanımladık.

        // Döngü ile dizideki tüm elemanları geziyoruz ve toplam değişkenine elemanları toplayıp atama yapıyoruz.
        for (int i = 0; i < dizi.length; i++) {
            result += dizi[i];
        }
        double average = (result / dizi.length);    // Dizideki elemanlarının ortalamasını hesaplıyoruz.
        System.out.println("Ortalama: " + average); // Ortalamayı ekrana bastırıyoruz.
         */

        // Harmonik Ortalama
        int[] dizi = {1,2,3,4,5};  // Dizimizi tanımladık,
        double harmonicSeries = 0.0; // Harmonik Seri değişkenimizi tanımladık
        double harmonicMean;    // Harmonik Ortalama değişkenini tanımladık.
        // Döngü ile dizideki tüm elemanları geziyoruz
        for (int i = 0; i < dizi.length; i++) {
            harmonicSeries += (1.0 / dizi[i]);
        }
        harmonicMean = (dizi.length / harmonicSeries);
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
