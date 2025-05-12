import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed miles per hour (must be greater than or equal to 2): ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + .6215 * temp - 35.75 * Math.pow(windSpeed, .16) + .4275 * temp * Math.pow(windSpeed, .16);
        System.out.print("The wind chill index is " + windChill);
        input.close();
    }
}
