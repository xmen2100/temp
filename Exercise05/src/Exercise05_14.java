import java.util.Scanner;

public class Exercise05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first positive integer: "); // Prompt user for first number
        int n1 = input.nextInt();
        System.out.print("Enter the second positive integer: "); // Prompt user for second number
        int n2 = input.nextInt();
        int d = Math.min(n1, n2); // d is the minimum of the two

        while (n1 % d != 0 || n2 % d != 0) { // While at least 1 number is not divisible by d
            d--; // Decrement d
        }
        // Display result
        System.out.print("The gcd of " + n1 + " and " + n2 + " is " + d);
    }
}
