import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 3;
        double[][] matrix = new double[n][n];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.print("It is a Markov matrix");
        }
        else {
            System.out.print("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            double sum = 0;

            for (int j = 0; j < m[i].length; j++) {
                if (!(m[i][j] > 0)) {
                    return false;
                }
                sum += m[j][i];
            }

            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
}
