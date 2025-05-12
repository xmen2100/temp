import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("Enter two integers: ");
        while (true) {
            try {
                n1 = input.nextInt();
                n2 = input.nextInt();
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Incorrect input");
                System.out.print("\nRe-enter two integers: ");
                input.nextLine();
            }
        }
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }
}
