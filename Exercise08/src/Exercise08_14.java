import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        checkRowAndCol(matrix);
        checkDiagonals(matrix);
    }

    public static void checkRowAndCol(int[][] matrix) {
        boolean foundRow = false;
        boolean foundCol = false;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            if (rowSum == matrix[i].length) {
                System.out.println("All 1s on row " + (i + 1));
                foundRow = true;
            }
            else if (rowSum == 0) {
                System.out.println("All 0s on row " + (i + 1));
                foundRow = true;
            }

            if (colSum == matrix.length) {
                System.out.println("All 1s on col " + (i + 1));
                foundCol = true;
            }
            else if (colSum == 0) {
                System.out.println("All 0s on col " + (i + 1));
                foundCol = true;
            }
        }

        if (!foundRow) {
            System.out.println("No same numbers on a row");
        }
        if (!foundCol) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void checkDiagonals(int[][] matrix) {
        int majorDiagSum = 0;
        int subDiagSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    majorDiagSum += matrix[i][j];
                }
                else if (j == matrix[i].length - 1 - i) {
                    subDiagSum += matrix[i][j];
                }
            }
        }

        if (majorDiagSum == matrix.length) {
            System.out.println("All 1s on the major diagonal");
        }
        else if (majorDiagSum == 0) {
            System.out.println("All 0s on the major diagonal");
        }
        else {
            System.out.println("No same numbers on the major diagonal");
        }

        if (subDiagSum == matrix.length) {
            System.out.println("All 1s on the sub-diagonal");
        }
        else if (subDiagSum == 0) {
            System.out.println("All 0s on the sub-diagonal");
        }
        else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}
