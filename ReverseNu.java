import java.util.Scanner;
public class ReverseNu {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		
		while(n!=0){
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n/10;
		}
		System.out.println(rev);

		sc.close();

	}
}
