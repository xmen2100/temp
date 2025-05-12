import java.util.Scanner;

public class Exercise04_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String s = input.next();
		
		if (s.length() == 11 && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2)) && Character.isDigit(s.charAt(4)) 
					&& Character.isDigit(s.charAt(5)) && Character.isDigit(s.charAt(7)) && Character.isDigit(s.charAt(8)) && Character.isDigit(s.charAt(9))
					&& Character.isDigit(s.charAt(10)) && s.charAt(3) == '-' && s.charAt(6) == '-') 
				System.out.print(s + " is a valid social security number");	
		else {
			System.out.print(s + " is an invalid social security number");
		}
		
		input.close();
	}

}
