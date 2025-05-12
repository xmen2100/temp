import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_36 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = input.nextInt();

        char[] keyArray = new char[n];
        for (int i = 0; i < n; i++) {
            keyArray[i] = (char)('A' + i);
        }

        char[][] matrix = new char[n][n];

        System.out.println("Enter " + n + " rows of letters separated by spaces: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.next().charAt(0);
            }
            if (isNotValidRow(matrix[i], keyArray)) {
                System.out.print("Wrong input: the letters must be from A to " +
                    (char)('A' + n - 1));
                return;
            }
        }

        if (areColumnsValid(matrix, keyArray, n)) {
            System.out.print("The input array is a Latin square");
        }
        else {
            System.out.print("The input array is not a Latin square");
        }
    }

    public static boolean isNotValidRow(char[] array, char[] keyArray) {
        char[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        return !Arrays.equals(sortedArray, keyArray);
    }

    public static boolean areColumnsValid(char[][] matrix, char[] keyArray, int n) {
        boolean areColumnsValid = true;

        for (int i = 0; i < n; i++) {
            char[] columnValues  = new char[n];

            for (int j = 0; j < n; j++) {
                columnValues[j] = matrix[j][i];
            }

            if (isNotValidRow(columnValues, keyArray)) {
                System.out.println("Wrong input: the letters in column " +
                    (i + 1) + " must be from A to " + (char)('A' + n - 1));
                areColumnsValid = false;
            }
        }
        return areColumnsValid;
    }
}
