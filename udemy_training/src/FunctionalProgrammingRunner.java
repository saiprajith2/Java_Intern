import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list=List.of("Apple","Banana","Cat","Dog");
        printWithFp(list);

        List<Integer> numbers=List.of(4,6,8,13,3,15);
        numbers.stream().forEach(element -> System.out.println(element));
        int sum=numbers.stream().reduce(
                0,
                (number1,number2) -> number1 + number2
          );
        System.out.println("Printing sum "+sum);
        int oddSum=numbers.stream()
                .filter(element -> element%2==1)
                .reduce(0,(number1,number2) -> number1+number2);
        System.out.println("Printing odd sum "+oddSum);
    }
    static void printWithFp(List<String> list){
        list.stream().forEach(element -> System.out.println("Element "+element));
    }
}
