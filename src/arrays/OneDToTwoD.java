package arrays;

import javax.lang.model.util.AbstractTypeVisitor6;
import java.util.Arrays;

public class OneDToTwoD {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {10,11,15}
        };

        int[] instreamm= Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(instreamm));
    }
}
