import java.util.Scanner;

public class Exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        int gcd = gcd(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());

        System.out.print("The gcd of these numbers is " + gcd);
    }

    public static int gcd(int... numbers) {
        int g = numbers[0]; // n1

        // first find gcd of n1 and n2, assign to g
        // then find gcd of g and n3, assign to g
        // then find gcd of g and n4, assign to g, etc.
        for (int i = 1; i < numbers.length; i++) {
            g = gcd(g, numbers[i]);
        }
        return g;
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        return gcd;
    }

}


