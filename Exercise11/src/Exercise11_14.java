import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> combinedList = union(list1, list2);
        System.out.print("The combined list is");
        for (int n : combinedList) {
            System.out.print(" " + n);
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);
        return union;
    }
}
