import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter subtotal and gratuity rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = gratuityRate / 100 * subTotal;
        double total = subTotal + gratuity;

        System.out.print("The gratuity is $" + gratuity + " total is $" + total);

        input.close();
    }
}
