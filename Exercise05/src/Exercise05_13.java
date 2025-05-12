public class Exercise05_13 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 3) < 12000) { // Break out of loop when n^3 is not less than 12000
            n++;
        }
        System.out.print("n = " + (n - 1)); // Subtract 1 display results
    }
}
