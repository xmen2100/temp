public class Exercise10_01 {
    public static void main(String[] args) {
        Time time = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + " GMT");
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond() + " GMT");
        System.out.println(time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond() + " GMT");
    }
}

class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        hour = totalHours % 24;
    }

    public Time(long totalMilliseconds) {
        setTime(totalMilliseconds);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;

        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        hour = totalHours % 24;
    }
}
