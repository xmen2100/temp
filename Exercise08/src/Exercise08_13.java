import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] a = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        int[] largestLocation = locateLargest(a);
        System.out.print("The location of the largest element is at (" +
            largestLocation[0] + ", " + largestLocation[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        double max = a[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[] {maxRow, maxCol};
    }
}
