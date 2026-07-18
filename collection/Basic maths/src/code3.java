public class code3 {
    public static void main(String[] args) {
        //CHECK the reverse of the num is exactly same to the original number

        int n=1211;
        int count=0;
        int reverse=0;
        int dup=n;
        while (n>0) {
            int id=n%10;
            reverse=(reverse*10)+id;
            n=n/10;
        }
        if (reverse==dup) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
