import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        double[] array2 = new double[10];

        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("The average value is " + average(array1));

        System.out.print("Enter 10 double values: ");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextDouble();
        }
        System.out.print("The average value is " + average(array2));
    }

    public static double average(int[] array) {
        double sum = 0;
        int count = 0;

        for (int e : array) {
            sum += e;
            count++;
        }
        return sum / count;
    }

    public static double average(double[] array) {
        double sum = 0;
        int count = 0;

        for (double e : array) {
            sum += e;
            count++;
        }
        return sum / count;
    }
}
