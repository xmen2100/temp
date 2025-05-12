import java.util.Scanner;

public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in integer, for example 1156 ");
        System.out.print("for 11 dollars and 56 cents: ");
        int amount = input.nextInt();

        int inDollars = amount / 100;
        int remainingAmount = amount % 100;

        int inQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int inDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int inNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int inPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of ");
        System.out.println(inDollars + " dollars");
        System.out.println(inQuarters + " quarters");
        System.out.println(inDimes + " dimes");
        System.out.println(inNickels + " nickels");
        System.out.print(inPennies + " pennies");
        input.close();
    }
}
