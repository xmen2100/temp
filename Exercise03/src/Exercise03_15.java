import java.util.Scanner;

public class Exercise03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int lotteryDigit3 = lottery % 10;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit1 = lottery / 100;

        int guessDigit3 = guess % 10;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit1 = guess / 100;

        System.out.println("The lottery number is " + lottery);
        if (guess == lottery) {
            System.out.print("Exact match: you win $10,000");
        }

        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1 || 
        guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 & guessDigit3 == lotteryDigit2 || 
        guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3 || 
        guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1 ||
        guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) {
            System.out.print("Match all digits: you win $3,000");
        }

        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || 
        guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 ||
        guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 ||
        guessDigit3 == lotteryDigit3) {
            System.out.print("Match one digit: you win $1,000");
        }

        else
            System.out.print("Sorry no match");
        input.close();
    }
}
