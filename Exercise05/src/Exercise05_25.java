public class Exercise05_25 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i+=10000) { // Compute from i = 10000 to 100000
            double summation = 0; // Re-initialize summation everytime
            for (int n = 1, count = 1; n <= i; n+=2, count++) {
                if (count % 2 == 0) { // Every even num is -1 / n
                    summation += -1.0 / n;
                }
                else { // Every odd num is 1 / n
                    summation += 1.0 / n;
                }
            }
            // Display results
            System.out.println("The summation pi value for i = " + i + " is " + (4 * summation));
        }

    }
}
