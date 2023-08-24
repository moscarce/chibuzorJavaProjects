package classActivityAugust23;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitElements(new int[]{23, 45, 60, 38})));
        System.out.println(Arrays.toString(splitElements(new int[]{23, 45, 60, 38},1)));
        System.out.println(Arrays.toString(splitElements(new int[]{999},1)));
    }

    private static int[] splitElements(int[] array) {
        String list = concatenateList(array);
        return split(list);
    }
    private static int[] splitElements(int[] array,int num) {
        String list = concatenateList(array,num);
        return split(list);
    }

    private static String concatenateList(int[] array){
        String list = "";
        for (int number:array  ) {
            list += number;
        }
        return list;
    }

    private static String concatenateList(int[] array, int num){
        String list = "";
        for (int number:array  ) {
            list += (number + num);
        }
        return list;
    }
    private static int[] split(String input){
        int[] output = new int[input.length()];
        for (int index = 0; index < input.length(); index++) {
            output[index] = Integer.parseInt(String.valueOf(input.charAt(index)));
        }
        return output;
    }

}
