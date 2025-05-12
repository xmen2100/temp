import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * .45359237;
        double meters = inches * .0254;
        double bmi = kilograms / Math.pow(meters, 2);
        System.out.print("BMI is " + bmi);
        input.close();
    }
}
