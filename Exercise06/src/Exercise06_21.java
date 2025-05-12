import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine(); // get input

        for (int i = 0; i <= s.length() - 1; i++) { // iterate through string
            if (Character.isLetter(s.charAt(i))) { // check if char is letter
                System.out.print(getNumber(s.toUpperCase().charAt(i))); // if yes, cap it, translate and print
            }
            else { // if no, leave char intact and print
                System.out.print(s.charAt(i));
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {
        return switch (uppercaseLetter) { // translate uppercase letter to digit
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> 0;
        };
    }
}
