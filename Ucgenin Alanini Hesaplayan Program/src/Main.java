import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        /*
        // Dik Üçgende Hipotenüs Bulan Program

        // Değişkenleri tanımlayalım.
        int a, b;
        double c;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenari giriniz: ");
        a = scan.nextInt();

        System.out.print("2. Kenari giriniz: ");
        b = scan.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenus: " + c);
         */
        // Üçgenin Alanını Hesaplayan Program

        // Değişkenleri tanımlayalım.
        int a, b, c;
        double u, alan;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenari giriniz: ");
        a = scan.nextInt();

        System.out.print("2. Kenari giriniz: ");
        b = scan.nextInt();

        System.out.print("3. Kenari giriniz: ");
        c = scan.nextInt();

        // Üçgenin çevresi = 2u

        u = (a + b + c) / 2;

        double cevre = (2 * u);

        System.out.println("Ucgenin cevresi: "  + cevre);

        // Alan * Alan = u * (u − 𝑎) * (u − 𝑏) * (u − 𝑐)

        alan = Math.sqrt(u * (u - a) * (u - b) * (u- c));

        System.out.println("Ucgenin alani: " + alan);
    }
}
