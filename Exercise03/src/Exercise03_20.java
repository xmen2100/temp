import java.util.Scanner;

public class Exercise03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        if (temperature < -58 || temperature > 41) {
            System.out.print("Temperature must be between -58°F and 41°F");
            System.exit(0);
        }

        System.out.print("Enter the wind speed miles per hour: ");
        double windSpeed = input.nextDouble();

        if (windSpeed < 2) {
            System.out.print("Speed must be greater than or equal to 2");
            System.exit(0);
        }

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 
                0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.print("The wind chill index is " + windChill);

        input.close();
    }
}
