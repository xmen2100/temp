import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int temp = input.nextInt();
        int max = temp;
        int count = 1;

        while (temp != 0) {
            temp = input.nextInt();

            if (temp > max) {
                max = temp;
                count = 1;
            }
            else if (temp == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.print("The occurrence count of the largest number is " + count);

    }
}
