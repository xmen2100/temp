public class Exercise06_12 {
    public static void main(String[] args) {
        // invoke printChars method from '1' to 'Z' and print 10 chars per line
        printChars('1','Z',10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (int i = 1; ch1 <= ch2; i++) { // iterate through chars from ch1 to ch2
            if (i % numberPerLine == 0) { // when reach numberPerLine, print char and new line
                System.out.println(ch1);
            }

            else { // if not, separate chars with space
                System.out.print(ch1 + " ");
            }
            ch1++; // increment char
        }
    }
}
