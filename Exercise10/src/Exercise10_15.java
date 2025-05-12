import java.util.Scanner;

public class Exercise10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");

        double[][] points = new double[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        Exercise10_13.MyRectangle2D rect = getRectangle(points);
        System.out.println("The bounding rectangle's center ("
            + rect.getX() + ", " + rect.getY() + "), width " +
            rect.getWidth() + ", height " + rect.getHeight());
    }

    public static Exercise10_13.MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }
        }

        double maxX = points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }
        }

        double minY = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < minY) {
                minY = points[i][1];
            }
        }

        double maxY = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] > maxY) {
                maxY = points[i][1];
            }
        }

        double x = (minX + maxX) / 2;
        double y = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;
        return new Exercise10_13.MyRectangle2D(x, y, width, height);
    }
}
