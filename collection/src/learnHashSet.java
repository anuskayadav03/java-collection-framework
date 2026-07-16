import java.util.HashSet;
import java.util.Set;

public class learnHashSet {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(38);
        set.add(20);
        set.add(90);
        System.out.println(set);

        set.remove(90);
        System.out.println(set);

        System.out.println(set.contains(20));
    }
}
