import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number / 100;
        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.print("The sum of all digits in " + number + " is " + sum);

        input.close();
    }
}
