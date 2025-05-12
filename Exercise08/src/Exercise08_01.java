import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int rowIndex = 0; rowIndex < m.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++) {
                m[rowIndex][columnIndex] = input.nextDouble();
            }
        }

        for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
            System.out.println("Sum of the elements at column " + columnIndex + " is " + sumColumn(m, columnIndex));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }
}
