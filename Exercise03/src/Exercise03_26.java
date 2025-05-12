import java.util.Scanner;

public class Exercise03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        boolean div5And6 = false;
        boolean div5Or6 = false;
        boolean div5Or6NotBoth = false;

        if (integer % 5 == 0 && integer % 6 == 0) {
            div5And6 = true;
        }
        if (integer % 5 == 0 || integer % 6 == 0) {
            div5Or6 = true;
        }
        if (integer % 5 == 0 ^ integer % 6 == 0) {
            div5Or6NotBoth = true;
        }

        System.out.println("Is " + integer + " divisible by 5 and 6? " + div5And6);
        System.out.println("Is " + integer + " divisible by 5 or 6? " + div5Or6);
        System.out.print("Is " + integer + " divisible by 5 or 6, but not both? " + div5Or6NotBoth);
        input.close();
    }
}
