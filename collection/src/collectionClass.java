import java.util.*;

public class collectionClass {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(92);
        num.add(3);
        num.add(40);
        num.add(57);
        System.out.println(num);

        //MIN ELEMENT
        System.out.println("min element is : " + Collections.min(num));
        //MAX ELEMENT
        System.out.println("max element is : " + Collections.max(num));
        //ELEMENT FREQUENCY
        System.out.println(Collections.frequency(num,11));

        Collections.sort(num);
        System.out.println(num);

        Collections.sort(num, Comparator.reverseOrder());
        System.out.println(num);

    }
}
