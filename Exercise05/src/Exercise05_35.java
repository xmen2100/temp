public class Exercise05_35 {
    public static void main(String[] args) {
        double summation = 0;
        for (int i = 1, j = 2; i <= 624 && j <= 625; i++, j++) {
            summation += 1 / (Math.sqrt(i) + Math.sqrt(j));
        }
        System.out.print("The sum is " + summation);
    }
}
