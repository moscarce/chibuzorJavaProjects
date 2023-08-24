package classActivityAugust23;

public class Array {

    public static int[] swapItems(int[] list) {
        for (int index = 0; index < list.length; index+=2) {
            if(isFull(index,list)) break;
            switchElements(index,index+1,list);
        }
        return list;
    }

    public static int[] swapBothOddNumbers(int[] list) {
        for (int index = 0; index < list.length; index+=2) {
            if(isFull(index,list)) break;
            if (isEven(index,list)) continue;
            if (isEven(index+1,list)) continue;
            switchElements(index,index+1,list);
        }
        return list;
    }

    public static int[] swapNumbers(int[] list) {
        int lastElement = list.length-1;
        for (int index = 0; index < list.length/2; index++) {
            switchElements(index,lastElement-index,list);
        }
        return list;
    }

    private static void switchElements(int firstIndex, int secondIndex, int...list){
        var temp = list[firstIndex];
        var secondTemp = list[secondIndex];
        list[firstIndex] = secondTemp;
        list[secondIndex] = temp;
    }
    private static boolean isFull(int index,int... list){
        return index+1 == list.length;
    }
    private static boolean isEven(int index, int... list){
        return list[index] % 2 == 0;
    }
}
