public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.println("i\t\t\t\t\t m(i)");

        for (int i = 1; i <= 901; i+=100) { // iterate from 1 to 901
            System.out.printf("%-20d %.4f\n", i, summation(i)); // print summation
        }
    }

    public static double summation(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) { // compute sum from j to i
            sum += Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return 4 * sum; // return 4 times the sum
    }
}
