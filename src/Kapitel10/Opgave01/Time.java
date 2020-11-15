package Kapitel10.Opgave01;

public class Time {
    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    private long hour;
    private long minute;
    private long second;
    private static long elapsedTime;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        this.hour = totalHour % 24;
        System.out.println("Current time is " + hour + ":" + minute + ":" + second + " GMT");
    }

    public Time(int elapsedTime) {
        this.elapsedTime = elapsedTime;
        long totalMilliseconds = elapsedTime;
        long totalSeconds = totalMilliseconds / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        this.hour = totalHour % 24;
        System.out.println("Current time is " + hour + ":" + minute + ":" + second + " GMT");
    }
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        System.out.println("Current time is " + this.hour + ":" + this.minute + ":" + this.second + " GMT");
    }
    public void setTime(long elapseTime) {
        this.elapsedTime = elapseTime;

    }
}
