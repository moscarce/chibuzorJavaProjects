import java.util.Scanner;

public class ThirtyToResetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int validInput = 1;
        while( validInput <= 10){
            System.out.print("Enter student score(Valid score are between 0 to 100(30 to reset))" + validInput + ": ");
            int score = input.nextInt();
            if((score > -1) && (score < 101)){
                sum+=score;
                validInput++;
            }else {
                System.out.println("Invalid input");
            }
            if (score == 30){
                System.out.println("Reset successful");
                sum = 0;
                validInput = 1;
            }
        }
        System.out.println("Sum = "+ sum);
    }
}
