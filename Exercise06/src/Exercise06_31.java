import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.print(number + " is valid");
        }
        else {
            System.out.print(number + " is invalid");
        }
    }

    // return true if the card number is valid
    public static boolean isValid(long number) {
        return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) && (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6)) && (getSize(number) >= 13 || getSize(number) <= 16);
    }

    // return sum of double of second-place digits in number
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        for (int i = 1; number / (long)Math.pow(10, i) > 0; i+=2) {
            int digit = (int)(number / (long)Math.pow(10, i) % 10);

            sum += getDigit(digit * 2);
        }
        return sum;
    }

    // return this number if single digit, otherwise return sum of the two digits
    public static int getDigit(int number) {
        if (number % 10 == number) {
            return number;
        }
        return number / 10 + number % 10;
    }

    // return sum of odd-place digits in number
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        for (int i = 0; number / (long)Math.pow(10, i) > 0; i+=2) {
            int digit = (int)(number / (long)Math.pow(10, i) % 10);

            sum += digit;
        }
        return sum;
    }

    // return true if the number d is a prefix for number
    public static boolean prefixMatched(long number, int d) {
        return d == getPrefix(number, 1) || d == getPrefix(number, 2);
    }

    // return the number of digits in d
    public static int getSize(long d) {
        String str = d + "";
        return str.length();
    }

    /* return first k number of digits in number. if number of digits in number < k,
     return number */
    public static long getPrefix(long number, int k) {
        if (getSize(number) < k) {
            return number;
        }
        return number / (long)Math.pow(10, getSize(number) - k);
    }

}
