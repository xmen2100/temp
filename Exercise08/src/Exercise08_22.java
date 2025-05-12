import java.util.Arrays;

public class Exercise08_22 {
    public static void main(String[] args) {
        int n = 6;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }


        int evenNumberOfOnesRow = 0;
        int evenNumberOfOnesCol = 0;
        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            int colCount = 0;

            System.out.println();
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
                if (matrix[j][i] == 1) {
                    colCount++;
                }
            }

            if (rowCount % 2 == 0) {
                System.out.println("Row at index " + i + " has an even number of 1s");
                evenNumberOfOnesRow++;
            }
            else {
                System.out.println("Row at index " + i + " does not have an even number of 1s");
            }

            if (colCount % 2 == 0) {
                System.out.println("Column at index " + i + " has an even number of 1s");
                evenNumberOfOnesCol++;
            }
            else {
                System.out.println("Column at index " + i + " does not have an even number of 1s");
            }
        }

        System.out.println();
        if (evenNumberOfOnesRow == n) {
            System.out.println("All rows have an even number of 1s");
        }
        else {
            System.out.println("Not all rows have an even number of 1s");
        }

        if (evenNumberOfOnesCol == n) {
            System.out.println("All columns have an even number of 1s");
        }
        else {
            System.out.println("Not all columns have an even number of 1s");
        }
    }
}
