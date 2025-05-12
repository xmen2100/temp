public class Exercise06_29 {
    public static void main(String[] args) {
        for (int i = 2; i + 2 < 1000; i++) { // find twin primes less than 1000
            if (isTwinPrime(i, i + 2)) { // twin primes = numbers differ by 2
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean isTwinPrime(int a, int b) {
        return Exercise06_26.isPrime(a) && Exercise06_26.isPrime(b); // twin primes = both numbers are prime
    }

}
