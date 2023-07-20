import java.util.Scanner;

public class AverageActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double numberOfStudents= 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("Enter student score "+count+": ");
            double score = input.nextDouble();
            sum+=score;
            numberOfStudents++;
        }
        double average = sum/numberOfStudents;
        System.out.println("Average = "+ average);
    }
}
