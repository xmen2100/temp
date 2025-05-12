import java.util.Scanner;

public class Exercise12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = input.next();

        try {
            System.out.println("The decimal value for binary number " +
                binaryString + " is " + bin2Dec(binaryString));
        }
        catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        for (int i = 0; i < binaryString.length(); i++) {
            char binaryChar = binaryString.charAt(i);
            if (binaryChar != '0' && binaryChar != '1') {
                throw new BinaryFormatException("Not a binary number");
            }
        }

        int power = 0;
        int decimal = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char binaryChar = binaryString.charAt(i);
            int binaryDigit = binaryChar - '0';

            decimal += (int)Math.pow(2, power) * binaryDigit;
            power++;
        }
        return decimal;
    }
}

class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}
