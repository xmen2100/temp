import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);

        double distance = RADIUS * Math.acos(Math.sin(x1Rad) * Math.sin(x2Rad) + 
        Math.cos(x1Rad) * Math.cos(x2Rad) * Math.cos(y1Rad - y2Rad));
        
        System.out.print("The distance between the two points is " + distance + " km");
        input.close();
    }
}
