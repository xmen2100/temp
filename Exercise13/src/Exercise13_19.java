import java.util.Scanner;

public class Exercise13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isNegative = false;

        System.out.print("Enter a decimal number: ");
        String num = input.next();
        if (num.charAt(0) == '-') {
            isNegative = true;
            num = num.replace("-", "");
        }

        String[] numArr = num.split("\\.");

        int decimal = Integer.parseInt(numArr[0]);
        int fraction = Integer.parseInt(numArr[1]);

        Rational r1 = new Rational(fraction, (long)Math.pow(10, numArr[1].length()));

        long numerator = r1.getNumerator();
        numerator += decimal * r1.getDenominator();

        System.out.print("The fraction number is ");

        if (isNegative) {
            System.out.print('-');
        }

        System.out.print(numerator + "/" + r1.getDenominator());
    }
}
