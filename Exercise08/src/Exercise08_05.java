import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] matrix3 = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are as follows");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(" " + matrix1[i][j]);
            }

            if (i == 1) {
                System.out.print("  +  ");
            }
            else {
                System.out.print("     ");
            }

            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(" " + matrix2[i][j]);
            }

            if (i == 1) {
                System.out.print("  =  ");
            }
            else {
                System.out.print("     ");
            }

            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print(" " + matrix3[i][j]);
            }

            if (i < 2) {
                System.out.println();
            }
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
