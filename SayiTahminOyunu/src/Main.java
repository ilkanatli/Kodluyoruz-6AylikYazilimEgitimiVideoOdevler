import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Yöntem 1 (0-100 arasında rastgele değer üretme)
        // Math sınıfından random metodu ile rastgele değerler ürettik.
        // 100 ile çarparak 0-100 arasında rastgele değerler üretmeyi sağladık.
        // Fakat random metodu double değer ürettiği için tür dönüşümü yaptık (int) koyarak.
        // int number = (int)(Math.random() * 100);

         */

        // Yöntem 2 (0-100 arasında değer üretme)
        // Random sınıfından  bir nesne ürettik.
        // number isimli değişkene Random sınıfından ürettiğimiz rand nesnesine Random sınıfından nextInt metodunu kullanarak 0-100 arasında rastgele değer ürettirdik.
        Random rand = new Random();
        int number = rand.nextInt(100);
        // Scaanner sınfını tanımladık.
        Scanner scan = new Scanner(System.in);
        int right = 0; // bu bizim tahmin hakkımız her yanlışta 1 artacak.
        int selected; // Kullanıcının gireceği değer.
        int[] wrong = new int[5]; // Girilen yanlış değreleri bir array içinde toplamak istiyoruz. Onun için burada bir array tanımladık ve hakkımız 5 diye boyutunu bu şekilde belirledik.
        boolean isWin = false;  // Başlangıçta kullanıcıyı oyunu kaybetmiş varsayıyoruz.
        boolean isWrong = false; // Çok sık hatalı giriş yaptığında kullanıcı canını azaltmak istiyoruz. Başlangıçta hatalı giriş yapmadığını varsayıyoruz.


        System.out.println(number);

        // döngü ile kurgumuzu hazırlıyoruz.
        while (right < 5) {
            System.out.print("Lutfen tahmininizi giriniz : "); // Kullanıcıdan sayıyı girmesini istiyoruz.
            selected = scan.nextInt();
            if (selected < 0 || selected >100) {   // Girilen sayının 0-100 arasında bir değer olmasının kontrolünü sağlıyoruz.
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz! Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali giris yaptiginizda hakkinizdan dusulecektir.");
                }
                continue;  // Eğer yanlış bir değer girdiysek alt kısmı okumasın direk yukarı atlasın kod hiç can azaltma yapmasın.
            }

            if (selected == number) {             // Girilen sayı ile üretilen karşılaştırıyoruz.
                System.out.println("Tebrikler dogru tahmin ettiniz. Tahmin ettiginiz sayi :" + number);
                isWin = true;  // Eğer kullanıcı doğru girdiyse true yapıyoruz.
                break;
            } else {

                System.out.println("Hatali bir sayi girdiniz.");
                if (selected > number) {
                    System.out.println(selected + " sayisi, gizli sayidan buyuktur."); // burada ipucu veriyoruz kullanıcıya girilen sayı büyükse.
                } else {
                    System.out.println(selected + " sayisi, gizli sayidan kucuktur."); // // burada ipucu veriyoruz kullanıcıya girilen sayı kucukse.
                }
                wrong[right++] = selected; // bu kısma girildiğinde right ı 1 arttırıyoruz.
                System.out.println("Kalan hakkiniz : " + (5 - right)); // kullanıcının kalan hakkını ekrana bastırıyoruz. baslangıçta right ı 0 tanımladık her yanlışta 1 artacak ve sonuç olarak 5 ile farkı kalan hakkımız olacak.
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! "); // Tüm hakların bitmesi durumunu ele alıyoruz.
            if (!isWrong) { // Fazla şekilde hatalı giriş yaptıysa ekrana basmasın. (0-100) arasında giriş yapmadıysa.
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong)); // Yanlış tahminleri topladığımız diziyi ekrana basıyoruz.
            }
        }
    }
}
