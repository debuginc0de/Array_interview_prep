package String;

import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String v1="silent";
        String v2="lients";
        boolean isAnagram= v1.length()==v2.length() && v1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(v2.chars().sorted().boxed().collect(Collectors.toList()));
        System.out.println(isAnagram);
    }
}
