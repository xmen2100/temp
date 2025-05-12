import java.util.Scanner;

public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double numberInPounds = input.nextDouble();

        double convertToKilograms = numberInPounds * .454;
        System.out.print(numberInPounds + " pounds is " + convertToKilograms + " kilograms");

        input.close();
    }
}
