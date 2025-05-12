import java.util.Scanner;

public class Exercise03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double x3 = 0;
        double y3 = 0;
        double x2 = 200;
        double y2 = 0;
        double x1 = 0;
        double y1 = 100;

        double a = (y1 - y2);
        double b = -(x1 - x2);
        double c = (y3 - y4);
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.print("The point is ");

        if (x4 >= x && y4 >= y) {
            System.out.print("not ");
        }

        System.out.print("in the triangle");

        input.close();
    }
}
