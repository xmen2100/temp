import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        double total = 0;
        int count = 0;

        int number = 1;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        while (number != 0) {
            number = input.nextInt();

            if (number > 0) {
                numberOfPositives++;
                count++;
            }
            else if (number < 0) {
                numberOfNegatives++;
                count++;
            }

            total+=number;
        }

        System.out.println("The number of positives is " + numberOfPositives);
        System.out.println("The number of negatives is " + numberOfNegatives);
        System.out.println("The total is " + total);
        System.out.print("The average is " + total / count);
    }
}
