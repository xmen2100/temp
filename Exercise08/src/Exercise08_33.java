import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] vertices = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices[i].length; j++) {
                vertices[i][j] = input.nextDouble();
            }
        }

        double[] subAreas = getSubAreas(vertices);
        double[] sortedSubAreas = new double[subAreas.length];

        System.arraycopy(subAreas, 0, sortedSubAreas, 0, subAreas.length);
        Arrays.sort(sortedSubAreas);

        System.out.print("The areas are ");
        for (double sortedSubArea : sortedSubAreas) {
            System.out.print(Math.round(sortedSubArea * 100) / 100.0 + " ");
        }
    }

    public static double[] getSubAreas(double[][] vertices) {
        // line 1
        double x1 = vertices[0][0];
        double y1 = vertices[0][1];
        double x3 = vertices[2][0];
        double y3 = vertices[2][1];

        // line 2
        double x2 = vertices[1][0];
        double y2 = vertices[1][1];
        double x4 = vertices[3][0];
        double y4 = vertices[3][1];

        double A1 = y3 - y1;
        double B1 = x1 - x3;
        double C1 = A1 * x1 + B1 * y1;

        double A2 = y4 - y2;
        double B2 = x2 - x4;
        double C2 = A2 * x2 + B2 * y2;

        double determinant = A1 * B2 - A2 * B1;
        double x0 = (B2 * C1 - B1 * C2) / determinant;
        double y0 = (A1 * C2 - A2 * C1) / determinant;

        double[] subAreas = new double[4];
        subAreas[0] = Exercise08_32.getTriangleArea(new double[][] {
            {x2, y2}, {x0, y0}, {x3, y3}});
        subAreas[1] = Exercise08_32.getTriangleArea(new double[][] {
            {x3, y3}, {x0, y0}, {x4, y4}});
        subAreas[2] = Exercise08_32.getTriangleArea(new double[][] {
            {x4, y4}, {x0, y0}, {x1, y1}});
        subAreas[3] = Exercise08_32.getTriangleArea(new double[][] {
            {x1, y1}, {x0, y0}, {x2, y2}});

        return subAreas;
    }
}
