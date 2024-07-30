import java.util.Scanner;
// import java.io.*;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(i-j);
            }
            System.out.println();
        }
        // double num = n/2;
        // double res = Math.ceil(num);
        // System.out.print(num);
    }
    
}
