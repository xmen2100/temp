import java.util.Scanner;

public class Exercise05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200; // Divide 100 to get decimal then divide 12 to get month

        System.out.print("Enter the number of months: ");
        int numberOfMonths = input.nextInt();

        double monthlyAmount = 0;
        for (int count = 1; count <= numberOfMonths; count++) {
            monthlyAmount = (amount + monthlyAmount) * (1 + monthlyInterestRate);
            System.out.printf("%.3f\n", monthlyAmount);
        }
        System.out.printf("The amount in the savings account after " +
                numberOfMonths + " month(s) is $%.2f", monthlyAmount);
    }
}
