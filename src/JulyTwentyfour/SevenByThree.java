package JulyTwentyfour;

import java.util.Scanner;

public class SevenByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sumAverageMinMax = new double[7][3];
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int index = 0; index < 3; index++) {
            for (int innerindex = 0; innerindex < 3; innerindex++) {
                System.out.println("Enter number: ");
                if (input.hasNextInt()){
                    double number = input.nextDouble();
                    sumAverageMinMax[innerindex][index] = number;
                    sum += number;
                    sumAverageMinMax[3][index] = sum;
                    sumAverageMinMax[4][index] = sum/(innerindex+1);
                    if (number < min) min = number;
                    if (number > max) max = number;
                    sumAverageMinMax[5][index] = min;
                    sumAverageMinMax[6][index] = max;
                }
            }
            sum = 0;
            min = Double.MAX_VALUE;
            max = Double.MIN_VALUE;

        }
        for (int index = 0; index < sumAverageMinMax.length; index++) {
            for (int innerIndex = 0; innerIndex < sumAverageMinMax[index].length; innerIndex++) {
                System.out.print(sumAverageMinMax[index][innerIndex] + "    ");
            }
            System.out.println();
        }
        input.close();
    }
}
