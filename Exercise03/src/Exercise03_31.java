import java.util.Scanner;

public class Exercise03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to Indonesian Rupiah: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to Indonesian Rupiah and 1 vice versa: ");
        int convert = input.nextInt();

        if (convert == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollar = input.nextDouble();
            double conversion = dollar * exchangeRate;
            System.out.print("$" + dollar +  " is " + conversion + " Indonesian Rupiah");
        }
        else if (convert == 1) {
            System.out.print("Enter the Indonesian Rupiah amount: ");
            double indonesianRupiah = input.nextDouble();
            double conversion = indonesianRupiah / exchangeRate;
            System.out.print(indonesianRupiah + " Indonesian Rupiah" + " is $" + conversion);
        }
        input.close();
    }
}
