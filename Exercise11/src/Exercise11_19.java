import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> weights = new ArrayList<>();

        System.out.print("Enter the number of objects: ");
        int n = input.nextInt();

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        int container = 1;
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) + sum(weights) <= 10) {
                    weights.add(list.get(i));
                    list.remove(i);
                    i--;
                }
            }

            System.out.print("Container " + container + " contains " +
                "objects with weight");
            for (int weight : weights) {
                System.out.print(" " + weight);
            }

            System.out.println();

            weights = new ArrayList<>();
            container++;
        }

    }

    public static int sum(ArrayList<Integer> weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }
}
