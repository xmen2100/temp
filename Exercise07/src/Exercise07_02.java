import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArray = new int[10];
        System.out.print("Enter 10 integers: ");

        // initialize array with 10 integers
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = input.nextInt();
        }

        // print integers in reverse order
        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.print(numArray[i] + " ");
        }
    }
}
