import java.util.Scanner;

public class Exercise04_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String string = input.nextLine();
		char grade = string.charAt(0);
		
		switch (Character.toUpperCase(grade)) {
		case 'A' : System.out.print("The numeric value of " + grade + " is 4"); break;
		case 'B' : System.out.print("The numeric value of " + grade + " is 3"); break;
		case 'C' : System.out.print("The numeric value of " + grade + " is 2"); break;
		case 'D' : System.out.print("The numeric value of " + grade + " is 1"); break;
		case 'F' : System.out.print("The numeric value of " + grade + " is 0"); break;
		default : System.out.print(string + " is an invalid grade"); break;
		}
		input.close();
	}

}
