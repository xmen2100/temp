import java.util.Scanner;

public class Exercise03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double circleX = 0;
        double circleY = 0;

        double distance = Math.pow(Math.pow(x - circleX, 2) + Math.pow(y - circleY, 2), 0.5);

        System.out.print("Point (" + x + ", " + y + ") is " + (distance <= 10 ? "" : "not ") + "in the circle");

        input.close();
    }
}
