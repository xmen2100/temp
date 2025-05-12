import java.util.Scanner;

public class Exercise04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String string = input.nextLine();
		char letter = string.charAt(0);
		
		if (Character.isLetter(letter)) {
			switch (Character.toUpperCase(letter)) {
			case 'A' : System.out.print(letter + " is a vowel"); break;
			case 'E' : System.out.print(letter + " is a vowel"); break;
			case 'I' : System.out.print(letter + " is a vowel"); break;
			case 'O' : System.out.print(letter + " is a vowel"); break;
			case 'U' : System.out.print(letter + " is a vowel"); break;
			default : System.out.print(letter + " is a consonant"); break;
			}
		}
		
		else {
			System.out.print(string + " is an invalid input");
		}
		
		input.close();
	}

}
