import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Değişkenleri tanımladık.

        double tutar, kdvOran, kdvTutar, kdvliTutar;

        // Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan tutarı istedik.
        System.out.print("Tutari giriniz: ");

        tutar = input.nextDouble();

        // İstenilen konuşları verdik.
        boolean kosul1 = tutar <= 1000;
        boolean kosul2 = tutar >= 0;
        kdvOran = (kosul1 && kosul2) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oran: " + kdvOran);
        System.out.println("KDV Tutari: " + kdvTutar);
        System.out.println("KDV'li Tutari: " + kdvliTutar);
    }
}
