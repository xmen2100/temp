import java.util.Scanner;

public class Exercise06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println("The display pattern for " + n + " is ");
        displayPattern(n);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) { // Print up to n rows
            for (int j = n - i; j >= 1; j--) { // Print spaces n - row# times
                System.out.print("  ");
            }

            for (int j = 1, count = i; j <= i; j++, count--) { // Print pattern row# times
                System.out.print(count + " "); // Print numbers starting from row# then subtract 1 each time per row
            }

            if (i != n) { // Do not print new line at last row
                System.out.println();
            }
        }
    }
}
