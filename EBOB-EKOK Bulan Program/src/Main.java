import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Scanner sınıfımızı ekleyelim.
        Scanner scan = new Scanner(System.in);

        // Değişkenlermizi tanımlayalım.
        int num1, num2, ebob = 1, ekok;

        // Kullanıcıdan sayıları girmesini isteyelim.
        System.out.print("1.Sayiyi giriniz: ");
        num1 = scan.nextInt();
        System.out.print("2.Sayiyi giriniz: ");
        num2 = scan.nextInt();

        // Döngüler ile EBOB ve EKOK bulan program yapıyoruz.

        // EBOB
        // Yöntem 1:
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                ebob = i;
            }
        }
        System.out.println("EBOB: " + ebob);

        // Yöntem 2:
        for (int k = num1; k > 0; k--) {
            if (num1 % k == 0 && num2 % k == 0) {
                ebob = k;
                System.out.println("EBOB: " + k);
                break;
            }
        }

        // EKOK
        for (int i = 1; i <= (num1 * num2); i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("EKOK: " + i);
                break;
            }
        }

         */

        // Scanner sınıfımızı tanımlıyoruz.
        Scanner scan = new Scanner(System.in);

        // Değişkenlerimizi tanımlayalım.
        int num1, num2;
        // Kullanıcıdan değişkenlerimizi girmesini isteyelim.
        System.out.print("num1 sayisini giriniz: ");
        num1 = scan.nextInt();
        System.out.print("num2 sayisini giriniz: ");
        num2 = scan.nextInt();
        // while döngüsü ile 2 sayının ebob ve ekok unu bulacağız.

        //
        int i = 1;
        int ebob = 1;

        while (i <= num1) {
            if (num1 % i == 0 && num2 % i == 0) {
                // System.out.println(i);
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);

        System.out.println("============================================================");

        // EKOK
        while (i <= (num1 * num2)) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("EKOK: " + i);
                break;
            }
            i++;
        }
        // System.out.println("EKOK: " + (num1 * num2) / ebob);
    }
}
