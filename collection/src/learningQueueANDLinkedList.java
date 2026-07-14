import java.util.LinkedList;
import java.util.Queue;

public class learningQueueANDLinkedList {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        //add elements
        queue.offer("ANU");
        queue.offer("TANU");
        queue.offer("KUSHAL");
        System.out.println(queue);

        //element remove and return it
        System.out.println(queue.poll());
        System.out.println(queue);

        //next element
        System.out.println(queue.peek());

    }
}
