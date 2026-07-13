import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args){

//        String[] students = new string[30];
//        students[0] = "anushka";
//        students[1] = "kushal";

        List<String> List = new ArrayList();
        //adding elements
        List.add("anuska");
        System.out.println(List);
        List.add("kushal");
        List.add("vedika");
        List.add("tanu");
        System.out.println(List);

        //adding elements at a index
        List.add(4,"satyam");
        System.out.println(List);

        //adding two Lists:
        //create another list
        List<String> newlist = new ArrayList();
        newlist.add("1");
        newlist.add("2");
        newlist.add("3");
        System.out.println(newlist);

        //two list add
        List.addAll(newlist);
        System.out.println(List);


    }
}
