import java.util.Scanner;
public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                res+=1;
                System.out.print(res);
            }
            System.out.println();
        }
    }
}