public class Exercise05_33 {
    public static void main(String[] args) {
        System.out.println("The four perfect numbers < 10,000 are ");
        for (int number = 1; number < 10000; number++) {
            int sumOfDivisors = 0;

            for (int divisor = 1; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If number is divisible by divisor, add to sum
                    sumOfDivisors += divisor;
                }
            }

            if (sumOfDivisors == number) { // Check if sum == number
                System.out.println(number); // Print number
            }
        }
    }
}
