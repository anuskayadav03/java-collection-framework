import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {
    public static void main(String[] args){

//        String[] students = new string[30];
//        students[0] = "anushka";
//        students[1] = "kushal";

        List<String> List = new ArrayList<>();
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
        List<String> newlist = new ArrayList<>();
        newlist.add("1");
        newlist.add("2");
        newlist.add("3");
        System.out.println(newlist);

        //two list add
        List.addAll(newlist);
        System.out.println(List);

        //get element of particular index
        System.out.println(newlist.get(1));

        //removing elements
        //by index:
        List.remove(1);
        System.out.println(List);
        //by element value:
        List.remove(String.valueOf("anuska"));
        System.out.println(List);
        //remove whole list
        newlist.clear();
        System.out.println(newlist);

        //updating the values
        List.set(0,"anushka");
        System.out.println(List);

        //element present or not
        System.out.println(List.contains("tanu"));

        //ITERATION
        // 1: for loop
        for(int i=0; i<List.size(); i++){
            System.out.println("the elements of list are :" +List.get(i));
        }

        // 2:foreach loop
        for (String value : List){
            System.out.println("ELEMENTS ARE : " +value);

            // 3:ITERATOR
            Iterator<String> it = List.iterator();
            while(it.hasNext()){
                System.out.println("elements through iterator are : " +it.next());
            }
        }
    }
}
