public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 8;
        System.out.print(a);

        while(count>0){
            int c  = a+b;
            a = b;
            b = c;
            count--;
            System.out.print(" "+ a);
        }
    }
}
