public class Exercise05_06 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609; // 1 mile = 1.609 kilometers
        final double MILES_PER_KILOMETER = 0.6215; // 1 kilometer = 0.6215 miles

        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles"); // Display heading
        for (int miles = 1, kilometers2 = 20; miles <= 10 && kilometers2 <= 65; miles++, kilometers2 += 5) {
                double kilometers = miles * KILOMETERS_PER_MILE; // Calculate kilometers
                double miles2 = kilometers2 * MILES_PER_KILOMETER; // Calculate miles
                System.out.printf("%-12d%-12.3f|\t%-16d%.3f\n", miles, kilometers, kilometers2, miles2); // Display results
            }
        }
    }

