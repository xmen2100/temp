import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 0 && decimal <= 9) {
            System.out.print("The hex value is " + decimal);
        }
        else if (decimal >= 10 && decimal <= 15) {
            System.out.print("The hex value is " + (char)(decimal + 'A' - 10));
        }
        else {
            System.out.print(decimal + "is an invalid input");
        }

        input.close();
    }
}
