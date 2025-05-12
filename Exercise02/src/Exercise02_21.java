import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the investment amount, for example 120000.95: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate, for example 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer, for example 5: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureValue = (int)(amount * Math.pow(1 + monthlyInterestRate, years * 12) * 100) / 100.0;
        System.out.print("Future value is $" + futureValue);
        input.close();
    }
}
