import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityqueue {
    public static void main(String[] args){
       // PriorityQueue<Integer> number = new PriorityQueue<>();

        //if you want greater element first
        PriorityQueue<Integer> number = new PriorityQueue<>(Comparator.reverseOrder());

        //adding element
        number.offer(12);
        number.offer(3);
        number.offer(5);
        number.offer(90);
        System.out.println(number);//element will be in min heap

        number.poll();
        System.out.println(number);
    }
}
