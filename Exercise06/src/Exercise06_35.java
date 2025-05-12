import java.util.Scanner;

public class Exercise06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.print("The area of the pentagon is " + area(side));
    }

    public static double area(double side) { // calculate area of a pentagon
        return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
    }
}
