import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double tempInCelsius = input.nextDouble();
        
        double convertToFahrenheit = (9.0 / 5) * tempInCelsius + 32;
        System.out.print(tempInCelsius + " Celsius is " + convertToFahrenheit + " Fahrenheit");

        input.close();
    }
}