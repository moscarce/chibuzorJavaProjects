package tdd;

public class Bike {
    private boolean startBike;
    private int speed;
    private int gear;

    public void startBike(boolean status) {
        this.startBike = status;
    }

    public boolean isOn() {
        return startBike;
    }
    public void setSpeed(int speed){
        if(startBike)this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public int getGear(){
        if (startBike && speed >= 0 && speed <= 20)gear = 1;
        if (startBike && speed >= 21 && speed <= 30)gear = 2;
        if (startBike && speed >= 31 && speed <= 40)gear = 3;
        if (startBike && speed >= 41)gear = 4;

        return gear;
    }

    public void accelerateBike(){
        if (startBike && speed >= 0 && speed <= 20)speed++;
        if (startBike && speed >= 21 && speed <= 30)speed+=2;
        if (startBike && speed >= 31 && speed <= 40)speed+=3;
        if (startBike && speed >= 41)speed+=4;
    }
    public void decelerateBike(){
        if (startBike && speed >= 0 && speed <= 20)speed--;
        if (startBike && speed >= 21 && speed <= 30)speed-=2;
        if (startBike && speed >= 31 && speed <= 40)speed-=3;
        if (startBike && speed >= 41)speed-=4;
    }
}
