import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_16 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> lines = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String s1 = input.nextLine();
                s1 = s1.replaceAll(args[1], args[2]);
                lines.add(s1);
            }
        }
        try (PrintWriter output = new PrintWriter(file)) {
            for (String line : lines) {
                output.println(line);
            }
        }
    }
}
