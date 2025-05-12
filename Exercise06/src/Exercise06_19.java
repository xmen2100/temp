import java.util.Scanner;

public class Exercise06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) { // test if input is valid, display area if is
            System.out.print("The area is " + area(side1, side2, side3));
        }
        else { // if not, display input is invalid
            System.out.print("The input is invalid.");
        }
    }

    // return true if sum of every two sides is greater than the third side
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // return area of the triangle
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
