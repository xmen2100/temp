import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise10_20 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            System.out.println(calculateE(i));
        }
    }

    public static BigDecimal factorial(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i + ""));
        }
        return result;
    }

    public static BigDecimal calculateE(long n) {
        BigDecimal e = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            BigDecimal term = BigDecimal.ONE.divide(factorial(i), 25, RoundingMode.HALF_UP);
            e = e.add(term);
        }
        return e;
    }
}


