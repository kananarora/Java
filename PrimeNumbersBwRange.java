import java.util.Scanner;
public class PrimeNumbersBwRange {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int flag = 0;
        // boolean isPrime = true;
        for(int j = 1; j<50;j++){
            for(int i=2; i<j; i++){
                if(j%i == 0){
                    //not prime
                    // isPrime = false;
                    // break;
                }
            }
        }
    }
}
