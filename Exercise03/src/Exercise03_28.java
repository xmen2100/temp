import java.util.Scanner;

public class Exercise03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        // distance between the centers (horizontally)
        double horiCenterDistance = Math.pow(Math.pow(r2x - r1x, 2), 0.5);
        //distance between the centers (vertically)
        double vertiCenterDistance = Math.pow(Math.pow(r2y - r1y, 2), 0.5);

        if (horiCenterDistance + r2Width / 2 <= r1Width / 2 && vertiCenterDistance + r2Height / 2 <= r1Height / 2) {
            System.out.print("r2 is inside r1");
        }
        else if (r1x + r1Width / 2 > r2x - r2Width || r1y + r1Height / 2 > r2y - r2Width) {
            System.out.print("r2 overlaps r1");
        }
        else {
            System.out.print("r2 does not overlap r1");
        }

        input.close();
    }
}
