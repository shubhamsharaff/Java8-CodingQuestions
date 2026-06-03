import java.util.function.Function;
import java.util.stream.*;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        
        
        String str = "helloworld";

        // Q1. Count occurrence of each character
        // OP : {d=1, r=1, w=1, o=2, l=3, h=1, e=1}
        Map<Character,Long> result= str
        .chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

        // Q2. Find duplicate characters
        // OP : l o
        str.chars()
        .mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet()
        .stream()
        .filter( e-> e.getValue() > 1)
        .map( e-> e.getKey())
        .forEach(System.out::println);

        // Q3. Find unique characters
        // OP : d r w h e
        System.out.println("Unique Characters");
        str.chars()
        .mapToObj( c-> (char) c)
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
            ))
        .entrySet()
        .stream()
        .filter( e -> e.getValue() == 1)
        .map( e-> e.getKey())
        .forEach(System.out::println);
        
    }
}
