import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args) {
        //Print squares of first 10 numbers
        IntStream.range(1,11).map(e -> e*e).forEach(e -> System.out.println(e));
        //To Convert to lowercase
        List.of("Apple","Ant","Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
        //to print length of each element
        List.of("Apple","Ant","Bat").stream().map(e-> e.length()).forEach(e-> System.out.println(e));
    }
}
