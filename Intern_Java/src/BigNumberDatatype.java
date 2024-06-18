import java.math.BigDecimal;

public class BigNumberDatatype {
    public static void main(String[] args) {
        BigDecimal num1= new BigDecimal("34.56789876");
        BigDecimal num2=new BigDecimal("34.22334");
        BigDecimal num3=num1.add(num2);
        System.out.println(num3);
        int i=5;
        System.out.println(num2.add(new BigDecimal(i)));//to add big decimal with int
    }
}
