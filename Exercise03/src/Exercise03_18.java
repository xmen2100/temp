import java.util.Scanner;

public class Exercise03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight: ");
        double weight = input.nextDouble();

        if (weight <= 0) {
            System.out.print("Invalid input.");
        }
        else if (weight <= 1) {
            System.out.print("The shipping cost is $3.5");
        }
        else if (weight <= 3) {
            System.out.print("The shipping cost is $5.5");
        }
        else if (weight <= 10) {
            System.out.print("The shipping cost is $8.5");
        }
        else if (weight <= 20) {
            System.out.print("The shipping cost is $10.5");
        }
        else {
            System.out.print("The package cannot be shipped.");
        }

        input.close();
    }
}
