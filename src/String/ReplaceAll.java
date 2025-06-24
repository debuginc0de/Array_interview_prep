package String;

import java.util.stream.Collectors;

public class ReplaceAll {
    public static void main(String[] args) {

        String name="java programming";
        /*
        String output=name.replace("a","");
        System.out.println(output);
        */

        char toRemove='a';
        String result=name.chars().mapToObj(c->(char)c).filter(c->c!=toRemove)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
