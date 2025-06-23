package String;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String name="madam";
        boolean palindrome= name.equals(Arrays.stream(name.split(""))
                .reduce("", (a, b) -> b + a)
        );
        System.out.println(palindrome);
    }
}
