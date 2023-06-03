import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Değişkenlerimizi tanımlayalım.
        int number;

        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();

        // Döngü ile koşullarımızı kontrol ediyoruz.
        // Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        for (int i = 1; i < number; i*=2) {
            // i = 1
            // i = i * 2
            System.out.println(i);
        }
         */
        // Değişkenlerimizi tanımlayalım.
        int number;

        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();

        // Döngü ile koşullarımızı kontrol ediyoruz.
        // tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        for (int i = 1; i < number; i*=4) {
            System.out.println("4'un katlari: " + i);
        }
        System.out.println("--------------------");
        for (int j = 1; j < number; j*=5) {
            System.out.println("5'in katlari: " + j);
        }
    }
}
