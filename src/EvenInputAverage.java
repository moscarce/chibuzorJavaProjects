import java.util.Scanner;

public class EvenInputAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double numberOfAverage = 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("Enter student score " + count + ": ");
            double score = input.nextDouble();
            if(score % 2== 0){
                sum+=score;
                numberOfAverage++;
            }
        }
        double averageOfEven = sum/numberOfAverage;
        System.out.println("Average = "+ averageOfEven);
    }
}
