import java.util.Scanner;

public class Main {
    // Yöntem 1
    static boolean isPalindrom(String str) {
        int i = 0;                          // Başlangıç indisi
        int j = str.length() - 1;           // Sondaki indis

        while (i < j) {                     // Başlangıç indis sayısı son indisi geçmeyecek şekilde koşulu verdik.
            if (str.charAt(i) != str.charAt(j)) { // charAt metodu ile String ifadenin elemanlarını ele alıyoruz.
                return false;                     // Elemanlarımız birbirine eşit değilse palindrom değil.
            }
            i++;
            j--;
        }
        return true;                             // Elemanlar birbirine eşit ise Palindrom'dur.
    }

    // Yöntem 2

    static boolean isPalindrom2(String str) {
        String reverse = "";                     // Boş bir string ifade tanımldık.
       // System.out.println("a"); // adım adım kod kontrolü
        for (int i = str.length() - 1; i >= 0; i--) { // Son indisten başlayarak tek tek boş stringimize elemanları atadık.
           // System.out.println("b");  // adım adım kod kontrolü
            reverse += str.charAt(i);
            // System.out.println("c");  // adım adım kod kontrolü
        }
        // System.out.println("d");       // adım adım kod kontrolü
        return (str.equals(reverse)); // Atadığımız ile girdiğimiz string ifadeleri karşılaştırmak için equals metodunu kullandık.
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrom("aba")); // Denemelerimizi yapıyoruz.
        System.out.println(isPalindrom2("aba"));
    }
}
