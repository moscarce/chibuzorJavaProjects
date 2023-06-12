package tdd;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume;
    public void isOn(boolean status) {
        this.isOn = status;
    }
    public boolean getIsOn(){
        return isOn;
    }
    public void setChannel(int channelNumber){
        if(isOn && channel <= 300 && channel > 0)this.channel = channelNumber;
    }
    public int getChannel(){
        return channel;
    }
    public void nextChannel(){
        if(isOn && channel <= 300 && channel > 0)channel++;
    }
    public void previousChannel(){
        if(isOn && channel <= 300 && channel > 0)channel--;
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
