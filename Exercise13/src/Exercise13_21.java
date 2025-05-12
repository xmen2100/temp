import java.util.Scanner;

public class Exercise13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational h = new Rational(-b, 2L * a);
        Rational k = new Rational(4L * a * c - (long)Math.pow(b, 2), 4L * a);

        System.out.println("h is " + h + " k is " + k);
    }
}
