import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Çok Boyutlu Diziler ile A Harfi Yazdıran Program

        String[][] dizi = new String[6][4];  // Bir çok boyutlu dizi tanımladık.

        // Çok boyutlu dizi içerisine yıldızlarımızı koşullu ifadeler ile ekliyoruz.

        for (int i = 0; i < dizi.length; i++){
            for(int j = 0; j < dizi[i].length; j++){
                if (i == 0 || i == 2) {
                    dizi[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    dizi[i][j] = " * ";
                } else {
                    dizi[i][j] = "   ";
                }
            }
        }

        // Oluşturduğumuz yıldızlı desene foreach kullanarak ekrana bastırıyoruz.

        for (String[] row : dizi) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
         */

        // Çok Boyutlu Diziler ile B Harfi Yazdıran Program
        String[][] dizi = new String[6][4];  // Çok boyutlu dizimizi tanımladık.

        // Çok boyutlu dizi içerisine yıldızlarımızı koşullu ifadeler ile ekliyoruz.
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    dizi[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    dizi[i][j] = " * ";
                } else {
                    dizi[i][j] = "   ";
                }
            }
        }

        // Oluşturduğumuz yıldızlı desene foreach kullanarak ekrana bastırıyoruz.
        for (String[] row : dizi) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
