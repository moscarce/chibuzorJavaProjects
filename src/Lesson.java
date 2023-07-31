import java.util.Arrays;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] grades = new int[3][7];
        int total = 0;
        for (int row = 0; row < grades.length; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println("Enter number: ");
                int fillUp = input.nextInt();
                grades[row][column] = fillUp;
                System.out.println(Arrays.deepToString(grades));
                total += grades[row][column];
                System.out.println(total);
            }
            grades[row][3] = total;
            total = 0;

        }
        System.out.println(Arrays.deepToString(grades));
    }
}
