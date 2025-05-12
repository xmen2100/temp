import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();

        System.out.print("Keep entering integers stop at 0: ");
        while (true) {
            double n = input.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }

        sort(list);
        System.out.print("Sorted list: ");
        for (Number n : list) {
            System.out.print(n.intValue() + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        ArrayList<Integer> intList = new ArrayList<>();

        for (Number n : list) {
            intList.add(n.intValue());
        }

        java.util.Collections.sort(intList);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, intList.get(i));
        }
    }
}
