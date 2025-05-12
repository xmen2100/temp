import java.util.Scanner;

public class Exercise09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        boolean isSolvable = equation.isSolvable();
        double x = equation.getX();
        double y = equation.getY();

        if (isSolvable) {
            System.out.printf("The intersecting point is at (%.5f, %.4f)", x, y);
        }
        else {
            System.out.println("The two lines are parallel");
        }
    }
}
