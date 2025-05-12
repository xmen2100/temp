import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        File file2 = new File("Temp.txt");

        try (
            Scanner input = new Scanner(file);
            PrintWriter output = new PrintWriter(file2)
        ) {
            String s1 = input.nextLine();
            output.print(s1);

            while (input.hasNextLine()) {
                String s = input.nextLine();
                if (s.contains("{")) {
                    output.print(" {");
                }
                else {
                    output.print("\n" + s);
                }
            }
        }
        if (!file.delete()) {
            System.out.println("Unable to delete file " + file);
        }
        if (!file2.renameTo(file)) {
            System.out.println("Unable to rename file " + file2);
        }
    }
}
