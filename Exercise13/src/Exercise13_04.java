import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exercise13_04 {
    public static void main(String[] args) {
        Calendar myCalendar = new GregorianCalendar();
        myCalendar.setTime(new Date());

        int month = myCalendar.get(Calendar.MONTH) + 1;
        int year = myCalendar.get(Calendar.YEAR);

        if (args.length == 0) {
            printCalendar(month, year);
        }
        else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
            printCalendar(month, year);
        }
        else {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[1]);
            printCalendar(month, year);
        }
    }

    public static void printCalendar(int month, int year) {
        printMonth(month, year);
    }

    public static void printMonth(int month, int year) {
        printMonthTitle(month, year);
        printMonthBody(month, year);
    }

    public static void printMonthTitle(int month, int year) {
        System.out.printf("%14s %d\n", getMonthName(month), year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public static void printMonthBody(int month, int year) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, 1);
        int startDay = myCalendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < startDay - 1; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= numberOfDaysInMonth; i++, startDay++) {
            if (startDay % 7 == 0) {
                System.out.printf("%4d\n", i);
            }
            else {
                System.out.printf("%4d", i);
            }
        }
    }
}