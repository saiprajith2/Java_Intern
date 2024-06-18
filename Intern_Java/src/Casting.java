public class Casting {
    public static void main(String[] args) {
        int i=3456;

        short s= (short)i;//Explicit type casting (Storing large data type in small data type)
        int i1=s;//implicit type casting (Storing small data type in large data type)

        int eight=010;//starts with 0-octa value
        System.out.println(eight);
        int sixteen=0x10;//starts with 0x
        System.out.println(sixteen);
        int fifteen=0xF;
        System.out.println(fifteen);

    }
}
