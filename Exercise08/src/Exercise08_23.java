import java.util.Scanner;

public class Exercise08_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int r = -1;
        int c = -1;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            int colCount = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
                if (matrix[j][i] == 1) {
                    colCount++;
                }
            }

            if (rowCount % 2 != 0) {
                r = i;
            }
            if (colCount % 2 != 0) {
                c = i;
            }
        }
        System.out.print("The flipped cell is at (" + r + ", " + c + ")");
    }
}
