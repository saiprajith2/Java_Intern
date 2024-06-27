import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 7, 23, 33, 27, 31, 69, 54, 60);
        printNumbersFunctional(numbers);
        printEvenNumbersFunctional(numbers);
        printOddNumbers(numbers);//Exercise-1
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Micro services", "Kubernetes", "Docker", "AWS", "AZURE");
        printCoursesIndividually(courses);//Ex-2
        printCourseContainsSpring(courses);//Ex-3
        coursesNameWithAtleastFourLetters(courses);//Ex-4
        printEvenSquares(numbers);
        printCubeOdd(numbers);//Ex-5
        printNoOfCharactersCourse(courses);//Ex-6
    }

    private static void printNoOfCharactersCourse(List<String> courses) {
        System.out.println("Printing no of characters in course- Exercise -6");
        courses.stream()
                .map(course-> course+" " +course.length())
                .forEach(System.out::println);
    }

    private static void printCubeOdd(List<Integer> numbers) {
        System.out.println("Print odd cubes - Exercise-5");
        numbers.stream()
                .filter(number -> number%2==1)
                .map(number->number*number*number)
                .forEach(System.out::println);

    }

    private static void printEvenSquares(List<Integer> numbers) {
        System.out.println("Print Even Squares");
        numbers.stream()
                .filter(number->number%2==0)//Lambda Expression
                .map(number->number*number)
                .forEach(System.out::println);
    }

    private static void coursesNameWithAtleastFourLetters(List<String> courses) {
        System.out.println("Courses with atleast 4 letters -Exercise-4");
        courses.stream()
                .filter(course-> course.length()>=4)
                .forEach(System.out::println);
    }

    private static void printCourseContainsSpring(List<String> courses) {
        System.out.println("printing courses containing spring- Exercise-3");
        courses.stream()
                .filter(course-> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesIndividually(List<String> courses) {
        System.out.println("Printing courses- Exercise:2");
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        System.out.println("Printing Odd numbers -Exercise -1");
        numbers.stream()
                .filter(number -> number%2==1)
                .forEach(System.out::println);
    }

    private static void printEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==0)//Lambda Expression
                //.filter(FP01Functional::isEven)
                .forEach(System.out::println);
    }

//    private static boolean isEven(Integer number) {
//        return number%2==0;
//    }

    private static void printNumbersFunctional(List<Integer> integers) {
        integers.stream()
                .forEach(System.out::println);//we can also write like this for printing
                //.forEach(FP01Functional::print);//method reference
    }

//    private static void print(Integer integer) {
//        System.out.println(integer);
//    }
}
