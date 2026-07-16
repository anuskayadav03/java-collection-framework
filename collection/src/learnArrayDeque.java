import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args){

        ArrayDeque<Integer> num = new ArrayDeque<>();
        num.offer(10);
        num.offerFirst(20);
        num.offerLast(40);
        num.offer(26);
        System.out.println(num);

        //PEEK
        System.out.println(num.peek());
        System.out.println(num.peekFirst());
        System.out.println(num.peekLast());

        //POLL
        System.out.println(num.poll());
        System.out.println(num.pollFirst());
        System.out.println("pollfirst : " + num.pollFirst());

        System.out.println("pollLast : " + num.pollLast());
        System.out.println("poll : " + num.poll());

        //
    }
}
