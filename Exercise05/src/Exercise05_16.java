import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: "); // Prompt user to enter integer
        int num = input.nextInt();

        System.out.print("The factors for " + num + " are ");
        int factor = 2; // Start with factor 2
        while (num != 1) { // Check num is not equal to 1
            if (num % factor == 0) { // Test if num is divisible by factor
                System.out.print(factor + ", "); // Display results
                num /= factor; // Divide num by factor
            }
            else {
                factor++; // Increment factor
            }
        }
        System.out.print("\b\b.");
    }
}
