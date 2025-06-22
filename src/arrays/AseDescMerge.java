package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AseDescMerge {
    public static void main(String[] args) {
        int[] numbers={45,25,23,22,20,1,-2,50};
        List<Integer> finder= Arrays.stream(numbers)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> find=Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Ascending: "+finder);
        System.out.println("Descending: "+find);
    }
}
