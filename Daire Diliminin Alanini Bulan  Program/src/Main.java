import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Değişkenleri tanımlayalım
        int r;
        double pi = 3.14, alan, cevre;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan yarıçapı girmesini isteyelim.
        System.out.print("Yaricapi giriniz: ");
        r = scan.nextInt();

        alan = pi * (r * r);
        cevre = 2 * (pi * r);

        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
         */

        // Değişkenleri tanımlayalım
        int r, a;
        // a = merkez açısı ölçüsü
        double pi = 3.14, alan, cevre, daireDilimiAlani;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan yarıçapı girmesini isteyelim.
        System.out.print("Yaricapi giriniz: ");
        r = scan.nextInt();

        // Kullanıcıdan merkez açısını girmesini isteyelim.
        System.out.print("Merkez acisini giriniz: ");
        a = scan.nextInt();

        // Formül : (𝜋 * (r*r) * 𝛼) / 360

        daireDilimiAlani = (pi * (r * r) * a) / 360;
        System.out.print("Yaricapi " + r + ", merkez acisi olcusu " + a + " olan daire diliminin alani: " + daireDilimiAlani);
    }
}
