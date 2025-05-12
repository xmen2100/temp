import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_18 srcRootDirectory");
            System.exit(1);
        }

        if (!new File(args[0]).exists()) {
            System.out.println("Directory does not exist");
            System.exit(2);
        }

        if (!new File(args[0]).isDirectory()) {
            System.out.println("It is not a directory");
            System.exit(3);
        }

        for (int i = 1; i < 4; i++) {
            File directory = new File(args[0] + "/chapter" + i);
            File[] files =  directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    ArrayList<String> lines = new ArrayList<>();

                    try (Scanner input = new Scanner(file)) {
                        while (input.hasNextLine()) {
                            String s1 = input.nextLine();
                            lines.add(s1);
                        }
                    }

                    try (PrintWriter output = new PrintWriter(file)) {
                        output.println("package " + args[0] + ".chapter" + i + ";");
                        for (String line : lines) {
                            output.println(line);
                        }
                    }
                }

            }
        }
    }
}
