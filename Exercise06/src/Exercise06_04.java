import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        // Prompt the user to enter an integer
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        // Display results
        System.out.print("The reversal of " + num + " is ");
        reverse(num);
    }

    // Print the reversal
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10); // Print extracted number
            number /= 10; // Remove extracted number
        }
    }
}
