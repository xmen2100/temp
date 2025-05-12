import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.next();

        System.out.print("Sorted string is: " + sort(s));
    }

    public static String sort(String s) {
        char[] buffer = s.toCharArray();
        java.util.Arrays.sort(buffer);
        return new String(buffer).intern();
    }
}
