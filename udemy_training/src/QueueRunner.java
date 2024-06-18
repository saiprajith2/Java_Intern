import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        return Integer.compare(s1.length(),s2.length());//Sort the values length wise
    }
}
public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zebra","Monkey","Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
