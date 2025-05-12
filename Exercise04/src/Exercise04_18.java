import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String s = input.next();
		char major = Character.toUpperCase(s.charAt(0));
		char status = s.charAt(1);
		
		if (((int)major == 77 || (int)major == 67 || (int)major == 73) && 
				(int)status >= 49 && (int)status <= 52) {
			switch (major) {
			case 'M' : System.out.print("Mathematics"); break;
			case 'C' : System.out.print("Computer Science"); break;
			case 'I' : System.out.print("Information Technology");
			}
			System.out.print(" ");
			switch (status) {
			case '1' : System.out.print("Freshman"); break;
			case '2' : System.out.print("Sophmore"); break;
			case '3' : System.out.print("Junior"); break;
			case '4' : System.out.print("Senior");
			}
		}
		if (((int)major == 77 || (int)major == 67 || (int)major == 73) && 
				! ((int)status >= 49 && (int)status <= 52))
		System.out.print("Invalid input: Wrong status code");
		
		else System.out.print("Invalid input:");
		
		input.close();
	}

}
