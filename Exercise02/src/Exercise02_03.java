import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double numberInFeet = input.nextDouble();

        double convertToMeter = numberInFeet * .305;
        System.out.print(numberInFeet + " feet is " + convertToMeter + " meters");

        input.close();
    }
}
