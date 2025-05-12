public class Exercise06_01 {
    public static void main(String[] args) {
        int numbersPerLine = 10;

        int count = 1;
        for (int i = 1; i <= 100; i++) {
            if (count % numbersPerLine == 0 && count != 100) { // Print 10 per line no \n on 100th number
                System.out.printf("%7d\n", getPentagonalNumber(i));
            }
            else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
            count++; // Increment count
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
