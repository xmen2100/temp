public class Exercise05_11 {
    public static void main(String[] args) {
        int displayPerLine = 10;

        int count = 1; // Start at 1
        for (int i = 100; i <= 200; i++) { // Display from 100 to 200
            if (i % 5 == 0 ^ i % 6 == 0) { // Divisible by 5 or 6 not both
                if (count % displayPerLine == 0) { // Check if 10 per line
                    System.out.println(i); // Print new line
                }
                else {
                    System.out.print(i + " ");
                }
                count++; // Increment count
            }
        }
    }
}
