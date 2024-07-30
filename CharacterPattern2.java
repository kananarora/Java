import java.util.Scanner;
public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            char ithChar = (char)('A'+i-1);
            for(int j=1;j<=n;j++){
                char jthChar = (char)(ithChar+j-1);
                System.out.print(jthChar);
            }
            System.out.println();
        }
    }
    
}
