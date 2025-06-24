package String;

import java.util.Map;
import java.util.stream.Collectors;

public class CountPrintDuplicate {
    public static void main(String[] args) {
        String input="programming";
        Map<Character,Long> answer=input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        answer.entrySet().stream()
                .filter(entry-> entry.getValue()>1)
                .forEach(entry-> System.out.println(entry.getValue()+" "+entry.getKey()));
    }
}
