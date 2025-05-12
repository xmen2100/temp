import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int n = input.nextInt();
        int[][] m = new int[n][n];

        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }

        int[] largestBlock = findLargestBlock(m);
        System.out.print("The maximum square sub-matrix is at (" + largestBlock[0] +
            ", " + largestBlock[1] + ") with size " + largestBlock[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        /* Each element of m2 is the size of the largest square sub-matrix that
        can be formed with all 1s with its bottom right corner at that index */
        int[][] m2 = new int[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == 0 || j == 0) {
                    m2[i][j] = m[i][j];
                }
                else if (m[i][j] == 1) {
                    m2[i][j] = Math.min(m2[i - 1][j - 1],
                        Math.min(m2[i - 1][j], m2[i][j - 1])) + 1;
                }
                else {
                    m2[i][j] = 0;
                }
            }
        }
        return locateLargest(m2);
    }

    public static int[] locateLargest(int[][] a) {
        int max = a[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    maxRow = i - (max - 1); // get top-left row index of sub-matrix
                    maxCol = j - (max - 1); // get top-left col index of sub-matrix
                }
            }
        }
        return new int[] {maxRow, maxCol, max};
    }
}
