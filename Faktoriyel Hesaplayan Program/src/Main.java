import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Değişkenlerimizi yazıyoruz.
        // Faktöriyel formülü: (n!) = 1 * 2 * .........* n
        int number, total = 1;

        // Scaner sınıfımızı tanımlıyoruz.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan faktöriyeli alıncak sayıyı girmesini istioyruz.
        System.out.print("Faktoriyeli alinacak sayiyi giriniz: ");
        number = scan.nextInt();

        // Döngü ile koşulumuzu girip kontrolünü sağlıyoruz.
        for(int i = 1; i <= number; i++) {
            total *= i;
        }
        System.out.println(number + " sayisinin faktoriyeli: " + total);
         */

        // Değişkenlerimizi yazıyoruz.
        // Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)
        int n,r ,nTotal = 1, rTotal = 1, nrTotal = 1, combination;

        // Scaner sınıfımızı tanımlıyoruz.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan kombinasyonu alıncak sayıyı girmesini istioyruz.
        System.out.print("n sayisini giriniz: ");
        n = scan.nextInt();
        System.out.print("r sayisini giriniz: ");
        r = scan.nextInt();

        // Döngü ile koşulumuzu girip kontrolünü sağlıyoruz.
        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int i = 1; i <= r; i++) {
            rTotal *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            nrTotal *= i;
        }
        // Kombinasyon formülü
        combination = (nTotal) / (rTotal * nrTotal);
        // Sonucumuzu ekrana yazdıralım.
        System.out.println(n + "'in " + r + "'li kominasyonu: " + combination);
    }
}
