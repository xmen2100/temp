public class Exercise05_05 {
    public static void main(String[] args) {
        double kilogramToPounds = 2.2;
        double poundToKilograms = 0.454545;

        System.out.println("Kilograms \t\t Pounds\t  |   Pounds \t\t Kilograms");
        for (int kilogram = 1, pound = 20; kilogram <= 199 && pound <= 515; kilogram+=2, pound+=5) {
            double convertKilogram = kilogram * kilogramToPounds;
            double convertPound = pound * poundToKilograms;
            System.out.printf("%-9d \t\t %5.1f\t  |   %-6d \t\t %6.2f\n", kilogram, convertKilogram, pound, convertPound);
        }
    }
}
