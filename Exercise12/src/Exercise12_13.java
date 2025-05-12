import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        int chars = 0;
        int words = 0;

        try (Scanner input = new Scanner(new File(args[0]))) {
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
        }

        for (String line : lines) {
            try (Scanner inputLine = new Scanner(line)) {
                while (inputLine.hasNext()) {
                    inputLine.next();
                    words++;
                }
            }
            chars += line.length();
        }

        System.out.println("File " + args[0] + " has");
        System.out.println(chars + " characters");
        System.out.println(words + " words");
        System.out.println(lines.size() + " lines");
    }
}
