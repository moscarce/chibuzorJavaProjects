import java.util.Scanner;

public class TwentyStudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double totalScore = 0;
        while (counter < 20){
            System.out.print("Enter student score: ");
            double score = input.nextDouble();
            totalScore += score;
            counter++;
        }
        double averageScore = totalScore / 20;
        System.out.println("*****************************************************************");
        System.out.println("        Aso Rock Secondary School, Abuja Nigeria");
        System.out.println("*****************************************************************");
        System.out.println("Class: SSS 3");
        System.out.println("Number of Student in class: " + 20);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("*****************************************************************");
    }
}