import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım.
        int mat, fizik, turkce, kimya, muzik;

        // Scanner sınıfını tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan notlarını girmesini isteyelim.

        System.out.print("Matematik notunu giriniz: ");
        mat = scan.nextInt();
        if (mat >= 0 && mat <= 100) {
        } else {
            System.out.println("Girdiginiz not 0-100 arasinda olmadigindan ortalamaya katilmayacaktir!");
            mat = 0;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = scan.nextInt();
        if (fizik >= 0 && fizik <= 100) {
        } else {
            System.out.println("Girdiginiz not 0-100 arasinda olmadigindan ortalamaya katilmayacaktir!");
            fizik = 0;
        }

        System.out.print("Turkce notunu giriniz: ");
        turkce = scan.nextInt();
        if (turkce >= 0 && turkce <= 100) {
        } else {
            System.out.println("Girdiginiz not 0-100 arasinda olmadigindan ortalamaya katilmayacaktir!");
            turkce = 0;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = scan.nextInt();
        if (kimya >= 0 && kimya <= 100) {
        } else {
            System.out.println("Girdiginiz not 0-100 arasinda olmadigindan ortalamaya katilmayacaktir!");
            kimya = 0;
        }

        System.out.print("Muzik notunu giriniz: ");
        muzik = scan.nextInt();
        if (muzik >= 0 && muzik <= 100) {
        } else {
            System.out.println("Girdiginiz not 0-100 arasinda olmadigindan ortalamaya katilmayacaktir!");
            muzik = 0;
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;

        if (average <= 55) {
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere!");
        } else {
            System.out.println("Tebrikler, sinifi gectiniz!");
        }

        System.out.println("Ortalamaniz: " + average);
    }
}
