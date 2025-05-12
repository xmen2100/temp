import java.util.Scanner;

public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        // Prompt user to enter integer
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        // Display results
        System.out.print("The sum of the digits in " + num + " is " + sumDigits(num));
    }
    // Compute sum
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += (int)(n % 10); // Extract digits and convert to int
            n /= 10; // Remove extracted digits
        }
        return sum;
    }
}
