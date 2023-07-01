package tdd;

public class Clock {
    private int seconds;
    private int minutes;
    private int hours;
    public void setSeconds(int seconds){
        if (seconds > 0 && seconds < 60)this.seconds = seconds;
        else if (seconds >= 60 && seconds < 3600){
            minutes = seconds / 60;
            this.seconds = seconds % 60;
        }
        else if (seconds >= 3600) {
            hours = seconds / 3600;
            int hoursToMinute = seconds % 3600;
            minutes = hoursToMinute / 60;
            this.seconds = hoursToMinute % 60;
        }
    }
    public void setMinutes(int minutes){
        if (minutes > 0 && minutes < 60)this.minutes = minutes;
        else if(minutes >= 60 && minutes < 1440) {
                hours = minutes / 60;
                this.minutes = minutes % 60;
            }
    }
    public void setHours(int hours){
        if (hours > 0 && hours < 24)this.hours = hours;
    }
    public int getSeconds(){
        return seconds;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getHours(){
        return hours;
    }
    public void getTime(){
        System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");
    }
}