package arraySnacks;

import java.util.Arrays;

public class ComputRunningTotal {
        public static void main(String[] args) {
            int[] numbers = {6, 3, 0, 9, 2, 10};
            runningTotal(new int[]{1, 2, 3, 4, 5, 6});
            runningTotal(numbers);
        }

        private static void runningTotal(int[] array){
            int[] runningTotal = new int[array.length];
            int total = 0;
            for (int index = 0; index < array.length; index++) {
                total += array[index];
                runningTotal[index] = total;
            }
            System.out.println(Arrays.toString(runningTotal));
        }
}
