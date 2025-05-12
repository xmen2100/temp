public class Exercise05_12 {
    public static void main(String[] args) {
        int n = 0; // Set n = 0

        while(n * n <= 12000) { // If n squared is less than 12000, increment n
            n++;
        }
        // Return n when n squared is no longer less than or equal to 12000
        System.out.print("The smallest integer " + n + " squared is greater than 12,000");
    }
}
