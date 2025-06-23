package String;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String name="i am rahul das";
        String Reverse= Arrays.stream(name.split(""))
                .reduce("", (a, b) -> b + a);
        System.out.println(Reverse);
    }


}
