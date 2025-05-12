public class Exercise10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int n = 2; n < 120; n++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= n / 2; divisor++) {
                if (n % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                stack.push(n);
            }
        }

        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
