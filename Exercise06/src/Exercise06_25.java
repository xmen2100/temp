import java.util.Scanner;

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a long integer for milliseconds: ");
        long millis = input.nextLong();

        System.out.print(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long seconds = millis / 1000; // convert to total seconds
        long currentSecond = seconds % 60; // compute current second in minute in hour
        long minutes = seconds / 60; // convert to total minutes
        long currentMinute = minutes % 60; // compute to current minute in hour
        long hours = minutes / 60; // convert to total hours

        return hours + ":" + currentMinute + ":" + currentSecond;
    }
}
