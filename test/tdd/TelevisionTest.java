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
    @Test
    public void channel(){
        Television sony = new Television();
        sony.isOn(true);
        assertTrue(sony.getIsOn());
        sony.setChannel(99);
        assertEquals(99, sony.getChannelNumber());
        sony.nextChannel();
        assertEquals(100, sony.getChannelNumber());
        sony.previousChannel();
        assertEquals(99, sony.getChannelNumber());
    }
    @Test
    public void volume(){
        Television sony = new Television();
        sony.isOn(true);
        assertTrue(sony.getIsOn());
        sony.setVolume(99);
        assertEquals(99, sony.getVolume());
        sony.increaseVolume();
        assertEquals(100, sony.getVolume());
        sony.decreaseVolume();
        assertEquals(99, sony.getVolume());
    }
}
