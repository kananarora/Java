import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int flag = 0;
        boolean isPrime = true;

        for(int i=2; i<n; i++){
            if(n%i == 0){
                //not prime
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
