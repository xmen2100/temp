import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf((long)Math.sqrt(Long.MAX_VALUE)).add(BigInteger.ONE);

        for (int i = 0; i < 10; i++) {
            BigInteger square = n.multiply(n);
            System.out.println(square);
            n = n.add(BigInteger.ONE);
        }
    }
}
