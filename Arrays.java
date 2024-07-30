public class Arrays {
    public static void main(String args[]){
        //Declaring a variable
        int a;

        //Declaring an array
        int arr1[] = new int[6];
        int []arr2 = {1,2,3,4,5,8,9,10,45,12};
        int[] arr3;

        //i is index of an array
        for(int i=1;i<=arr2.length-1;i++){
            System.out.print(arr2[i] + " ");
        }

        //i is element of an array
        for(int i:arr2){
            System.out.print(i + " ");
        }
    }
    
}
