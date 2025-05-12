import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first rational number: ");
        Rational r1 = new Rational(input.nextInt(), input.nextInt());

        System.out.print("Enter the second rational number: ");
        Rational r2 = new Rational(input.nextInt(), input.nextInt());

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
