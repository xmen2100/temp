import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> coords = new ArrayList<>();

        System.out.print("Enter the number of points: ");
        int n = input.nextInt();

        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < n * 2; i++) {
            coords.add(input.nextDouble());
        }

        System.out.printf("The total area is %.2f", calculateArea(coords));
    }

    public static double calculateArea(ArrayList<Double> coords) {
        double sum1 = 0, sum2 = 0;
        int size = coords.size();

        for (int i = 0; i < size; i += 2) {
            int nextYIndex = (i + 3) % size;
            sum1 += coords.get(i) * coords.get(nextYIndex);
        }

        for (int i = 1; i < size; i += 2) {
            int nextXIndex = (i + 1) % size;
            sum2 += coords.get(i) * coords.get(nextXIndex);
        }

        return Math.abs(sum1 - sum2) * 0.5;
    }
}
