package arraySnacks;

import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 0, 9, 2, 10};
        reverseList(new int[]{1, 2, 3, 4, 5, 6});
        reverseList(numbers);
    }

    private static void reverseList(int[] array) {
        int[] reversedList = new int[array.length];
        int reverseIndex = 0;
        for (int index = (array.length - 1); index >= 0;index--){
            reversedList[reverseIndex] = array[index];
            reverseIndex += 1;
        }
        System.out.println(Arrays.toString(reversedList));
    }
}
