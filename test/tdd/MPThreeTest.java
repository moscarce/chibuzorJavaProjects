package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MPThreeTest {
    @Test
    public void isOn(){
        MPThree sony = new MPThree();
        sony.isOn(true);
        assertTrue(sony.getIsOn());
        sony.isOn(false);
        assertFalse(sony.getIsOn());
    }
    @Test
    public void volume(){
        MPThree sony = new MPThree();
        sony.isOn(true);
        assertTrue(sony.getIsOn());
        sony.setVolume(49);
        assertEquals(49, sony.getVolume());
        sony.increaseVolume();
        assertEquals(50, sony.getVolume());
        sony.decreaseVolume();
        assertEquals(49, sony.getVolume());
    }
    @Test
    public void musicButtons(){
        MPThree sony = new MPThree();
        sony.isOn(true);
        assertTrue(sony.getIsOn());
        sony.nextMusic();
        assertEquals(2, sony.getMusicNumber());
        sony.nextMusic();
        assertEquals(3, sony.getMusicNumber());
        sony.previousMusic();
        assertEquals(2, sony.getMusicNumber());
    }
}
