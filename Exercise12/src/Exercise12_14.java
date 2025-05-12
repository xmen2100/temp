import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) throws FileNotFoundException {
        double total = 0;

        int count = 0;
        try (Scanner input = new Scanner(new File(args[0]))) {
            while (input.hasNextDouble()) {
                total += input.nextDouble();
                count++;
            }
        }
        System.out.println("From file " + args[0]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / count));
    }
}
