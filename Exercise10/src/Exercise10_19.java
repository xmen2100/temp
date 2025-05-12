import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {
        System.out.println("p            2^p - 1");
        System.out.println("-------------------------");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                BigInteger mersenne = BigInteger.valueOf((long)Math.pow(2, i)).subtract(BigInteger.ONE);
                System.out.printf("%-13d" + mersenne + "\n", i);
            }
        }
    }

    public static boolean isPrime(int n) {
        return MyInteger.isPrime(n);
    }
}
