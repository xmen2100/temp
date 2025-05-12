import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int[] list = new int[input.nextInt()];

        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("The list has " + list.length + " integers");
        for (int num : list) {
            System.out.print(" " + num);
        }

        System.out.print(isSorted(list) ? "\nThe list is already sorted" : "\nThe list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i - 1] > list[i]) {
                return false;
            }
        }
        return true;
    }
}
