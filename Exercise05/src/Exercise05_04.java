public class Exercise05_04 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609; // 1 mile = 1.609 kilometers

        System.out.println("Miles\t\tKilometers"); // Display heading

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * KILOMETERS_PER_MILE; // Calculate kilometers
            System.out.printf("%-12d%.3f\n", miles, kilometers); // Display results
        }
    }
}
