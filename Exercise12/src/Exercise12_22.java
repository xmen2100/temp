import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_22 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 dir oldString newString");
            System.exit(1);
        }

        File directory = new File(args[0]);
        if (!directory.exists()) {
            System.out.println("Directory " + directory + " does not exist");
            System.exit(2);
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
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
    }
}
