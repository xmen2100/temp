import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int unicode = (int)ch;

        System.out.print("The Unicode for the character E is " + 
        unicode);
        input.close();
    }
}
