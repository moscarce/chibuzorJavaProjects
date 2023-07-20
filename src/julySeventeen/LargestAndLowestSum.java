package julySeventeen;

import java.util.Arrays;

public class LargestAndLowestSum {
    public static void main(String[] args) {
        int[] numbers = {-2, 6, -9, 0, 1};
        //System.out.println(Arrays.toString(largestAndLowestSum(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(largestAndLowestSum(numbers)));
    }


    public static int[] largestAndLowestSum(int[] array) {
        int max = array[0];
        int min = array[0];
        int[] list = new int[2];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
            if (min > array[index]) {
                min = array[index];
            }
        }
        list[0] = min;
        list[1] = max;
        return list;
    }
}
