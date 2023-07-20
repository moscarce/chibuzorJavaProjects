package arraySnacks;

public class EvenPosition {
    public static void main(String[] args) {
        evenPosition(new int[]{1, 2, 3, 4, 5, 6});
        int[] numbers = {6, 3, 0, 9, 2, 10};
        evenPosition(numbers);
    }

    private static void evenPosition(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if(index % 2 == 1) System.out.print(array[index] + " ");
        }
        System.out.println();
    }
}
