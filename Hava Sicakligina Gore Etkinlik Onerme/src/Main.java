import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım.
        int heat;

        // Scanner sınıfını tanımlayalım.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sıcaklık değerini isteyelim.
        System.out.print("Sicaklik degerini giriniz: ");
        heat = scan.nextInt();

        // Koşullu ifadeler ile etkinlik öneriyoruz.
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 10) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if (heat >= 10 && heat <= 15 ) {
                System.out.println("Hem sinema hem de piknige gidebilirsiniz. Karar senin :)");
            } else if (heat >= 15 && heat <= 25) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}
