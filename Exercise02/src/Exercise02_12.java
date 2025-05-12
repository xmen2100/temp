import java.util.Scanner;

public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed v: ");
        double speed = input.nextDouble();

        System.out.print("Enter acceleration a: ");
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);
        System.out.print("The minimum runway length for this airplane is " + length + " meters");
        input.close(); 
    }
}
