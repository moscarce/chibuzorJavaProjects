package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void isOn(){
        Television sony = new Television();
        sony.isOn(true);
        assertTrue(sony.getIsOn());
        sony.isOn(false);
        assertFalse(sony.getIsOn());
    }
}
