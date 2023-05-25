import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan değerleri al.

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamaniz: " + ortalama);

        String durum = (ortalama >= 60) ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println(durum);
    }
}
