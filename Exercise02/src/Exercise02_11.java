import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312032486 + years * (int)((1.0/7 * 60/1.0 * 60/1.0 * 24/1.0 * 365/1.0) + (-1.0/13 * 60/1.0 * 60/1.0 * 24/1.0 * 365/1.0) + (1.0/45 * 60/1.0 * 60/1.0 * 24/1.0 * 365/1.0));

        System.out.print("The population in " + years + " is " + population);
        input.close();
    }
}