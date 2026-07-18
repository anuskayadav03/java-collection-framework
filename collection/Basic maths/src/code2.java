public class code2 {
    public static void main(String[] args) {
        //count digits

        int n =146800;
        int count=0;

        while (n>0) {
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
