package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicateNumberArray {
    public static List<Integer> duplicate(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        //return 0;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 2, 6};

        List<Integer> duplicates = duplicate(arr);
        System.out.println("Duplicate elements are: " + duplicates);
    }
}
