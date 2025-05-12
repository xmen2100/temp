import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise12_17 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        try (Scanner inputFile = new Scanner(new File("src/hangman.txt"))) {
            while (inputFile.hasNext()) {
                words.add(inputFile.next());
            }
        }

        char playAgain;
        do {
            String word = words.get((int)(Math.random() * words.size()));
            char[] charArray = word.toCharArray();

            char[] guessArray = new char[charArray.length];
            Arrays.fill(guessArray, '*');

            int miss = 0;
            do {
                System.out.print("(Guess) Enter a letter in word ");
                for (char ch : guessArray) {
                    System.out.print(ch);
                }
                System.out.print(" > ");
                char guess = input.next().charAt(0);

                boolean letterIsInWord = false;
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == guess) {
                        if (guessArray[i] == '*') {
                            guessArray[i] = guess;
                        }
                        else {
                            System.out.println(guess + " is already in the word");
                        }
                        letterIsInWord = true;
                    }
                }
                if (!letterIsInWord) {
                    System.out.println(guess + " is not in the word");
                    miss++;
                }

            } while (!Arrays.equals(charArray, guessArray));

            System.out.println("The word is " + word + ". You missed " + miss + (miss == 1 ? " time" : " times"));
            System.out.print("Do you want to guess another word? Enter y or n> ");
            playAgain = input.next().charAt(0);

        } while (playAgain == 'y');
    }
}
