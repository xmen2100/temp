import java.util.Scanner;

public class Exercise04_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String string = input.nextLine();
		char letter = string.charAt(0);
		
		if (Character.isLetter(letter)) {
			switch (Character.toUpperCase(letter)) {
			case 'A' :
			case 'B' :
			case 'C' : System.out.print("The corresponding number is 2"); break;
			case 'D' :
			case 'E' : 
			case 'F' : System.out.print("The corresponding number is 3"); break;
			case 'G' :
			case 'H' :
			case 'I' : System.out.print("The corresponding number is 4"); break;
			case 'J' :
			case 'K' : 
			case 'L' : System.out.print("The corresponding number is 5"); break;
			case 'M' :
			case 'N' :
			case 'O' : System.out.print("The corresponding number is 6"); break;
			case 'P' :
			case 'Q' :
			case 'R' :
			case 'S' : System.out.print("The corresponding number is 7"); break;
			case 'T' :
			case 'U' : 
			case 'V' : System.out.print("The corresponding number is 8"); break;
			case 'W' :
			case 'X' : 
			case 'Y' :
			case 'Z' : System.out.print("The corresponding number is 9"); break;
			}
		}
		else {
			System.out.println(string + "is an invalid input ");
			System.out.print(" ");
		}
		input.close();
	}

}
