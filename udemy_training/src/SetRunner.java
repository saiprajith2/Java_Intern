import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters=List.of('A','Z','A','B','Z','F');

        Set<Character> treeSet=new TreeSet<>(characters);
        System.out.println("Tree set "+treeSet);

        Set<Character> linkedHashSet=new LinkedHashSet<>(characters);
        System.out.println("Linked Hash set "+linkedHashSet);

        Set<Character> hashSet=new HashSet<>(characters);
        System.out.println("Hash set "+hashSet);
    }
}
