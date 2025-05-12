import java.util.Scanner;

public class Exercise05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimalInteger = input.nextInt();

        System.out.print("Its corresponding binary value is ");

        String binaryInteger = "";

        if (decimalInteger == 0) { // if decimal is 0 then binary is 0
            binaryInteger = "0";
        }

        while (decimalInteger != 0) {
            binaryInteger = decimalInteger % 2 + binaryInteger; // Divide by 2 and get the remainder. Concat with binaryInteger
            decimalInteger /= 2; // Divide by 2 each time
        }

        System.out.print(binaryInteger);
    }
}
