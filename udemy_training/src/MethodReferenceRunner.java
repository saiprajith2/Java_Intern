import java.util.List;

public class MethodReferenceRunner {
    public static void print(Integer number){
        System.out.println(number);
    }
    public static void main(String[] args) {
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(s->s.length())
                .forEach(s-> MethodReferenceRunner.print(s));

        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(String::length)
                .forEach(MethodReferenceRunner::print);

        Integer max=List.of(23,45,66,34).stream()
                .filter(MethodReferenceRunner::isEven)
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);
    }
    public static boolean isEven(Integer number){
        return number%2==0;
    }
}
