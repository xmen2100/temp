import java.util.Scanner;

public class Exercise03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double circle1X = input.nextDouble();
        double circle1Y = input.nextDouble();
        double circle1Rad = input.nextDouble();

        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double circle2X = input.nextDouble();
        double circle2Y = input.nextDouble();
        double circle2Rad = input.nextDouble();

        double distBetweenCenters =  Math.pow(Math.pow(circle2X - circle1X, 2) + 
        Math.pow(circle2Y - circle1Y, 2), 0.5);

        if (distBetweenCenters <= circle1Rad - circle2Rad) {
            System.out.print("circle2 is inside circle1");
        }
        else if (distBetweenCenters <= circle1Rad + circle2Rad) {
            System.out.print("circle2 overlaps circle1");
        }
        else {
            System.out.print("circle2 does not overlap circle1");
        }
        input.close();
    }
}
