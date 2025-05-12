import java.util.Scanner;

public class Exercise07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int[] list = new int[input.nextInt()];

        System.out.print("Enter list content: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        partition(list);

        System.out.print("After the partition, the list is ");
        for (int number : list) {
            System.out.print(number + " ");
        }
    }

    public static int partition(int[] list) {
        int pivot = 0;
        int low = 1;
        int high = list.length - 1;

        do {
            if (list[low] > list[pivot] && list[high] <= list[pivot]) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
            else if (list[low] > list[pivot] && list[high] > list[pivot]) {
                high--;
            }
            else {
                low++;
            }

        } while (low <= high);

        if (list[high] <= list[pivot]) {
            int temp = list[high];
            list[high] = list[pivot];
            list[pivot] = temp;
            pivot = high;
        }
        return pivot;
    }
}
