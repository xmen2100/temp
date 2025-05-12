import java.util.Scanner;

public class Exercise05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine(); // get input

        for (int i = 0; i <= str.length() - 1; i++) { // iterate through index of string
            if (i % 2 == 0) { // check if index is divisible by 2 bc index start at 0
                System.out.print(str.charAt(i)); // if so, print char
            }
        }
    }
}
