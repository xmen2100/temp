import java.util.Scanner;

public class Exercise13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - 4 * a * c;
        double root1 = (-b + Math.pow(discriminant, .5)) / (2 * a);
        double root2 = (-b - Math.pow(discriminant, .5)) / (2 * a);

        if (discriminant > 0) {
            System.out.print("The roots are " + root1 + " and " + root2);
        }

        else if (discriminant < 0) {
            Complex r1 = new Complex(-b / (2 * a), Math.pow(-discriminant, 0.5) / (2 * a));
            Complex r2 = new Complex(-b / (2 * a), -Math.pow(-discriminant, 0.5) / (2 * a));
            System.out.println("The roots are " + r1 + " and " + r2);
        }

        else if (discriminant == 0) {
            System.out.print("The root is " + root1);
        }
        input.close();
    }
}
