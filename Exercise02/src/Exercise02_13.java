import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter monthly saving amount: ");
        double amount = input.nextDouble();

        double firstMonth = amount * (1 + .00417);
        double secondMonth = (amount + firstMonth) * (1 + .00417);
        double thirdMonth = (amount + secondMonth) * (1 + .00417);
        double fourthMonth = (amount + thirdMonth) * (1 + .00417);
        double fifthMonth = (amount + fourthMonth) * (1 + .00417);
        double sixthMonth = (amount + fifthMonth) * (1 + .00417);

        System.out.println("After the first month, the account value is " + firstMonth);
        System.out.println("After the second month, the account value is " + secondMonth);
        System.out.println("After the third month, the account value is " + thirdMonth);
        System.out.println("After the sixth month, the account value is " + sixthMonth);
        input.close();
    }
}
