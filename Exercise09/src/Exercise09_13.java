import java.util.Scanner;

public class Exercise09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] a = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(a);
        double maxValue = location.getMaxValue();
        int row = location.getRow();
        int col = location.getCol();

        System.out.println("The location of the largest element is " + maxValue +
            " at (" + row + ", " + col + ")");
    }
}

class Location {
    private int row;
    private int col;
    private double maxValue;

    public Location(double[][] a) {
        row = 0;
        col = 0;
        maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
    }

    public static Location locateLargest(double[][] a) {
        return new Location(a);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public double getMaxValue() {
        return maxValue;
    }

}
