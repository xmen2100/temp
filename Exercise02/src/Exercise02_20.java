import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and annual interest rate: ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = (int)(balance * (interestRate / 1200) * 100) / 100.0;
        System.out.print("The interest is " + interest);
        input.close();
    }
}
