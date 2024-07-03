import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,9,13,4,6,2,4,12,15);
        //filterAndPrint(numbers,x->x%2==0);
        //filterAndPrint(numbers,x->x%2!=0);
        filterAndPrint(numbers,x->x%3==0);
        List<Integer> squaredNumbers= mapAndCreateNewList(numbers, x->x*x);
        System.out.println(squaredNumbers);
        List<Integer> cubedNumbers= mapAndCreateNewList(numbers, x->x*x*x);
        System.out.println(cubedNumbers);
    }


    private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer,Integer> function){
        return numbers.stream()
                .map(function)
                .collect(Collectors.toList());
    }

}
