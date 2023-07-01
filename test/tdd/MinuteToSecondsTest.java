package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinuteToSecondsTest {
    @Test
    public void testMinuteToSecondsMethod(){
        MinuteToSeconds time = new MinuteToSeconds();
        time.minutes(2);
        assertEquals(120, time.getSeconds());
        assertEquals(0, time.getYears());
    }
    @Test
    public void testMinuteToDaysMethod(){
        MinuteToSeconds time = new MinuteToSeconds();
        time.minutes(3000);
        assertEquals(2, time.getDays());
    }
    @Test
    public void testMinuteToYearsMethod(){
        MinuteToSeconds time = new MinuteToSeconds();
        time.minutes(1200000);
        assertEquals(2, time.getYears());
    }
    @Test
    public void testMinuteMethodDoesNotTakeNegativeNumbers(){
        MinuteToSeconds time = new MinuteToSeconds();
        time.minutes(-600000);
        assertEquals(0, time.getSeconds());
        assertEquals(0,time.getDays());
        assertEquals(0,time.getYears());

    }
}
