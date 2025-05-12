import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        try (
            Scanner input = new Scanner(new File(args[1]))
        ) {
            while(input.hasNextLine()) {
                list.add(input.nextLine());
            }
        }

        try (
            PrintWriter output = new PrintWriter(args[1])
        ) {
            for (String line : list) {
                output.println(line.replaceAll(args[0], ""));
            }
        }
    }
}
