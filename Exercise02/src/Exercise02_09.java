import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double initVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();
        
        double avgAccel = (finalVelocity - initVelocity) / time;

        System.out.print("The average acceleration is " + avgAccel);

        input.close();
    }
}
