import java.util.Scanner;

public class Exercise03_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();

		System.out.println("Enter feet: ");
		double heightInFeet = input.nextDouble();

		System.out.println("Enter inches: ");
		double heightInInches = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_FOOT = 0.3048;
		final double METERS_PER_INCH = 0.0254;

		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		double heightInMeters = heightInFeet * METERS_PER_FOOT + heightInInches * METERS_PER_INCH;

		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);

		if (bmi < 18.5) {
			System.out.print("Underweight");
		}

		else if (bmi < 25) {
			System.out.print("Normal");
		} 

		else if (bmi < 30) {
			System.out.print("Overweight");
		}

		else {
			System.out.print("Obese");
		}

		input.close();
	}
}