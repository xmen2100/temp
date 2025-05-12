import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13_02 {
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

        shuffle(list);
        System.out.print("Shuffled list: ");
        for (Number n : list) {
            System.out.print(n.intValue() + " ");
        }
    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}
