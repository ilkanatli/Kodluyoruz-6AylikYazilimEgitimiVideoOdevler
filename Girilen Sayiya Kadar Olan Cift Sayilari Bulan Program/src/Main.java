import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Değişkeni belirleyelim.
        int i = 1, number;

        // Scanner sınıfımızı tanımlıyoruz.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sayiyi girmesini istiyoruz.
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();

        // Döngü ile koşulumuzun kontrolünü sağlayallım.
        while (i <= number) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

         */

        /*
        // Değişkenlerimizzi tanımlayalım.
        int number;

        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan girilecek sayıyı isteyelim.
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();

        // Girilen sayıya kadar çift olan sayıları for döngüsü ile yazdırma.
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

         */

        // Değişkenleri tanımlayalım.
        int number, total = 0, countNumber = 0;
        double average;

        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sayıyı girmesini isteyelim.
        System.out.print("Sayiyi giriniz: ");
        number = scan.nextInt();

        // Döngü ile 0'dan girilen sayıya kadar olan sayılardan 3'e ve 4'e bölünen sayılarının kontrolünü sağlıyoruz.
        for (int i = 0; i <= number; i++) {
             if ((i % 3 == 0) && (i % 4 == 0)) {
                 total += i;
                 countNumber ++;
             }
        }
        average = total / countNumber;
        System.out.println("Toplam: " + total);
        System.out.println("Ortalama: " + average);
    }
}
