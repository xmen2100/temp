import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        System.out.print("Enter the time zone offset to GMT: ");
        byte offset = input.nextByte();

        long currentHourInTimeZone = currentHour + offset;

        // Display results
        System.out.println("Current time is " + currentHourInTimeZone + ":"
        + currentMinute + ":" + currentSecond);
            input.close();
    }
}
