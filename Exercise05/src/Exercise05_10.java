public class Exercise05_10 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10; // Display 10 numbers per line

        for (int i = 100, count = 0; i <= 1000; i++) { // Test numbers form 100 - 1000
            if (i % 5 == 0 && i % 6 == 0) { // Test if number is divisible by 5 and 6
                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println(); // Ten per line
                }
                System.out.print(i + " "); // Display results
                count++; // Increment count
            }
        }
    }
}
