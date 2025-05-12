import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.print(num + " is a palindrome");
        }
        else {
            System.out.print(num + " is not a palindrome");
        }
    }

    public static int reversal(int number) {
        int numberReversed = 0;
        while (number != 0) { // Continue until number becomes 0
            numberReversed = number % 10 + numberReversed * 10; // Get last digit and make it first digit
            number /= 10; // Remove last digit
        }
        return numberReversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reversal(number);
    }
}
