import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımladık.
        int n1, n2, select;

        // Scanner sınıfını tanımladık
        Scanner scan = new Scanner(System.in);

        // Değişkenleri kullanıcıdan isteyelim.
        System.out.print("Ilk sayiyi giriniz: ");
        n1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = scan.nextInt();

        // İşlem menüsü
        System.out.println("Lutfen yapmak istediginiz islemi seciniz!");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz: ");
        select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpim: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bolum: " + (n1 / n2));
                } else {
                    System.out.println("Bir sayi 0'a bolunemez.");
                }
                break;
            default:
                System.out.println("Hatali bir secim yaptiniz. Lutfen gecerli bir secim yapiniz!");
        }
    }
}
