import java.util.Scanner;

public class AverageOfOnlyValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double averageCount = 0;
        double numberOfValidInput = 1;
        while( numberOfValidInput <= 10){
            System.out.print("Enter student score(Valid score are between 0 to 100)" + numberOfValidInput + ": ");
            double score = input.nextDouble();
            if((score > -1) && (score < 101)){
                sum+=score;
                averageCount++;
            }else {
                System.out.println("Invalid input");
            }
            numberOfValidInput++;
        }
        double average = sum/averageCount;
        System.out.println("Average = "+ average);
    }
}
