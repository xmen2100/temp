import java.util.Scanner;

public class Exercise08_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (getTriangleArea(points) == 0) {
            System.out.println("The three points are on the same line");
        }
        else {
            System.out.printf("The area of the triangle is %.2f",
                getTriangleArea(points));
        }
    }

    public static double getTriangleArea(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double s = (side1 + side2 + side3) / 2;

        if ((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2 == 0) {
            return 0;
        }
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
