import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000000000000000000000000000000000000");

        int count = 0;
        while (count < 10) {
            if (a.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                a.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(a);
                count++;
            }
            a = a.add(BigInteger.ONE);
        }
    }
}
