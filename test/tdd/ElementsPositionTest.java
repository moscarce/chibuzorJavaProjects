package tdd;

import arraySnacks.ElementsPosition;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementsPositionTest {
    @Test
    public void testElementsPositon(){
        int[] result = ElementsPosition.checkPosition(new int[]{6, 18, 32, 3, 4});
        int[] expected = {3,2,1,5,4};
        assertArrayEquals(expected, result);
    }
}
