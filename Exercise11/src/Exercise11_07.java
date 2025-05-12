import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers (ends with 0): ");

        int num;
        do {
            num = input.nextInt();

            if (num != 0) {
                list.add(num);
            }
        } while (num != 0);

        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
