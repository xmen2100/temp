import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String fileName = sc.next();

        int[] alphabet = new int[26];

        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNextLine()) {
                String s = input.nextLine();
                for (int i = 0; i < s.length(); i++) {
                    switch (Character.toUpperCase(s.charAt(i))) {
                        case 'A' -> alphabet[0]++;
                        case 'B' -> alphabet[1]++;
                        case 'C' -> alphabet[2]++;
                        case 'D' -> alphabet[3]++;
                        case 'E' -> alphabet[4]++;
                        case 'F' -> alphabet[5]++;
                        case 'G' -> alphabet[6]++;
                        case 'H' -> alphabet[7]++;
                        case 'I' -> alphabet[8]++;
                        case 'J' -> alphabet[9]++;
                        case 'K' -> alphabet[10]++;
                        case 'L' -> alphabet[11]++;
                        case 'M' -> alphabet[12]++;
                        case 'N' -> alphabet[13]++;
                        case 'O' -> alphabet[14]++;
                        case 'P' -> alphabet[15]++;
                        case 'Q' -> alphabet[16]++;
                        case 'R' -> alphabet[17]++;
                        case 'S' -> alphabet[18]++;
                        case 'T' -> alphabet[19]++;
                        case 'U' -> alphabet[20]++;
                        case 'V' -> alphabet[21]++;
                        case 'W' -> alphabet[22]++;
                        case 'X' -> alphabet[23]++;
                        case 'Y' -> alphabet[24]++;
                        case 'Z' -> alphabet[25]++;
                    }
                }
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("Number of " + (char)('A' + i) + "s: " +
                alphabet[i]);
        }
    }
}
