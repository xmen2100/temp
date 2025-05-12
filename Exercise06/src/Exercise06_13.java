public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.println("i\t\t\t\t\t m(i)");

        for (int i = 1; i <= 20; i++) { // iterate from 1 to 20
            System.out.printf("%-20d %.4f\n", i, summation(i)); // print summation
        }
    }

    public static double summation(int i) {
        double sum = 0;
        for (double j = 0; j <= i; j++) { // compute summation until j = i
            sum += j / (j + 1);
        }
        return sum; // return summation
    }
}
