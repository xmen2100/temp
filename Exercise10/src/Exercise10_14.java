import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise10_14 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println("Year: " + myDate.getYear());
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());

        System.out.println();
        MyDate myDate2 = new MyDate( 34355555133101L);
        System.out.println("Year: " + myDate2.getYear());
        System.out.println("Month: " + myDate2.getMonth());
        System.out.println("Day: " + myDate2.getDay());
    }
}

class MyDate {
    private int year, month, day;

    public MyDate() {
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH); // month is 0-based ex. 0 for January
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
