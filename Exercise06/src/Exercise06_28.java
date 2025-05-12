public class Exercise06_28 {
    public static void main(String[] args) {
        System.out.println("p\t\t\t 2^p - 1");
        System.out.println("---------------------------------");

        for (int p = 1; p <= 31; p++) { // positive integers <= 31
            if (isMersennePrime(p)) { // display if is mersenne prime
                System.out.printf("%-4d\t\t " + (int)(Math.pow(2, p) - 1), p);
                System.out.println();
            }
        }
    }

    public static boolean isMersennePrime(int p) {
        int mersenneForm = (int)(Math.pow(2, p) - 1);
        return Exercise06_26.isPrime(mersenneForm); // check if mersenneForm is a prime number
    }


}
