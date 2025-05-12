import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String pw = input.nextLine(); // get user input

        if (eightOrMoreChars(pw) && onlyLettersAndDigits(pw) && twoOrMoreDigits(pw)) {
            System.out.print("Valid password"); // rules are followed
        }
        else {
            System.out.print("Invalid password"); // rules are not followed
        }
    }

    public static boolean eightOrMoreChars(String password) {
        return password.length() >= 8; // at least eight chars
    }

    public static boolean onlyLettersAndDigits(String password) {
        for (int i = 0; i <= password.length() - 1; i++) { // iterate through password
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false; // break out of method and return false if not letter or digit
            }
        }
        return true; // else return true
    }

    public static boolean twoOrMoreDigits(String password) {
        int count = 0;
        for (int i = 0; i <= password.length() - 1; i++) { // iterate through password
            if (Character.isDigit(password.charAt(i))) { // check if char is digit
                count++; // increment count
            }
        }
        return count >= 2; // return boolean of count >= 2
    }
}
