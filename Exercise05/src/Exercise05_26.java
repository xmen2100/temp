public class Exercise05_26 {
    public static void main(String[] args) {
        double e = 1;
        double item = 1;

        for (int i = 1; i <= 20; i++) {
            if (i >= 2) { // For i >= 2
                e += item / i;
                item /= i; // Divide item by i set as new item
            }

            else { // Only for i = 1
                e += item;
            }
            // Display results
            System.out.printf("e value for i = " + i + " is %.16f\n", e);
        }
    }
}
