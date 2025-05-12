import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_24 {
    public static void main(String[] args) {
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" :
            "Invalid solution");
    }

    public static int[][] readASolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution: ");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                }
            }
        }
        return is1To9RowsAndCols(grid) && is1To9Boxes(grid);
    }

    public static boolean is1To9RowsAndCols(int[][] grid) {
        int[] oneTo9 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 9; i++) {
            int[] numbersInRow = new int[9];
            int[] numbersInCol = new int[9];

            for (int j = 0; j < 9; j++) {
                numbersInRow[j] = grid[i][j];
                numbersInCol[j] = grid[j][i];
            }

            Arrays.sort(numbersInRow);
            Arrays.sort(numbersInCol);
            if (!Arrays.equals(numbersInRow, oneTo9) ||
                !Arrays.equals(numbersInCol, oneTo9)) {
                return false;
            }
        }
        return true;
    }

    public static boolean is1To9Boxes(int[][] grid) {
        int[] oneTo9 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int k = 0;

                int[] numbersInBox = new int[9];
                for (int rowIndex = i * 3; rowIndex < (i + 1) * 3; rowIndex++) {
                    for (int colIndex = j * 3; colIndex < (j + 1) * 3; colIndex++) {
                        numbersInBox[k] = grid[rowIndex][colIndex];
                        k++;
                    }
                }

                Arrays.sort(numbersInBox);
                if (!Arrays.equals(numbersInBox, oneTo9)) {
                    return false;
                }
            }
        }
        return true;
    }
}
