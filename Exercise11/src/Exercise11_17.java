import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        int n = calculateN(m);

        System.out.println("The smallest number n for m * n to " +
            "be a perfect square is " + n);
        System.out.print("m * n is " + (m * n));
    }

    public static int calculateN(int m) {
        ArrayList<Integer> factorsWithDupe = new ArrayList<>();
        ArrayList<Integer> factorsNoDupe = new ArrayList<>();
        int n = 1;

        while (m != 1) {
            for (int i = 2; i <= m; i++) {
                if (m % i == 0) {
                    m /= i;
                    factorsWithDupe.add(i);

                    if (!factorsNoDupe.contains(i)) {
                        factorsNoDupe.add(i);
                    }
                    break;
                }
            }
        }

        for (int factor1 : factorsNoDupe) {
            int count = Exercise11_09.numberOfLargest(factorsWithDupe, factor1);
            if (count % 2 != 0) {
                n *= factor1;
            }
        }
        return n;
    }
}
