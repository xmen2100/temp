import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int count = 0;
        while (count < 10) {
            if (n.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                n.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                    System.out.println(n);
                    count++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}

