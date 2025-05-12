import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coinFlip = (int)(Math.random() * 2);

        System.out.print("Guess head or tail? Enter 0 for head and 1 for tail: ");
        int guess = input.nextInt();

        switch (coinFlip) {
            case 0 : System.out.print(guess == coinFlip ? "Correct it is a head!" : "Sorry it is a head"); break;
            case 1 : System.out.print(guess == coinFlip ? "Correct it is a tail!" : "Sorry it is a tail"); break;
        }

        input.close();
    }
}
