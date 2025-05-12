public class Exercise08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

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

        int maxRowCount = 0;
        int maxRowIndex = 0;
        int maxColCount = 0;
        int maxColIndex = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 1) {
                maxRowCount++;
            }

            if (matrix[i][0] == 1) {
                maxColCount++;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            int rowCount = 0;
            int colCount = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
                if (matrix[j][i] == 1) {
                    colCount++;
                }
            }

            if (maxRowCount < rowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
            if (maxColCount < colCount) {
                maxColCount = colCount;
                maxColIndex = i;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.print("The largest column index: " + maxColIndex);
    }
}
