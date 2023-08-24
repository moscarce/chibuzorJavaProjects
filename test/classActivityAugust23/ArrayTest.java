package classActivityAugust23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArrayTest {
    @Test
    public void testThatICanSwapItemsInArray(){
        assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5}, Array.swapItems(new int[]{1, 2, 3, 4, 5, 6}));
        assertArrayEquals(new int[]{2,1,4,3,5},Array.swapItems(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    public void testDontSwapIfBothAreOdd(){
        assertArrayEquals(new int[]{45,52,33,11,48,25},Array.swapBothOddNumbers(new int[]{45,52,11,33,48,25}));
    }
    @Test
    public void testSwapFirstWithLastAndSecondWithSecondToTheLastETC(){
        assertArrayEquals(new int[]{25,48,33,11,52,45},Array.swapNumbers(new int[]{45,52,11,33,48,25}));
        assertArrayEquals(new int[]{25,48,33,52,45},Array.swapNumbers(new int[]{45,52,33,48,25}));
    }
}