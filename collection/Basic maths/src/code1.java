public class code1 {
    public static void main(String[]args){
        //print digit of a num one by one

        int n = 167823;
        while (n!=0){
            int digits = n%10;
            System.out.println(digits);
            n=n/10;
        }
    }
}
