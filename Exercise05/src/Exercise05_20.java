public class Exercise05_20 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 8; // Set how many numbers per line
        int count = 0; // Keep count of how many numbers

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true; // Assume all numbers are prime

            for (int divisor = 2; divisor <= i / 2; divisor++) { // Check if number is not prime
                if (i % divisor == 0) { // If divisible than number is not prime
                    isPrime = false;
                    break; // Break out of for loop if not prime
                }
            }

            if (isPrime) {
                count++; // Increment count

                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println(i); // Print then make new line
                }
                else {
                    System.out.print(i + " "); // Print on same line
                }
            }
        }
    }
}