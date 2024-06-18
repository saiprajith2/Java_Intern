public class MethodMultipleParameters {
    static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    static int sum(int a,int b,int c){
        int sum2=a+b+c;
        return sum2;

    }
    public static void main(String[] args) {
        sum(14,8);
        int result=sum(2,4,6);
        System.out.println(result);
    }
}
