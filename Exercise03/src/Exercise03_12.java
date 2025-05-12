import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int integer = input.nextInt();

        if (integer % 10 == integer / 100) {
            System.out.print(integer + " is a palindrome");
        }

        else {
            System.out.print(integer + " is not a palindrome.");
        }

        input.close();
    }
}
