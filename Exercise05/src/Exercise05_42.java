import java.util.Scanner;

public class Exercise05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the desired commission: ");
        double commissionSought = input.nextDouble(); // get input

        double salesAmount = 0;
        for (double commission = 0; commission < commissionSought; salesAmount++) {
            commission = 0; // reset commission every time

            if (salesAmount > 10000) {
                commission += (salesAmount - 10000) * .12;
            }
            if (salesAmount > 5000) {
                commission += 5000 * .10;
            }
            if (salesAmount > 0) {
                commission += 5000 * .08;
            }
        } // display results (it is subtracted 1 to salesAmount)
        System.out.print("The sales amount " + (salesAmount - 1) + " is needed to make a commission of $" + commissionSought);
    }
}
