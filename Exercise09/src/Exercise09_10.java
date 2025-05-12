import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("For a quadratic equation ax^2 + bx + c = 0. \nEnter a, b, and c: ");
        QuadraticEquation equation = new QuadraticEquation(input.nextDouble(),
            input.nextDouble(), input.nextDouble());

        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The two roots are " + equation.getRoot1() + " and " +
                equation.getRoot2());
        }
        else if (discriminant == 0) {
            System.out.println("The one root is " + equation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
