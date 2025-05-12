import java.util.Scanner;

public class Exercise12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            String hexadecimal = "0123456789ABCDEF";

            if (!hexadecimal.contains(String.valueOf(hexChar))) {
                throw new HexFormatException("Not a hex number");
            }
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        }
        else {
            return ch - '0';
        }
    }
}

class HexFormatException extends Exception {
    public HexFormatException(String message) {
        super(message);
    }
}