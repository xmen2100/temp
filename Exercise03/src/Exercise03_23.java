import java.util.Scanner;

public class Exercise03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double rectX = 0;
        double rectY = 0;

        double hDistance = Math.pow(Math.pow(x - rectX, 2), 0.5);
        double vDistance = Math.pow(Math.pow(y - rectY, 2), 0.5);

        System.out.print("Point (" + x + ", " + y + ") is ");
        if (hDistance > 5 || vDistance > 2.5) {
            System.out.print("not ");
        }
        System.out.print("in the rectangle");
        
        input.close();
    }
}
