import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassRunner {
    public static void main(String[] args) {
        List<String> animals=new ArrayList<String>(
                List.of("At","Cata","Ballon","Elephant")
        );
        Comparator<String> lengthComparator = new Comparator<>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        };
        Collections.sort(animals,
                lengthComparator
                );
        System.out.println(animals);

    }
}
