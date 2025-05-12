public class Exercise05_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        double yearlyRate = 0.05;
        int totalCost = 0;

        for (int numYearsLater = 1; numYearsLater <= 14; numYearsLater++) {
            tuition += tuition * yearlyRate; // Calculate tuition

            if (numYearsLater == 10) { // Print tuition in 10 years
                System.out.printf("The tuition in 10 years is $%,d\n", (int)tuition);
            }

            else if (numYearsLater > 10) {
                totalCost += (int)tuition;
            }

        }
        // Print 4 years total cost of tuition
        System.out.printf("The total cost of 4 years worth of tuition after the tenth year is $%,d", totalCost);
    }
}
