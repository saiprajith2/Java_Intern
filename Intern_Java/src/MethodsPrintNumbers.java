public class MethodsPrintNumbers {
    static void printNumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    static void printSquareNumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
    }
    public static void main(String[] args) {
        printNumbers(5);
        printSquareNumbers(5);
    }
}
