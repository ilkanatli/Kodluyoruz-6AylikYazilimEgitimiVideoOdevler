import java.util.Arrays;

public class Main {
    /*
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[numbers.length];
        int startIndex = 0 ;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if((i != j) && (numbers[i] == numbers[j])) {

                    if (!isFind(duplicate, numbers[i])) {

                        duplicate[startIndex++] = numbers[i];

                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }

     */
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 10};
        int[] duplicate = new int[numbers.length];
        int startIndex = 0 ;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if((i != j) && (numbers[i] == numbers[j])) {

                    if (numbers[i] % 2 == 0 && numbers[j] % 2 == 0) {
                        if (!isFind(duplicate, numbers[i])) {

                            duplicate[startIndex++] = numbers[i];

                        }
                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}
