import java.util.Scanner;

public class Exercise05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine(); // get input

        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        for (int i = 0; i <= str.length() - 1; i++) { // iterate through index of string start from 0
            switch (str.toUpperCase().charAt(i)) { // check using uppercase of char
                case 'A', 'E', 'I', 'O', 'U' : numberOfVowels++; break; // check if char is vowel
                case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', // check if char is consonant
                     'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' : numberOfConsonants++; break;
            }
        }
        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.print("The number of consonants is " + numberOfConsonants);
    }
}
