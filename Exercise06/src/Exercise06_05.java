import java.util.Scanner;

public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        displaySortedNumbers(n1, n2, n3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double small;
        double medium;
        double large;
        
        if (num1 > num2 && num1 > num3) { // If num1 is greater than num2 and num3
            large = num1; // num1 is largest
            if (num2 > num3) { // If num2 is greater than num3
                small = num3; // num3 is smallest
                medium = num2; // num2 is medium
            }
            else { // else num3 is greater than num2
                small = num2; // num2 is smallest
                medium = num3; // num3 is medium
            }
        }

        else if (num1 > num2) { // If num1 is exclusively greater than num2
            small = num2; // num2 is smallest
            medium = num1; // num1 is medium
            large = num3; // num3 is largest
        }

        else if (num1 > num3) { // If num1 is exclusively greater than num3
            small = num3; // num3 is smallest
            medium = num1; // num1 is medium
            large = num2; // num2 is largest
        }

        else { // else num1 is smallest
            small = num1;
            if (num2 > num3) { // If num2 is greater than num3
                medium = num3; // num3 is medium
                large = num2; // num2 is largest
            }
            else { // else num3 is greater than num2
                medium = num2; // num2 is medium
                large = num3; // num3 is largest
            }
        }
        System.out.print("The numbers in increasing order are " + small + ", " + medium + ", " + large);
    }
}
