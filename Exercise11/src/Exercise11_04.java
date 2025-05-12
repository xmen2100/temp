import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers ending with 0: ");

        int e;
        do {
            e = input.nextInt();

            if (e != 0) {
                list.add(e);
            }
        } while (e != 0);

        if (list.isEmpty()) {
            System.out.println("The list is empty");
        }
        else {
            System.out.println("The max is " + max(list));
        }
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return java.util.Collections.max(list);
    }
}
