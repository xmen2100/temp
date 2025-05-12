import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double cylinderRadius = input.nextDouble();
        double cylinderLength = input.nextDouble();

        double cylinderArea = Math.pow(cylinderRadius, 2) * 3.14159;
        double cylinderVolume = cylinderArea * cylinderLength;

        System.out.println("The area is " + cylinderArea);
        System.out.print("The volume of the cylinder is " + cylinderVolume);

        input.close();
    }
}
