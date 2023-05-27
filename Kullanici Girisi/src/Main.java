import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımladık.
        String userName, password,  cSelect, select, newPassword;

        // Scanner sınıfını tanımladık.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan kullanıcı adı ve şifresini girmesini isteyelim.
        System.out.print("Kullanici adini giriniz: ");
        userName = scan.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        password = scan.nextLine();

        // Koşullu ifadeler ile kontrol mekanizması sağladık.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Bilgileriniz dogru, giris basarili.");
        } else {
            System.out.println("Bilgileriniz hatali!");
            System.out.println("Sifreniz hatali. Sifrenizi sifirlamak ister misiniz?");
            System.out.println("Y/N");
            cSelect = scan.nextLine();
            if (cSelect.equals("Y")) {
                System.out.print("Yeni sifrenizi giriniz: ");
                newPassword = scan.nextLine();
                if (newPassword.equals("java1234") || (newPassword.equals("java123"))) {
                    System.out.print("Sifre olusturulamadi. Lutfen baska sifre giriniz!");
                } else {
                    System.out.print("Tebrikler. Sifre olusturuldu.");
                }
            } else {
                System.out.println("Sisteme giris yapilamadi!");
            }

        }
    }
}
