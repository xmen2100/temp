import java.util.Scanner;

public class Exercise05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");

        int count = 1; // start count at 1 to go into while loop
        double sum = 0; // initialize sum
        double sumOfEachNumberSquared = 0; // initialize the sum of each number squared

        while (count <= 10) { // loop 10 times
            double temp = input.nextDouble(); // get new input every time
            sum += temp; // add input to sum
            sumOfEachNumberSquared += Math.pow(temp, 2); // square input and add to sumOfEachNumberSquared

            count++; // increment count
        }

        double mean = sum / 10; // calculate mean
        double deviation = Math.sqrt((sumOfEachNumberSquared - Math.pow(sum, 2) / 10) / 9); // calculate deviation

        System.out.println("The mean is " + mean); // display mean
        System.out.printf("The standard deviation is %.5f", deviation); // display deviation
    }
}
