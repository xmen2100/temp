import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energy = mass * (finalTemp - initTemp) * 4184;
        System.out.print("The energy needed is " + energy);

        input.close();
    }
}