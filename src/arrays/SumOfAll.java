package arrays;

import java.util.Arrays;

public class SumOfAll {
    public static int sumofele(int[] num){
        return Arrays.stream(num)
                .sum();
        }
    public static void main(String[] args) {
        var arr1= new int[]{1,2,3,10,5};
        int res=sumofele(arr1);
        System.out.print(res);
    }
}
