import java.sql.SQLOutput;
import java.util.GregorianCalendar;

public class Exercise09_05 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("Current year: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println("\nYear: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
