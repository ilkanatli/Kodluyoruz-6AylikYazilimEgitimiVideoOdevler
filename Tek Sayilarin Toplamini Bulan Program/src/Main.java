import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Değişkenlerimizi tanımlayalım.
        int number, total = 0;

        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Döngü ile koşullarımızı kontrol ediyoruz.
        // Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        do {
            // Kullanıcıdan sayı girmesini istiyoruz.
            System.out.print("Sayi giriniz: ");
            number = scan.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        } while (number > 0);
        System.out.println("Toplam: " + total);
         */
        // Değişkenlerimizi tanımlayalım.
        int number, total = 0;

        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Döngü ile koşullarımızı kontrol ediyoruz.
        // tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        do {
            // Kullanıcıdan sayı girmesini istiyoruz.
            System.out.print("Sayi giriniz: ");
            number = scan.nextInt();
            if ((number % 2 == 0 ) && (number % 4 == 0)) {
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("Toplam: " + total);
    }
}
