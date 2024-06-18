
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<StudentNew>{
    @Override
    public int compare(StudentNew student1,StudentNew student2){
        return Integer.compare(student1.getId(),student2.getId());
    }
}
public class StudentsCollectionsRunner {
    public static void main(String[] args) {
        List<StudentNew> students= List.of(new StudentNew(1,"Ranga"),
                new StudentNew(100,"Bob"),new StudentNew(2,"Eve"));
        System.out.println(students);
        ArrayList<StudentNew> studentsAl=new ArrayList<>(students);
        System.out.println(studentsAl);
        Collections.sort(studentsAl);
        System.out.println("Desc "+studentsAl);

        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator "+studentsAl);
    }

}
