import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        char ch = (char)ascii;

        System.out.print("The character for ASCII code " + 
        ascii + " is " + ch);

        input.close();
    }
}
