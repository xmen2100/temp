public class Exercise06_38 {
    public static void main(String[] args) {
        final int CHARS_PER_LINE = 50;

        // print 100 uppercase letters, 50 per line
        for (int count = 1; count <= 100; count++) {
            if (count % CHARS_PER_LINE == 0) {
                System.out.println(getRandomUpperCaseLetter());
            }
            else {
                System.out.print(getRandomUpperCaseLetter()+ " ");
            }
        }

        // print 100 single digits, 50 per line
        for (int count = 1; count <= 100; count++) {
            if (count % CHARS_PER_LINE == 0) {
                System.out.println(getRandomDigitCharacter());
            }
            else {
                System.out.print(getRandomDigitCharacter()+ " ");
            }
        }
    }

    // generate a random char between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // generate random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // generate a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}
