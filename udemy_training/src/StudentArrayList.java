import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
    private String name;
    private ArrayList<Integer> marks=new ArrayList<Integer>();
    public StudentArrayList(String name,int... marks){
        this.name=name;
        for(int mark:marks){
            this.marks.add(mark);
        }
    }
    public int getNumberOfMarks(){
        return marks.size();
    }
    public int getTotalSumOfMarks(){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        return sum;
    }
    public int getMaximumMark(){
        return Collections.max(marks);
    }
    public int getMinimumMark(){
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int sum=getTotalSumOfMarks();
        int total=getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(total),3, RoundingMode.UP);
    }
    public String toString(){
        return name+marks;
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}
