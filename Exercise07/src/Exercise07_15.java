import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] nonDupedList = eliminateDuplicates(list);
        System.out.print("The distinct numbers are:");

        for (int num : nonDupedList) {
            if (num != 0) {
                System.out.print(" " + num);
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] nonDupedList = new int[list.length];
        
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int num : nonDupedList) {
                if (num == list[i]) {
                    isDuplicate = true;
                    break; // breaks out of inner loop, no need to check anymore if found 1 duplicate
                }
            }
            if (!isDuplicate) {
                nonDupedList[i] = list[i];
            }
        }
        return nonDupedList;
    }
}
