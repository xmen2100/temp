import java.util.Scanner;

public class Exercise05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimalInteger = input.nextInt();

        System.out.print("Its corresponding octal value is ");

        String octalInteger = "";

        if (decimalInteger == 0) { // if decimal is 0 then octal is 0
            octalInteger = "0";
        }

        while (decimalInteger != 0) {
            octalInteger = decimalInteger % 8 + octalInteger; // Divide by 8 and get the remainder. Concatenate with octal integer
            decimalInteger /= 8; // Divide by 8 each time
        }

        System.out.print(octalInteger);
    }
}
