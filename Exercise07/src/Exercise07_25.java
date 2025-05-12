import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.print("The equation has ");
        String[] numberOfRoots = {"no real roots", "one root ", "two roots "};
        int number = solveQuadratic(new double[] {a, b, c}, new double[] {r1, r2});
        System.out.print(numberOfRoots[number]);

        if (number == 2) {
            System.out.printf("%.6f and %.5f", r1, r2);
        }
        else if (number == 1) {
            System.out.print(r1);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double r1 = roots[0];
        double r2 = roots[1];
        double discriminant1 = Math.pow(r1 * 2 * a + b, 2);
        double discriminant2 = Math.pow((r2 * 2 * a + b) / -1, 2);

        if (discriminant1 > 0 && discriminant2 > 0) {
            return 2;
        }
        else if (discriminant1 == 0 && discriminant2 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
