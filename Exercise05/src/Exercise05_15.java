public class Exercise05_15 {
    public static void main(String[] args) {
        int displayPerLine = 10;

        int count = 1; // Start from 1
        for (int i = 33; i <= 126; i++) { // From ! to ~
            if (count % displayPerLine == 0) { // Check if 10 per line
                System.out.println((char)i); // Print char and print new line
            }
            else {
                System.out.print((char)i + " ");
            }
            count++; // Increment count
        }
    }
}
