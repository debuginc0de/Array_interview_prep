package arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class maxandmin{
    public static OptionalInt max(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        return Arrays.stream(arr)
                .max();

    }

    public static OptionalInt min(int[] arr) {
        int min=Integer.MAX_VALUE;
        return Arrays.stream(arr)
                .min();
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,9,3,1,0,10};
        OptionalInt res=max(arr);
        OptionalInt res2=min(arr);
        System.out.println("Max: "+res.getAsInt());
        System.out.println("Min: "+res2.getAsInt());


    }
}
