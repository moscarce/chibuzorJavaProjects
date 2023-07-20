import java.util.Scanner;

public class TenValidInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numberOfValidInput = 1;
        while( numberOfValidInput <= 10){
            System.out.print("Enter student score(Valid score are between 0 to 100)" + numberOfValidInput +": ");
            int score = input.nextInt();
            if((score > -1) && (score < 101)){
                sum+=score;
                numberOfValidInput++;
            }else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Sum = "+ sum);
    }
}
