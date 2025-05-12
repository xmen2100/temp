import java.util.Scanner;

public class Exercise05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Activate Scanner

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println();
        System.out.print("Interest Rate    ");
        System.out.print("Monthly Payment    ");
        System.out.println("Total Payment");
        // Create loop for percent annual interest rate
        for (double annualInterestRatePercent = 5; annualInterestRatePercent <= 8; annualInterestRatePercent += 0.125) {
            double annualInterestRate = annualInterestRatePercent / 100; // Divide by 100 to get as decimal
            double monthlyInterestRate = annualInterestRate / 12; // Divide by 12 to get monthly rate
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            // Display results
            System.out.printf("%.3f%%", annualInterestRatePercent);
            System.out.print("           ");
            System.out.printf("%-19.2f", monthlyPayment);
            System.out.printf("%.2f", totalPayment);
            System.out.println();
        }
    }
}
