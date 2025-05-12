public class Exercise06_27 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;

        // start num at 2 since 1 is not prime
        for (int num = 2, count = 1; count <= 100; num++) { // display first 100 num
            // emirp == non-palindrome, is prime, and its reversal is also a prime
            if (!Exercise06_26.isPalindrome(num) && Exercise06_26.isPrime(num) && Exercise06_26.isPrime(getReversal(num))) {
                if (count % NUMBERS_PER_LINE == 0) { // if 10th number in line
                    System.out.println(num); // print num and new line
                }
                else { // else print num and a space
                    System.out.print(num + " ");
                }
                count++; // increment count
            }
        }
    }

    public static int getReversal(int num) {
            String str = num + ""; // turn num into string
            int reversedNum = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                int lastDigit = num / (int)Math.pow(10, i) % 10;
                reversedNum += lastDigit * (int)Math.pow(10, str.length() - 1 - i);
            }
            return reversedNum;
        }

}
