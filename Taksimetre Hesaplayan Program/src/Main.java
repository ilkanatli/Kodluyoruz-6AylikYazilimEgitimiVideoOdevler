import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım.
        int km;
        double perKm = 2.20, total, startPrice = 10;

        // Scanner sınıfını tanımlayalım.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan gideceği mesafeyi isteyelim.
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total = (perKm * km);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);
    }
}
