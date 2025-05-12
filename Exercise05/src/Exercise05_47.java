import java.util.Scanner;

public class Exercise05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String digits = input.nextLine();

        int checksum = 0;
        for (int i = 0; i <= digits.length() - 1; i++) {
            int temp = digits.charAt(i) - '0'; // subtract chars to get int

            if (i % 2 != 0) { // start from index 0, all odds are 3 * temp then add to checksum
                checksum += 3 * temp;
            }

            else { // all evens are just add to checksum
                checksum += temp;
            }
        }
        checksum = 10 - checksum % 10;

        if (digits.length() != 12) { // if input is invalid
            System.out.print(digits + " is an invalid input");
        }
        else if (checksum == 10) { // if checksum == 10, replace with 0
            System.out.print("The ISBN-13 number is " + digits + 0);
        }
        else { // display isbn-13
            System.out.print("The ISBN-13 number is " + digits + checksum);
        }

    }
}
