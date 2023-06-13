package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void bikeOn(){
        Bike user = new Bike();
        user.startBike(true);
        assertTrue(user.isOn());
    }
    @Test
    public void bikeOff(){
        Bike user = new Bike();
        user.startBike(false);
        assertFalse(user.isOn());
    }
    @Test
    public void accelerateBike(){
        Bike user = new Bike();
        user.startBike(true);
        assertTrue(user.isOn());
        user.setSpeed(5);
        assertEquals(5, user.getSpeed());
        assertEquals(1, user.getGear());
        user.accelerateBike();
        assertEquals(6, user.getSpeed());
        user.setSpeed(21);
        assertEquals(21, user.getSpeed());
        assertEquals(2, user.getGear());
        user.accelerateBike();
        assertEquals(23, user.getSpeed());
        user.setSpeed(33);
        assertEquals(33, user.getSpeed());
        assertEquals(3, user.getGear());
        user.accelerateBike();
        assertEquals(36, user.getSpeed());
        user.setSpeed(44);
        assertEquals(44, user.getSpeed());
        assertEquals(4, user.getGear());
        user.accelerateBike();
        assertEquals(48, user.getSpeed());
    }
    @Test
    public void decelerateBike(){
        Bike user = new Bike();
        user.startBike(true);
        assertTrue(user.isOn());
        user.setSpeed(5);
        assertEquals(5, user.getSpeed());
        assertEquals(1, user.getGear());
        user.decelerateBike();
        assertEquals(4, user.getSpeed());
        user.setSpeed(21);
        assertEquals(21, user.getSpeed());
        assertEquals(2, user.getGear());
        user.decelerateBike();
        assertEquals(19, user.getSpeed());
        assertEquals(1, user.getGear());
        user.setSpeed(34);
        assertEquals(34, user.getSpeed());
        assertEquals(3, user.getGear());
        user.decelerateBike();
        assertEquals(31, user.getSpeed());
        user.setSpeed(45);
        assertEquals(45, user.getSpeed());
        assertEquals(4, user.getGear());
        user.decelerateBike();
        assertEquals(41, user.getSpeed());
    }
    @Test
    public void gearSpeed(){
        Bike user = new Bike();
        user.startBike(true);
        assertTrue(user.isOn());
        user.setSpeed(5);
        assertEquals(5, user.getSpeed());
        assertEquals(1, user.getGear());
        user.setSpeed(21);
        assertEquals(21, user.getSpeed());
        assertEquals(2, user.getGear());
        user.setSpeed(34);
        assertEquals(34, user.getSpeed());
        assertEquals(3, user.getGear());
        user.setSpeed(45);
        assertEquals(45, user.getSpeed());
        assertEquals(4, user.getGear());
    }
}
