package classActivityAugust23;

public class FilterList {


    private static int countOddNumbersInList(int[] numbers) {
        int count = 0;
        for (int number: numbers ) {
            if(isOdd(number))count++;
        }
        return count;
    }

    private static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    private static int[] getOddNumbers(int[] list) {
        int[] newList = createNewList(list);
        int[] filledList = fillList(newList,list);
        return newList;
    }

    private static int[] fillList(int[] newList, int[] oldList) {
        int newListIndex = 0;
        for (int number : oldList) {
            if (isOdd(number)) {
                newList[newListIndex] = number;
                newListIndex++;
            }
        }
        return newList;
    }

    private static int[] createNewList(int[] list) {
        int size = countOddNumbersInList(list);
        return new int[size];
    }

    public static int[] subtractTwoFromOddNumbers(int[] list) {
        int[] oddNumbers = getOddNumbers(list);
        for (int index = 0; index < oddNumbers.length; index++) {
            oddNumbers[index] = oddNumbers[index] - 2;
        }
        return oddNumbers;
    }
}
