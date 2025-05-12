import java.util.Scanner;

public class Exercise13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);

        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);

        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());

        Complex c3 = (Complex)c1.clone();
        System.out.println(c1 == c3);
        System.out.println(c3.getRealPart());
        System.out.println(c3.getImaginaryPart());
        Complex c4 = new Complex(4, -0.5);
        Complex[] list = {c1, c2, c3, c4};
        java.util.Arrays.sort(list);
        System.out.println(java.util.Arrays.toString(list));
    }
}

class Complex implements Cloneable, Comparable<Complex> {
    private final double a;
    private final double b;

    public Complex add(Complex secondComplex) {
        return new Complex(a + secondComplex.a, b + secondComplex.b);
    }

    public Complex subtract(Complex secondComplex) {
        return new Complex(a - secondComplex.a, b - secondComplex.b);
    }

    public Complex multiply(Complex secondComplex) {
        return new Complex(a * secondComplex.a - b * secondComplex.b, b * secondComplex.a + a * secondComplex.b);
    }

    public Complex divide(Complex secondComplex) {
        return new Complex((a * secondComplex.a + b * secondComplex.b) / (secondComplex.a * secondComplex.a + secondComplex.b * secondComplex.b),
            (b * secondComplex.a - a * secondComplex.b) / (secondComplex.a * secondComplex.a + secondComplex.b * secondComplex.b));
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(Complex o) {
        if (abs() > o.abs()) {
            return 1;
        }
        else if (abs() < o.abs()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return getRealPart() + " + " + getImaginaryPart() + "i";
    }
}