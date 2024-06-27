import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,9,13,4,6,2,4,12,15);
        int sum=addListFunctional(numbers);
        System.out.println(sum);
        squareAndCubeEveryNumberAndSum(numbers);
        //System.out.println(squareSum);
        sumOfOddNumbers(numbers);
        List<Integer> squareList= squareList(numbers);
        System.out.println(squareList);
        List<Integer> evenNumbers=evenNumbersList(numbers);//Exercise-10
        System.out.println(evenNumbers);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Micro services", "Kubernetes", "Docker", "AWS", "AZURE");
        List<Integer> lengthOfCourses=lengthOfCourseTitles(courses);//Exercise-11
        System.out.println(lengthOfCourses);
    }

    private static List<Integer> lengthOfCourseTitles(List<String> courses) {
        return courses.stream()
                .map(course-> course.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> evenNumbersList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream()
                .map(number-> number*number)
                .collect(Collectors.toList());
    }

    private static void sumOfOddNumbers(List<Integer> numbers) {
        int sumOdd=numbers.stream()
                .filter(number->number%2==1)
                .reduce(0,Integer::sum);
        System.out.println(sumOdd);
    }

    private static void squareAndCubeEveryNumberAndSum(List<Integer> numbers) {
            int squareSum=numbers.stream().
                map(number-> number*number).
                reduce(0,Integer::sum);
        System.out.println(squareSum);
        int cubeSum=numbers.stream().
                map(number-> number*number*number).
                reduce(0,Integer::sum);
        System.out.println(cubeSum);
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,Integer::sum);
                //.reduce(0,(x,y)->x+y);//Lambda
                //.reduce(0,FP02Functional::sum);//method reference
    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate+" "+nextNumber);
        return aggregate+nextNumber;
    }
}
