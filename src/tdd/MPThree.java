package tdd;

public class MPThree {
    private boolean isOn;
    private int musicNumber;
    private int volume;
    public MPThree(){
        this.musicNumber = 1;
    }
    public void isOn(boolean status) {
        this.isOn = status;
    }
    public boolean isOn(){
        return isOn;
    }

    public int getMusicNumber(){
        return musicNumber;
    }
    public void nextMusic(){
        if(isOn && musicNumber>0)musicNumber++;
    }
    public void previousMusic(){
        if(isOn && musicNumber > 1)musicNumber--;
    }
    public void setVolume(int volumeNumber){
        if(isOn && volumeNumber <= 100 && volumeNumber > 0)this.volume = volumeNumber;
    }
    public int getVolume(){
        return volume;
    }
    public void increaseVolume(){
        if(isOn && volume <= 100 && volume > 0)volume++;
    }
    public void decreaseVolume() {
        if (isOn && volume <= 100 && volume > 0) volume--;
    }
}
