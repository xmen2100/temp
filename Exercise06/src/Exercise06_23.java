import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string followed by a character: ");
        String str = input.next(); // get next word as string
        char a = input.next().charAt(0); // get first char following the word

        System.out.print("The number of occurrences of the character '"
                + a + "' in the string \"" + str + "\" is " + count(str, a));
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++) { // iterate through string
            if (str.charAt(i) == a) { // check if char matches a
                count++; // if so, increment count
            }
        }
        return count;
    }
}
