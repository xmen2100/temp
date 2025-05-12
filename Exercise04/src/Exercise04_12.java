import java.util.Scanner;

public class Exercise04_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex digit: ");
		String string = input.next();
		char hex = string.charAt(0);
		
		if ((Character.toUpperCase(hex) >= 'A' && Character.toUpperCase(hex) <= 'F') || (hex >= '0' && hex <= '9')) {
			System.out.print("The binary value is ");
			
			switch (Character.toUpperCase(hex)) {
			case '0' : System.out.print("0000"); break;
			case '1' : System.out.print("0001"); break;
			case '2' : System.out.print("0010"); break;
			case '3' : System.out.print("0011"); break;
			case '4' : System.out.print("0100"); break;
			case '5' : System.out.print("0101"); break;
			case '6' : System.out.print("0110"); break;
			case '7' : System.out.print("0111"); break;
			case '8' : System.out.print("1000"); break;
			case '9' : System.out.print("1001"); break;
			case 'A' : System.out.print("1010"); break;
			case 'B' : System.out.print("1011"); break;
			case 'C' : System.out.print("1100"); break;
			case 'D' : System.out.print("1101"); break;
			case 'E' : System.out.print("1110"); break;
			case 'F' : System.out.print("1111"); break;
			}
		}
		
		else {
			System.out.print(string + " is an invalid input");
		}
		input.close();
	}
}