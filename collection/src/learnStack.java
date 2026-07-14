import java.util.Stack;
public class learnStack {
    public static void main(String[] args){

        Stack<String> animal= new Stack<>();
        //adding elements
        animal.push("lion");
        animal.push("elephant");
        animal.push("cat");
        animal.push("dog");
        System.out.println(animal);

        //checking elements at top
        System.out.println(animal.peek());

        //removing top element
        animal.pop();
        System.out.println(animal);
    }
}
