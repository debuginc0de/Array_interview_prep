package String;

import java.util.Optional;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String name="wiwsh";
        Optional<Character> answer=name.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> name.indexOf(ch)==name.lastIndexOf(ch))
                .findFirst();
        answer.ifPresent(System.out::println);
    }
}
