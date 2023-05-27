import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri giriniz.
        int a, b, c;

        // Scanner sınıfını tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıda sayıları isteyelim.
        System.out.print("Ilk sayiyi giriniz: ");
        a = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        b = scan.nextInt();

        System.out.print("Ucuncu sayiyi giriniz: ");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
    }
}
