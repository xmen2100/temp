import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter its width: ");
        int width = input.nextInt();

        System.out.print(format(number, width));
    }

    public static String format(int number, int width) {
        // format string using width and pad with 0s
        return String.format("%0" + width + "d", number);
    }
}
