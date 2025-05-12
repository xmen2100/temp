import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("\nThe reverse of these numbers is: ");

        double[] reverse = reverse(array);
        for (double e : reverse) {
            System.out.print(e + " ");
        }
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];

        for (int i = 0, j = reverse.length - 1; i < array.length; i++, j--) {
            reverse[j] = array[i];
        }

        return reverse;
    }
}
