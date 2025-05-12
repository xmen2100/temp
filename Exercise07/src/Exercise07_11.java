import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f\n", mean(array));
        System.out.printf("The standard deviation is %.5f", deviation(array));
    }

    // compute the deviation of double values
    public static double deviation(double[] x) {
        double topsum = 0;
        for (double e : x) {
            topsum += Math.pow(e - mean(x), 2);
        }
        return Math.sqrt(topsum / (x.length - 1));
    }

    // compute the mean of an array of double values
    public static double mean(double[] x) {
        double sum = 0;
        int n = x.length;

        for (double e : x) {
            sum += e;
        }
        return sum / n;
    }

}
