import java.util.Scanner;

public class Exercise05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double initialDepositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        System.out.println();
        System.out.println("Month\t CD Value");

        double monthlyAmount = initialDepositAmount;
        for (int count = 1; count <= numberOfMonths; count++) { // Until reach number of months
            monthlyAmount = monthlyAmount + monthlyAmount * annualPercentYield / 1200; // Calculate monthly amount

            System.out.printf("%-9d%.2f\n", count, monthlyAmount);
        }
    }
}
