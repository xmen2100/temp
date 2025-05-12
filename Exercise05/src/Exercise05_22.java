import java.util.Scanner;

public class Exercise05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        double numberOfYears = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println();
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
        System.out.println();

        System.out.print("Payment#\t  "); // Headers
        System.out.print("Interest  \t");
        System.out.print("Principal\t   ");
        System.out.println("Balance");

        double balance = loanAmount;
        for (int paymentNumber = 1; paymentNumber <= 12; paymentNumber++) { // Keep printing until payment# = 12
            double interest = monthlyInterestRate * balance; // Calculate
            double principal = monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%-4d\t\t  ", paymentNumber); // Display results
            System.out.printf("%8.2f  \t", interest);
            System.out.printf("%9.2f\t   ", principal);
            System.out.printf("%8.2f", balance);
            System.out.println();
        }
    }
}
