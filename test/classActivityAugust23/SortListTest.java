package classActivityAugust23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    @Test
    public void testThatICanSubtractTwoFromTheOddNumbersInTheList(){
        assertArrayEquals(new int[]{39,13,-1},FilterList.subtractTwoFromOddNumbers(new int[]{22,41,15,8,2,1}));

    }
}