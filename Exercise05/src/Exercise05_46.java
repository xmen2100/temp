import java.util.Scanner;

public class Exercise05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine(); // get input

        System.out.print("The reversed string is ");
        for (int i = str.length() - 1; i >= 0; i--) { // start at last index; until reach 0th index
            System.out.print(str.charAt(i)); // print char at index
        }
    }
}
