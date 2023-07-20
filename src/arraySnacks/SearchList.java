package arraySnacks;

public class SearchList {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 0, 9, 2, 10};
        search(new int[]{1, 2, 3, 4, 5, 6}, 6);
        search(numbers,20);
    }

    private static void search(int[] array, int element) {
        for (int index = 0; index < array.length;index++){
            if (array[index] == element){
                System.out.println(element + " occurs in the list");
                return;
            }
        }
        System.out.println(element + " does not occur in the list");
    }
}
