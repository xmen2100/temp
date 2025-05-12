public class Exercise06_26 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;

        // start num at 2 since 1 is not prime
        for (int num = 2, count = 1; count <= 100; num++) { // display first 100 num
            if (isPalindrome(num) && isPrime(num)) { // check if num is palindromic prime
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

    public static boolean isPalindrome(int num) {
        String str = num + ""; // turn num into string
        int reversedNum = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            int lastDigit = num / (int)Math.pow(10, i) % 10;
            reversedNum += lastDigit * (int)Math.pow(10, str.length() - 1 - i);
        }
        return reversedNum == num; // check if reversedString equals string
    }

    public static boolean isPrime(int num) {
        if (num == 1) { // 1 is not a prime number
            return false;
        }
        for (int divisor = 2; divisor <= num / 2; divisor++) { // get divisor from 2 to num / 2
            if (num % divisor == 0) { // check if num is divisible by divisor
                return false;
            }
        }
        return true;
    }
}
