import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"A");
        students.put(2,"B");
        students.put(3,"C");
        students.put(4,"D");

        students.putIfAbsent(4,"E");

        System.out.println(students);


    }
}
