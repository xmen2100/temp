import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.next();

        System.out.println("The array list of chars is:");
        for (char ch: toCharacterArray(s)) {
            System.out.println(ch);
        }
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        return list;
    }
}
