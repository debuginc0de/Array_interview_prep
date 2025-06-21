package arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {
        String[] names={"apple","Banana","Mango","apple","Mango","litchi"};
        Map<String,Long>freq=Arrays.stream(names)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        freq.forEach((word,count)->
                System.out.println(word+" "+count));


    }
}
