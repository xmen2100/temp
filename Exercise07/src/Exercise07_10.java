import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.print("The index of the smallest element is "
                + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
