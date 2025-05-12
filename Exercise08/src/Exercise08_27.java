import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        double[][] m2 = sortColumns(m);

        System.out.println("\nThe column-sorted array is ");
        for (double[] row : m2) {
            for (double col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] m2 = new double[3][3];
        double[] temp = new double[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp[j] = m[j][i];
            }

            Arrays.sort(temp);
            for (int j = 0; j < 3; j++) {
                m2[j][i] = temp[j];
            }
        }
        return m2;
    }
}
