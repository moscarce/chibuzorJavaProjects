package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
        public void acIsOn(){
        AirConditioner samsung = new AirConditioner("samsung");
        samsung.setOn(true);
        assertTrue(samsung.isOn());
    }
    @Test
    public void acIsOff(){
        AirConditioner samsung = new AirConditioner("samsung");
        samsung.setOn(false);
        assertFalse(samsung.isOn());
    }
    @Test
    public void defaultTemperature(){
        AirConditioner samsung = new AirConditioner("samsung");
        samsung.setOn(true);
        assertEquals(16, samsung.getTemperature());
    }
    @Test
    public void setTemperature(){
        AirConditioner samsung = new AirConditioner("samsung");
        samsung.setOn(true);
        assertEquals(16, samsung.getTemperature());
        samsung.setTemperature(19);
        int currentTemperature = samsung.getTemperature();
        assertEquals(19, currentTemperature);
    }
    @Test
    public void increaseTemperatureMax(){
        AirConditioner samsung = new AirConditioner("samsung");
        samsung.setOn(true);
        int currentTemperature = samsung.getTemperature();
        assertEquals(16, currentTemperature);
        samsung.setTemperature(29);
        assertEquals(29, samsung.getTemperature());
        samsung.increaseTemperature();
        currentTemperature = samsung.getTemperature();
        assertEquals(30, currentTemperature);
        samsung.increaseTemperature();
        currentTemperature = samsung.getTemperature();
        assertEquals(30, currentTemperature);
        samsung.increaseTemperature();
        currentTemperature = samsung.getTemperature();
        assertEquals(30, currentTemperature);
    }
    @Test
    public void decreaseTemperatureMin(){
        AirConditioner samsung = new AirConditioner("samsung");
        samsung.setOn(true);
        int currentTemperature = samsung.getTemperature();
        assertEquals(16, currentTemperature);
        samsung.setTemperature(17);
        assertEquals(17, samsung.getTemperature());
        samsung.decreaseTemperature();
        currentTemperature = samsung.getTemperature();
        assertEquals(16, currentTemperature);
        samsung.decreaseTemperature();
        currentTemperature = samsung.getTemperature();
        assertEquals(16, currentTemperature);
        samsung.decreaseTemperature();
        currentTemperature = samsung.getTemperature();
        assertEquals(16, currentTemperature);
    }
}
