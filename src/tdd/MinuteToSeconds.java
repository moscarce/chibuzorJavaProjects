package tdd;

public class MinuteToSeconds {
    private int time;
    private int year;
    private int days;
    private int minutes;
    public void minutes(int minutes) {
        if (minutes > 0)this.minutes=minutes;
        if (minutes > 0)time = minutes*60;
        if (minutes > 0)year = minutes /525600;
        if (minutes > 0)days = minutes /1440;
    }
    public int getSeconds(){
        return time;
    }

    public int getDays() {
        return days;
    }

    public int getYears() {

//        System.out.println(year+"Year(s) "+minutes+"days ");
        return year;
    }
}
