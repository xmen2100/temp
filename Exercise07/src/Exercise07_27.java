import java.util.Scanner;

public class Exercise07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.print("Two lists are identical");
        }
        else {
            System.out.print("Two lists are not identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            bubbleSort(list1);
            bubbleSort(list2);

            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }

    public static void bubbleSort(int[] list) {
        for (int pass = 1; pass < list.length; pass++) {
            for (int i = 0; i < list.length - pass; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
}
