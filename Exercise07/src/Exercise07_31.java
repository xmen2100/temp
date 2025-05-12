import java.util.Scanner;

public class Exercise07_31 {
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

        System.out.print("list1 is ");
        for (int num : list1) {
            System.out.print(num + " ");
        }

        System.out.print("\nlist2 is ");
        for (int num : list2) {
            System.out.print(num + " ");
        }

        System.out.print("\nThe merged list is ");
        for (int num : merge(list1, list2)) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];

        for (int h = 0, i = 0, j = 0; h < result.length; h++) {
            if (i == list1.length) {
                result[h] = list2[j];
                j++;
            }
            else if (j == list2.length) {
                result[h] = list1[i];
                i++;
            }
            else {
                if (list1[i] < list2[j]) {
                    result[h] = list1[i];
                    i++;
                }
                else {
                    result[h] = list2[j];
                    j++;
                }
            }
        }
        return result;
    }
}
