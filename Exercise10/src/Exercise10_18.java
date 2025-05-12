import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int count = 0;
        while (count < 5) {
            if (n.isProbablePrime(100)) {
                System.out.println(n);
                count++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}
