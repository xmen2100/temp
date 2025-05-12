import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }

        File rootDirectory = new File(args[0]);
        if (!rootDirectory.exists()) {
            System.out.println("Directory " + rootDirectory + " does not exist");
            System.exit(2);
        }

        if (!rootDirectory.isDirectory()) {
            System.out.println(rootDirectory + " is not a directory");
            System.exit(3);
        }

        for (int i = 1; i < 4; i++) {
            File directory = new File(rootDirectory + "/chapter" + i);
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    ArrayList<String> lines = new ArrayList<>();
                    try (Scanner input = new Scanner(file)) {
                        while (input.hasNextLine()) {
                            String s1 = input.nextLine();
                            if (!s1.trim().equals("package " + rootDirectory + ".chapter" + i + ";")) {
                                lines.add(s1);
                            }
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
}
