package SberEducation.Objects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        this(new GregorianCalendar().getTimeInMillis());
    }

    public MyTime(long time){
        setTime(time);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long time){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(time);
        setSecond(calendar.get(Calendar.SECOND));
        setMinute(calendar.get(Calendar.MINUTE));
        setHour(calendar.get(Calendar.HOUR));
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getTime(){
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }
}
