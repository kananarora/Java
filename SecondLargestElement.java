import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int max2 = max;

        for(int i=1;i<n;i++){
            if(max<arr[i]){
               max2 = max;
               max = arr[i];
            }
            else if(max2<arr[i] && arr[i]!=max){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    } 
}
