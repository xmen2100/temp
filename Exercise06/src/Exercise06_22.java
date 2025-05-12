import java.util.Scanner;

public class Exercise06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive double value: ");
        double n = input.nextDouble(); // get input as a double

        System.out.print("Its square root is " + sqrt((long)n)); // invoke method and cast n to long
    }

    public static double sqrt(long n) {
        double lastGuess = 1; // initial value

        while (true) {
            double nextGuess = (lastGuess + n / lastGuess) / 2;

            // check if absolute difference of nextGuess and lastGuess < 0.0001
            if (Math.abs(nextGuess - lastGuess) < 0.0001) {
                return nextGuess; // if so, nextGuess is sqrt of n
            }

            lastGuess = nextGuess; // otherwise, nextGuess becomes lastGuess
        }
    }
}
