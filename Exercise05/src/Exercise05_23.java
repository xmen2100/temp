public class Exercise05_23 {
    public static void main(String[] args) {
        double leftToRightSum = 0;
        double rightToLeftSum = 0;

        for (int n = 1; n <= 50000; n++) { // Start from 1 go to 1/50000
            leftToRightSum += 1.0 / n;
        }
        System.out.println("Summation from left to right: " + leftToRightSum);

        for (int n = 50000; n >= 1; n--) { // Start from 1/50000 go to 1
            rightToLeftSum += 1.0 / n;
        }
        System.out.println("Summation from right to left: " + rightToLeftSum); // Display results
        System.out.print("Difference: " + leftToRightSum + " - " + rightToLeftSum + " = " + (leftToRightSum - rightToLeftSum));
    }
}
