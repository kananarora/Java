import java.util.Scanner;

class UserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float totalMarks = sc.nextFloat();
        int scored = sc.nextInt();

        double percent = (scored/totalMarks)*100;
        System.out.println(percent + "%");
        sc.close();

    }
}