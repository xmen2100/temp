import java.util.Scanner;

public class Exercise03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double pricePerWeight1 = price1 / weight1;
        double pricePerWeight2 = price2 / weight2;

        if (pricePerWeight1 > pricePerWeight2) {
            System.out.print("Package 2 has a better price.");
        }
        else if (pricePerWeight2 > pricePerWeight1) {
            System.out.print("Package 1 has a better price.");
        }
        else if (pricePerWeight1 == pricePerWeight2) {
            System.out.print("They both have the same price.");
        }
        input.close();
    }
}
