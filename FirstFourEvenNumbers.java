import java.util.Scanner; 
class FirstFourEvenNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int j = 4;

        for(int i=1, j=4; i<=n && j>0; i++){
            if(i%2==0){
                // if(j>0){
                    System.out.println(i);
                    j--;
                // }
            }
        }

    }
}