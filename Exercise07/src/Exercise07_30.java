import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        if (isConsecutiveFour(values)) {
            System.out.print("The list has consecutive fours");
        }
        else {
            System.out.print("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
