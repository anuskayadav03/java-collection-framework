import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(arr,2);
//        System.out.println("the element at index 7 is : " + index);

        Integer[] numbers = {10,50,20,90,15,25,39,95,11,13};
        Arrays.sort(numbers);
        for (Integer i : numbers) {
            System.out.print(i +" ");
        }
    }
}
