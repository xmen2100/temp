import java.util.Scanner;

public class Exercise06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine(); // get input

        System.out.print("The number of letters in the string is " + countLetters(s));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) { // iterate through string
            if (Character.isLetter(s.charAt(i))) { // check if char is letter
                count++; // if yes, increment count
            }
        }
        return count;
    }
}
