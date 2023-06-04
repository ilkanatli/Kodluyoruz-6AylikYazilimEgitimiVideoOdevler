import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfımızı tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Değişkenimizi tanımlayalım.
        int n;
        double result = 0;

        // n sayısını kullanıcıdan isteyelim.
        System.out.print("N sayisini giriniz: ");
        n = scan.nextInt();

        // result ve i yi double tanımladık double / double => bir double sonuç versin diye.

        // Döngü ile harmonik seriyi oluşturalım.

        for(double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(result);
    }
}
