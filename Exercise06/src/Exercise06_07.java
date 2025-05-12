import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200; // Divide by 100 to turn to decimal and 12 for monthly

        System.out.println("Years\t  Future Value"); // Print header
        for (int years = 1; years <= 30; years++) { // Print up til 30 years
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n", futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
