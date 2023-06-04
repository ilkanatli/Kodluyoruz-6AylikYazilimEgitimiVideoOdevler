import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlayalım.
        // int a = 2451, numberOfDigits, numberCounter = 0;

        // Basamak sayısı bulma
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        // 2451 / 10 = 245
        // 245 % 10 = 5
        // 245 / 10 = 24
        // 24 % 10 = 4
        // 24 / 10 = 2
        // 2 % 10 = 0
        /*
        int result = 1;
        int sub = 2, sup = 3;
        for (int i = 1; i <= sup; i++) {
            result *= sub;
        }
        System.out.println(result);
         */
        /*
        while (a != 0) {
            a /= 10;
            numberCounter++;
        }
        */
        /*
        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Değişkenlerimizi tanımlayalım.
        int number;

        // Kullanıcıdan sayıyı girmesini isteyelim.
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();
        int basNumber = 0; // basamak sayısı
        int tempNumber = number;
        int basValue; // basamak değeri
        int result = 0;
        int basPow; // basamak üssü

        // Döngü ile basamak sayısını bulalım.
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        // System.out.println(numberOfDigits);

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayisi bir Armstrong sayidir.");
        } else {
            System.out.println(number + " sayisi bir Armstrong sayi degildir.");
        }
        */

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Değişkenlerimizi tanımlayalım.
        int number, result = 0, basValue = 0;

        // Kullanıcıdan sayıyı girmesini isteyelim.
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();
        // Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        while (number != 0) {
                basValue = number % 10;
                result += basValue;
                number /= 10;
        }
        System.out.println(result);
    }
}
