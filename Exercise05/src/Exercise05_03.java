public class Exercise05_03 {
    public static void main(String[] args) {
        double kilogramToPounds = 2.2;

        System.out.println("Kilograms \t Pounds");
        for (int kilogram = 1; kilogram <= 199; kilogram+=2) {
            double pound = kilogram * kilogramToPounds;

            System.out.printf("%-9d\t %6.1f\n", kilogram, pound);
        }
    }
}
