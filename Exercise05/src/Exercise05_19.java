public class Exercise05_19 {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) { // 8 rows
            for (int col = 7; col >= row; col--) {
                System.out.print("    "); // Print spaces 7 - (row #)
            }

            for (int col = 1, count = 0; col <= row; col++, count++) { // Print # of times = row #
                System.out.printf("%4d", (int)Math.pow(2, count)); // count var for incrementing # pattern each row
            } // right alignment

            for (int col = 1, count = row - 2; col <= row - 1; col++, count--) { // Print up to 1 less than row #
                System.out.printf("%4d", (int)Math.pow(2, count)); // start from 2^(row# - 2) then -1 to row each time
            }
            
            System.out.println();
        }
    }
}
