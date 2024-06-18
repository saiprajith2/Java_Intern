import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] marks;
    public Student(String name,int... marks){
        this.name=name;
        this.marks=marks;
    }
    public int getNumberOfMarks(){
        return marks.length;
    }
    public int getTotalSumOfMarks(){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        return sum;
    }
    public int getMaximumMark(){
        int max=Integer.MIN_VALUE;
        for(int mark:marks){
            if(mark>max){
                max=mark;
            }
        }
        return max;
    }
    public int getMinimumMark(){
        int min=Integer.MAX_VALUE;
        for(int mark:marks){
            if(mark<min){
                min=mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        int sum=getTotalSumOfMarks();
        int total=getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(total),3, RoundingMode.UP);
    }
}
