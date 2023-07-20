package arraySnacks;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 0, 9, 2, 10};
        largestElement(new int[]{1, 2, 3, 4, 5, 6});
        largestElement(numbers);
    }

    private static void largestElement(int[] array) {
        int max = array[0];
        for (int index = 0; index < array.length;index++){
            if (array[index] > max)max = array[index];
        }
        System.out.println("Largest number in the list is " + max);
    }

}
