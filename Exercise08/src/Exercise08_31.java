import java.util.Scanner;

public class Exercise08_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[] result = getIntersectingPoints(points);
        if (result == null) {
            System.out.print("The two lines are parallel");
        }
        else {
            System.out.printf("The intersecting point is at " +
                "(%.5f, %.4f)", result[0], result[1]);
        }
    }

    public static double[] getIntersectingPoints(double[][] points) {
        double a00 = points[0][1] - points[1][1];
        double a01 = -(points[0][0] - points[1][0]);
        double a10 = points[2][1] - points[3][1];
        double a11 = -(points[2][0] - points[3][0]);
        double b0 = a00 * points[0][0] + a01 * points[0][1];
        double b1 = a10 * points[2][0] + a11 * points[2][1];

        return Exercise08_30.linearEquation(new double[][]
            {{a00, a01}, {a10, a11}}, new double[] {b0, b1});
    }
}
