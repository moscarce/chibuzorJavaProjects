package JulyTwentyfour;

import java.util.Scanner;

public class ThreeBySevenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sumAverageMinMax = new double[3][7];
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int index = 0; index < sumAverageMinMax.length; index++) {
            for (int innerindex = 0; innerindex < 3; innerindex++) {
                System.out.println("Enter number: ");
                if (input.hasNextInt()){
                    double number = input.nextDouble();
                    sumAverageMinMax[index][innerindex] = number;
                    sum += number;
                    sumAverageMinMax[index][3] = sum;
                    sumAverageMinMax[index][4] = sum/(innerindex+1);
                    if (number < min) min = number;
                    if (number > max) max = number;
                    sumAverageMinMax[index][5] = min;
                    sumAverageMinMax[index][6] = max;
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
