package tdd;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public void isOn(boolean status) {
        this.isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }
    public void setSpeed(int speed){
        if(isOn)this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public int getGear(){
        if (isOn && speed >= 0 && speed <= 20)gear = 1;
        if (isOn && speed >= 21 && speed <= 30)gear = 2;
        if (isOn && speed >= 31 && speed <= 40)gear = 3;
        if (isOn && speed >= 41)gear = 4;

        return gear;
    }

    public void accelerateBike(){
        if (isOn && speed >= 0 && speed <= 20)speed++;
        if (isOn && speed >= 21 && speed <= 30)speed+=2;
        if (isOn && speed >= 31 && speed <= 40)speed+=3;
        if (isOn && speed >= 41)speed+=4;
    }
    public void decelerateBike(){
        if (isOn && speed >= 0 && speed <= 20)speed--;
        if (isOn && speed >= 21 && speed <= 30)speed-=2;
        if (isOn && speed >= 31 && speed <= 40)speed-=3;
        if (isOn && speed >= 41)speed-=4;
    }
}
