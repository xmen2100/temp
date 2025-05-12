import java.util.Scanner;

public class Exercise02_23 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        double cost = (int)(price / miles * distance * 100) / 100.0;
        System.out.print("The cost of driving is $" + cost);
        input.close();
   } 
}
