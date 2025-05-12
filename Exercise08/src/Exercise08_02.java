import java.util.Scanner;

public class Exercise08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int rowIndex = 0; rowIndex < m.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++) {
                m[rowIndex][columnIndex] = input.nextDouble();
            }
        }
        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int rowIndex = 0; rowIndex < m.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < m[rowIndex].length; columnIndex++) {
                if (rowIndex == columnIndex) {
                    sum += m[rowIndex][columnIndex];
                }
            }
        }
        return sum;
    }
}
