public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius \t Fahrenheit\t   |\t   Fahrenheit\t   Celsius");
        System.out.println("----------------------------------------------------------");

        // Start Celsius = 40, -1 each time. Start Fahrenheit = 120, -10 each time. Until Celsius = 31 && Fahrenheit = 30
        for (double celsius = 40, fahrenheit = 120; celsius >= 31 && fahrenheit >= 30; celsius--, fahrenheit-=10) {
            System.out.printf("%-13.1f%-14.1f%-8s%-16.1f%.2f\n", celsius, celsiusToFahrenheit(celsius), "|", fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }

    public static double celsiusToFahrenheit(double celsius) { // Convert from Celsius to Fahrenheit
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) { // Convert from Fahrenheit to Celsius
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
