import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.print("The sum of list is " + sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for (double n : list) {
            sum += n;
        }
        return sum;
    }
}
