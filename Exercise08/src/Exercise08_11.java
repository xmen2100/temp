import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = 512;

        while (!(decimal >= 0 && decimal <= 511)) {
            System.out.print("Enter a number between 0 and 511: ");
            decimal = input.nextInt();

            if (!(decimal >= 0 && decimal <= 511)) {
                System.out.println("Not a number between 0 and 511");
            }
        }

        String binaryString = Integer.toBinaryString(decimal);

        int binary = Integer.parseInt(binaryString);

        binaryString = String.format("%09d", binary);

        for (int i = 0, count = 1; i < binaryString.length(); i++, count++) {
            if (binaryString.charAt(i) == '0') {
                System.out.print("H ");
            }
            else if (binaryString.charAt(i) == '1') {
                System.out.print("T ");
            }

            if (count % 3 == 0 && count != 9) {
                System.out.println();
            }
        }

    }
}
