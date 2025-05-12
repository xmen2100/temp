import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		System.out.println("The length of the string is " + s.length());
		System.out.print("The first character in the string is " + ch);
		
		input.close();

	}

}
