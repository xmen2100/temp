public class Exercise13_14 {
    public static void main(String[] args) {
        NewRational r1 = new NewRational(4, 2);
        NewRational r2 = new NewRational(2, 3);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}

class NewRational extends Number implements Comparable<NewRational> {
    private final long[] r = new long[2];

    public NewRational() {
        this(0, 1);
    }

    public NewRational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        r[0] = (denominator > 0 ? 1 : -1) * numerator / gcd;
        r[1] = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public NewRational add(NewRational secondRational) {
        long n = r[0] * secondRational.getDenominator() +
            r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new NewRational(n, d);
    }

    public NewRational subtract(NewRational secondRational) {
        long n = r[0] * secondRational.getDenominator() -
            r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new NewRational(n , d);
    }

    public NewRational multiply(NewRational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new NewRational(n, d);
    }

    public NewRational divide(NewRational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();
        return new NewRational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1) {
            return r[0] + "";
        }
        else {
            return r[0] + "/" + r[1];
        }
    }

    @Override
    public boolean equals(Object other) {
        if ((this.subtract((NewRational) (other))).getNumerator() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(NewRational o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        }
        else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}