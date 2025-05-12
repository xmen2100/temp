import java.util.Scanner;

public class Exercise08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[2][2];
        double[] b = new double[2];

        System.out.print("Enter a00, a01, a10, a11, b0, b1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }

        double[] result = linearEquation(a, b);
        if (result == null) {
            System.out.print("The equation has no solution");
        }
        else {
            System.out.print("x is " + result[0] + " and y is " + result[1]);
        }
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
            return null;
        }

        double x = (b[0] * a[1][1] - b[1] * a[0][1])
            / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double y = (b[1] * a[0][0] - b[0] * a[1][0])
            / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        return new double[] {x, y};
    }
}
