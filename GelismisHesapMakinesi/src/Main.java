import java.util.Scanner;

public class Main {
    // Hesap makinesinde kullanacağımız metotları tanımlıyoruz.
    static int sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int extraction(int num1,int num2){
        int result = num1 - num2;
        System.out.println("Fark: " + result);
        return result;
    }

    static int multiplication(int num1, int num2){
        int result = num1 * num2;
        System.out.println("Carpim: " + result);
        return result;
    }

    static int divide(int num1, int num2){
        if (num2 == 0) {
            System.out.println("Bir sayi 0'a bolunemez!");
        }
        int result = num1 / num2;
        System.out.println("Bolme: " + result);
        return result;
    }

    static int power(int num1, int num2){
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        System.out.println(num1 + " in " + num2 + " inci kuvveti: " + result);
        return result;
    }

    static int mode(int num1, int num2){
        int result = num1 % num2;
        System.out.println("Mode Islemi: " + result);
        return result;
    }

    static void rectangle(int num1, int num2){
        System.out.println("Diktdortgenin alani: " + num1 * num2);
        System.out.println("Diktdortgenin cevresi: " + 2 * (num1 + num2));
    }

    public static void main(String[] args) {
        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);
        // Değişkenlerimizi tanımlayalım.
        int result = 0, select;
        // Kullanıcıya bir menü oluşturalım.
        String menu =   "1- Toplama Islemi\n" +
                        "2- Cikarma Islemi\n" +
                        "3- Carpma Islemi\n" +
                        "4- Bolme Islemi\n" +
                        "5- Uslu Sayi Hesaplama Islemi\n" +
                        "6- Mod Alma\n" +
                        "7- Dikdortgen Alan Ve Cevre Hesabi\n" +
                         "0- Cikis Yap";

        System.out.println(menu); // Menüyü ekrana bastırıyoruz.

        // Döngü ile hesap makinemizi oluşturuyoruz.
        while (true) { // Başlangıçta true diyoruz ki program sürekli çalışacak.

            // Kullanıcıdan islem seçmesini istiyoruz.
            System.out.print("Bir islem seciniz: ");
            select = scan.nextInt();

            if (select == 0) { // 0'ı seçer ise programdan çıkış yapılacak.
                break;
            }

            System.out.print("Ilk sayiyi giriniz: ");    // Kullanıcıdan ilk girmesini istiyoruz.
            int num1 = scan.nextInt();                     // İlk değişkenimiz.
            System.out.print("Ikinci sayiyi giriniz: "); // Kullanıcıdan ikinci girmesini istiyoruz.
            int num2 = scan.nextInt();                     // İkinci değişkenimiz.

            switch (select) {
                case 1:
                    sum(num1, num2);
                    break;
                case 2:
                    extraction(num1,num2);
                    break;
                case 3:
                    multiplication(num1,num2);
                    break;
                case 4:
                    divide(num1,num2);
                    break;
                case 5:
                    power(num1,num2);
                    break;
                case 6:
                    mode(num1,num2);
                    break;
                case 7:
                    rectangle(num1,num2);
                    break;
                default:
                    System.out.println("Gecerli bir islem seciniz!");
            }
        }
        System.out.println("Gule Gule !");
    }
}
