import java.util.Scanner;

public class Exercise07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The combinations of picking two numbers from the 10 integers are: ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
