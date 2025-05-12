import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the array: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns in the array: ");
        int cols = input.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println(isConsecutiveFour(array));
    }

    public static boolean isConsecutiveFour(int[][] values) {
        for (int[] row : values) {
            for (int j = 0; j < row.length - 3; j++) {
                if (row[j] == row[j + 1] &&
                    row[j] == row[j + 2] &&
                    row[j] == row[j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == values[i + 1][j] &&
                    values[i][j] == values[i + 2][j] &&
                    values[i][j] == values[i + 3][j]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 3; j < values[i].length; j++) {
                if (values[i][j] == values[i + 1][j - 1] &&
                    values[i][j] == values[i + 2][j - 2] &&
                    values[i][j] == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 0; j < values[i].length - 3; j++) {
                if (values[i][j] == values[i + 1][j + 1] &&
                    values[i][j] == values[i + 2][j + 2] &&
                    values[i][j] == values[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        return false;
    }
}
