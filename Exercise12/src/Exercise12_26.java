import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) {
        String directoryName;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a directory: ");
            directoryName = input.next();
        }

        if (new File(directoryName).mkdirs()) {
            System.out.println("Directory " + directoryName + " created successfully");
        }
        else {
            System.out.println("Directory " + directoryName + " already exists");
        }
    }
}
