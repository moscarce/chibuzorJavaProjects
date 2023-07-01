package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    public void testConvertSecondsToMinute(){
        Clock time = new Clock();
        time.setHours(25);
        assertEquals(0, time.getMinutes());
        assertEquals(0, time.getSeconds());
        assertEquals(0, time.getHours());
        time.getTime();
    }
    @Test
    public void testSecond(){
        Clock time = new Clock();
        time.setSeconds(30);
        assertEquals(0, time.getMinutes());
        assertEquals(30, time.getSeconds());
        assertEquals(0, time.getHours());
        time.getTime();
    }
    @Test
    public void testConvertSecondsToHour(){
        Clock time = new Clock();
        time.setSeconds(60);
        assertEquals(1, time.getMinutes());
        assertEquals(0, time.getSeconds());
        assertEquals(0, time.getHours());
        time.setSeconds(9543);
        assertEquals(39, time.getMinutes());
        assertEquals(3, time.getSeconds());
        assertEquals(2, time.getHours());
        time.getTime();
    }
    @Test
    public void testMinutes(){
        Clock time = new Clock();
        time.setMinutes(40);
        assertEquals(40, time.getMinutes());
        assertEquals(0, time.getSeconds());
        assertEquals(0, time.getHours());
        time.getTime();
    }
    @Test
    public void testConvertMinutesToHours(){
        Clock time = new Clock();
        time.setMinutes(1441);
        assertEquals(0, time.getMinutes());
        assertEquals(0, time.getSeconds());
        assertEquals(0, time.getHours());
        time.setMinutes(80);
        assertEquals(20, time.getMinutes());
        assertEquals(0, time.getSeconds());
        assertEquals(1, time.getHours());
        time.getTime();
    }
    @Test
    public void testHours(){
        Clock time = new Clock();
        time.setHours(4);
        assertEquals(0, time.getMinutes());
        assertEquals(0, time.getSeconds());
        assertEquals(4, time.getHours());
        time.getTime();
    }
}
