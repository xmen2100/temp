import java.util.Scanner;

public class Exercise04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are ");
        double x1 = r * Math.cos(Math.toRadians(18));
        double y1 = r * Math.sin(Math.toRadians(18));
        System.out.printf("(%.2f, %.2f)\n", x1, y1);

        double x2 = r * Math.cos(Math.toRadians(90));
        double y2 = r * Math.sin(Math.toRadians(90));
        System.out.printf("(%.2f, %.2f)\n", x2, y2);

        double x3 = r * Math.cos(Math.toRadians(162));
        double y3 = r * Math.sin(Math.toRadians(162));
        System.out.printf("(%.2f, %.2f)\n", x3, y3);

        double x4 = r * Math.cos(Math.toRadians(234));
        double y4 = r * Math.sin(Math.toRadians(234));
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        
        double x5 = r * Math.cos(Math.toRadians(306));
        double y5 = r * Math.sin(Math.toRadians(306));
        System.out.printf("(%.2f, %.2f)\n", x5, y5);

        input.close();
    }
}
