public class SquaresOfEvenOdd {
    public static void main(String[] args) {
        System.out.println("Squares of first 10 Even");
        for(int i=2;i<=20;i=i+2){
            System.out.print(i*i+" ");
        }
        System.out.println();
        System.out.println("Square of first 10 odd");
        for(int i=1;i<=20;i=i+2){
            System.out.print(i*i+" ");
        }
    }
}
