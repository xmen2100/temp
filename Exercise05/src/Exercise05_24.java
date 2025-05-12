public class Exercise05_24 {
    public static void main(String[] args) {
        double summation = 0;
        for (double i = 1, j = 3; i <= 97 && j <= 99; i+=2, j+=2) {
            summation += i / j;
        }
        System.out.print(summation);
    }
}
