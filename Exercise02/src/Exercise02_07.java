import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long hours = minutes / 60;
        int days = (int)(hours / 24);
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.print(minutes + " is approximately " + years + " years and " + remainingDays + " days");

        input.close();
    }
}
