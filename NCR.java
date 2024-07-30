import java.util.Scanner;

public class NCR {
    public static int factorial(int num){   
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *=i;
        }  
        return fact;
    }

    public static double nCr(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);

        double nCr = (double)(factN)/(factR*factNR);
        return nCr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if(n<0||r<0){
            System.out.println("Not a valid number.");
            return;
        }

        double res = nCr(n,r);
        System.out.println(res);
        sc.close();
        
    }  
}
