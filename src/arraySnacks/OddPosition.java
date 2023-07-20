package arraySnacks;

public class OddPosition {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 0, 9, 2, 10};
        oddPosition(new int[]{1, 2, 3, 4, 5, 6});
        oddPosition(numbers);
    }

    private static void oddPosition(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if(index % 2 == 0) System.out.print(array[index] + " ");
        }
        System.out.println();
    }
}
