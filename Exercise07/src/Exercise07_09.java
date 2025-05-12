import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.print("The minimum number is " + min(array));
    }

    public static double min(double[] array) {
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
