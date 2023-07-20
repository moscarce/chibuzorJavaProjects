import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("Enter student score "+count+": ");
            int score = input.nextInt();
            if(count % 2 == 0){
                sum+=score;
            }
        }
        System.out.println("Sum = "+ sum);
    }
}
