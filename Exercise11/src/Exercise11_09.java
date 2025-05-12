import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        System.out.println("The random array is");
        displayArray(matrix);

        ArrayList<Integer> sumOfRow = new ArrayList<>();
        ArrayList<Integer> sumOfCol = new ArrayList<>();

        for (int[] row : matrix) {
            int rowSum = 0;
            for (int col : row) {
                rowSum += col;
            }
            sumOfRow.add(rowSum);
        }

        for (int i = 0; i < matrix.length; i++) {
            int colSum = 0;
            for (int[] row : matrix) {
                colSum += row[i];
            }
            sumOfCol.add(colSum);
        }

        System.out.print("The largest row index: ");
        displayLargestIndex(sumOfRow);
        System.out.println();

        System.out.print("The largest column index: ");
        displayLargestIndex(sumOfCol);
    }

    public static void displayArray(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void displayLargestIndex(ArrayList<Integer> list) {
        int max = java.util.Collections.max(list);
        int numOfMax = numberOfLargest(list, max);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                if (numOfMax > 1) {
                    System.out.print(i + ", ");
                }
                else {
                    System.out.print(i);
                }
                numOfMax--;
            }
        }
    }

    public static int numberOfLargest(ArrayList<Integer> list, int max) {
        int num = 0;

        for (int sum : list) {
            if (sum == max) {
                num++;
            }
        }
        return num;
    }

}
