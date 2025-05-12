import java.util.Scanner;

public class Exercise05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();

        int checksum = 0;
        System.out.print("The ISBN-10 number is ");

        for (int i = 1; i <= 9; i++) {
            // get chosen digit in the least significant place by dividing by power of 10 then % 10 to get that digit
            int digitAti = (digits / (int)Math.pow(10, 9 - i)) % 10;

            checksum += digitAti * i; // multiply digit by i then add to checksum
            System.out.print(digitAti); // print digit
        }

        checksum %= 11;
        System.out.print(checksum == 10 ? "X" : checksum);

        input.close();
    }
}
