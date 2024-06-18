public class MultiplicationTableMethod {
    static void printMultiplicationTable(int table){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",table,i,table*i).println();
        }
    }
    static void printMultiplicationTable(){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",5,i,5*i).println();
        }
    }
    public static void main(String[] args) {
        printMultiplicationTable(7);
        printMultiplicationTable();//method overloading
    }
}
