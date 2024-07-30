import java.util.Scanner;

public class Loan_Eligibility {
    public static void main(String[] args) {
       // write your code logic ...
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       double income = sc.nextDouble();
       boolean has_loan = sc.nextBoolean();

       if (age>=18 && income >= 2000 && has_loan==false){
           System.out.println("You are eligible for the loan");
       }
       else{
           System.out.println("You are not eligible for the loan");
       }
       //close the Scanner
       sc.close();
    }
}
