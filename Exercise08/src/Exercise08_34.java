import java.util.Scanner;

public class Exercise08_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[] rightmostLowest = getRightmostLowestPoint(points);
        System.out.print("The rightmost lowest point is (" +
            rightmostLowest[0] + ", " + rightmostLowest[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rightmostLowest = points[0];

        for (int i = 1; i < points.length; i++) {
            if (rightmostLowest[1] > points[i][1]) {
                rightmostLowest = points[i];
            }

            else if (rightmostLowest[1] == points[i][1]) {
                if (rightmostLowest[0] < points[i][0]) {
                    rightmostLowest = points[i];
                }
            }
        }
        return rightmostLowest;
    }
}
