public class Exercise07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int[] primeNumbers = new int[NUMBER_OF_PRIMES];

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;

            for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number); i++) {
                if (number % primeNumbers[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers[count] = number;
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                }
                else {
                    System.out.print(number + " ");
                }

            }
            number++;
        }
    }
}
