package arraySnacks;

import java.util.Arrays;
import java.util.Collections;

public class ElementsPosition {

    private static int[] positions;

    public static int[] checkPosition(int[] ints) {
        Integer[] sortedInts = new Integer[ints.length];
        for (int index = 0; index < ints.length; index++) {
            sortedInts[index] = ints[index];
        }
        Arrays.sort(sortedInts, Collections.reverseOrder());
        positions = new int[sortedInts.length];
        for (int index = 0; index < ints.length; index++) {
            for (int i = 0; i < sortedInts.length; i++) {
                if(ints[index] == sortedInts[i]){
                    positions[index] = i+1;
                }
            }
        }
        return positions;
    }
}
