package julySeventeen;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(8)));
        System.out.println(Arrays.toString(fibonacci(10)));
        System.out.println(Arrays.toString(fibonacci(5)));
    }
    public static int[] fibonacci(int number){
        int[] fibonacciList = new int[number];
        fibonacciList[0] = 0;
        fibonacciList[1] = 1;
        if (number == 1){
            return new int[]{fibonacciList[0]};
        }
        if (number == 2){
            return new int[]{fibonacciList[0], fibonacciList[1]};
        }
        if (number > 2){
            for (int index = 2; index < number; index++) {
                fibonacciList[index] = fibonacciList[(index - 2)] + fibonacciList[(index-1)];
            }
        }
        return fibonacciList;
    }
}
