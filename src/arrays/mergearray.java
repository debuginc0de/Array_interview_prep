package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mergearray {
    public static int[] merge(int[] arr1,int[] arr2){
        return IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .sorted()
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr1={2,23,24,28,20,10};
        int[] arr2={9,8,3,7,100};
        int[] ans=merge(arr1,arr2);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
