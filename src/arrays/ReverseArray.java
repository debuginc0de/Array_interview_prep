package arrays;

import java.util.Arrays;
import java.util.stream.*;

/*public class ReverseArray {
    public static double[] reverseArray(int[] arr){
        return IntStream.range(0,arr.length)
                .mapToDouble(i->arr[arr.length-1-i])
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        double[] reversed = reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(reversed));

    }*/

    public class ReverseArray {
        public static Object[] reverseArray(int[] arr) {
            return IntStream.range(0, arr.length)
                    .mapToObj(i -> arr[arr.length - 1 - i])
                    .toArray();
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            Object[] reversed = reverseArray(arr);
            System.out.println("Reversed array: " + Arrays.toString(reversed));
        }
    }


