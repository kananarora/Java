public class CalculatePercentage {
    public static void main(String[] args) {

        float totalMarks = 800f; 
        int scored = 540;

        // Calculate the percentage
        double percentage = (scored / totalMarks) * 100;
        System.out.println(percentage);
    }
}
