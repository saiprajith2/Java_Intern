//import java.util.Comparator;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String s1, String s2) {
//
//        return Integer.compare(s1.length(),s2.length());//Sort the values length wise
//    }
//}
//public class QueueRunner {
//    public static void main(String[] args) {
//        Queue<String> queue=new PriorityQueue<>(new StringLengthComparator());
//        queue.addAll(List.of("Zebra","Monkey","Cat"));
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//    }
//}
package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare( value1.length(), value2.length());
    }
}

class LengthComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer value1, Integer value2) {
        return Integer.compare( value1, value2);
    }
}

public class QueueRunner {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("Apple", "Zebra", "Monkey", "Cat"));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println();

        Queue<Integer> queue1 = new PriorityQueue<>(new LengthComparator());
        queue1.addAll(List.of(1,2,33,57));
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);

        System.out.println();

        queue.addAll(List.of("1", "2", "33", "5"));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);




    }
}