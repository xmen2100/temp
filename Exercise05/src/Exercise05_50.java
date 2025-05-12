import java.util.Scanner;

public class Exercise05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int count = 0; // initialize number of uppercase letters
        for (int i = 0; i <= s.length() - 1; i++) { // iterate through index of string
            if (Character.isUpperCase(s.charAt(i))) { // check for uppercase letter at index
                count++; // if found, increment count
            }
        }
        System.out.print("The number of uppercase letters is " + count);
    }
}
