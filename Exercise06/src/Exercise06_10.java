public class Exercise06_10 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; number < 10000; number++) { // start number at 2 increase while less than 10000
            if (isPrime(number)) { // if prime, increase count
                count++;
            }
        }
        System.out.print("The number of prime numbers less than 10000 is " + count);
    }

    // check if number is prime
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // if true, number is not prime
                return false; // number is not prime
            }
        }

        return true; // number is prime
    }
}
