public class Max {
    public static void main(String[] args) {
        int A[] = {12,14,15,48,78,45,98,102,47,76,89};

        int max = A[0];
        for(int i=1;i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println(max);
    }
    
}
