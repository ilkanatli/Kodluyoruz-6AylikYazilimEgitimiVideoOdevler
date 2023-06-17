import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Deger " + min);
        System.out.println("Maximum Deger " + max);

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = scan.nextInt();

        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};


        System.out.println("Dizi :" + Arrays.toString(dizi));

        int min = number;
        int max = number;
        Arrays.sort(dizi);
        System.out.println("Sirali :" + Arrays.toString(dizi));

        // En yakın büyük sayıyı bulalım.
        for (int sayilar : dizi){
            if (sayilar > number){
                max = sayilar;
                break;
            }
        }

        //En yakın kücük sayıyı bulalım.
        for (int i = dizi.length-1; i >= 0; i--){
            if (dizi[i] < number){
                min = dizi[i];
                break;
            }
        }

        System.out.println("Girilen Sayi : " + number);
        System.out.println("En yakin kucuk sayi :" + min);
        System.out.println("En yakin buyuk sayi :" + max);
    }
}
