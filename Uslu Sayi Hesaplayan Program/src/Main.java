import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz.
        int n, k, total = 1;

        // Scanner sınıfımızı tanımladık.
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan üssü alınacak sayıyı giriniz.
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n = scan.nextInt();
        // Kullanıcıdan üs olacak sayıyı giriniz.
        System.out.print("Us olacak sayiyi giriniz: ");
        k = scan.nextInt();
        // 2 ^ 4 = 2 * 2 * 2 * 2

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(n + " sayisinin " + k + " inci ussu " + total);

        /*
        // Değişkenlerimizi tanımlıyoruz.
        int n, k, total = 1;

        // Scanner sınıfımızı tanımladık.
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan üssü alınacak sayıyı giriniz.
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n = scan.nextInt();
        // Kullanıcıdan üs olacak sayıyı giriniz.
        System.out.print("Us olacak sayiyi giriniz: ");
        k = scan.nextInt();
        // 2 ^ 4 = 2 * 2 * 2 * 2

        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        System.out.println(n + " sayisinin " + k + " inci ussu " + total);
         */
    }
}
