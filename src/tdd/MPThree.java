package tdd;

public class MPThree {
    private boolean isOn;
    private int musicNumber;
    private int volume;
    private boolean pause;
    public MPThree(){
        this.musicNumber = 1;
    }
    public void power() {
        isOn = !isOn;
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
    public void pause(boolean status) {
        if(isOn)pause = !pause;
    }
    public boolean getPause(){
        return pause;
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
