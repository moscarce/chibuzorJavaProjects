package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMethodTest {
    @Test
    public void canAdd(){
        ArrayMethod sum = new ArrayMethod();
        sum.add(new int[]{1, 2,5});
        assertEquals(8, sum.answer());

    }
}
