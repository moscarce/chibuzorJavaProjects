import java.util.Scanner;

public class InfiniteStudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double totalScore = 0;
        while (true) {
            System.out.print("Enter student score (or enter a negative number to quit): ");
            double score = input.nextDouble();
            if (score >= 0) {
                totalScore += score;
                counter++;
            } else {
                double averageScore = totalScore / counter;
                System.out.println("*****************************************************************");
                System.out.println("        Aso Rock Secondary School, Abuja Nigeria");
                System.out.println("*****************************************************************");
                System.out.println("Class: SSS 3");
                System.out.println("Number of Student in class: " + counter);
                System.out.println("Total Score: " + totalScore);
                System.out.println("Average Score: " + averageScore);
                System.out.println("*****************************************************************");
                break;
            }
        }
    }
}
