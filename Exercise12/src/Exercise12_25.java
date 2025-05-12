import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_25 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL myURL = new URI("http://liveexample.pearsoncmg.com/data/Salary.txt").toURL();

        try (Scanner input = new Scanner(myURL.openStream())) {
            double facultySum = 0;
            double assistantSum = 0;
            double associateSum = 0;
            double fullProfSum = 0;

            int facultyCount = 0;
            int assistantCount = 0;
            int associateCount = 0;
            int fullProfCount = 0;

            while (input.hasNextLine()) {
                String[] lines;
                lines = input.nextLine().split("\\s");

                switch (lines[2]) {
                    case "assistant" -> {
                        assistantSum += Double.parseDouble(lines[3]);
                        assistantCount++;
                    }
                    case "associate" -> {
                        associateSum += Double.parseDouble(lines[3]);
                        associateCount++;
                    }
                    case "full" -> {
                        fullProfSum += Double.parseDouble(lines[3]);
                        fullProfCount++;
                    }
                }

                facultySum += Double.parseDouble(lines[3]);
                facultyCount++;
            }

            System.out.printf("Assistant Professor Total Salary: $%,.2f\n", assistantSum);
            System.out.printf("Associate Professor Total Salary: $%,.2f\n", associateSum);
            System.out.printf("Full Professor Total Salary: $%,.2f\n", fullProfSum);
            System.out.printf("Faculty Total Salary: $%,.2f\n", facultySum);

            System.out.printf("\nAssistant Professor Average Salary: $%,.2f\n", assistantSum / assistantCount);
            System.out.printf("Associate Professor Average Salary: $%,.2f\n", associateSum / associateCount);
            System.out.printf("Full Professor Average Salary: $%,.2f\n", fullProfSum / fullProfCount);
            System.out.printf("Faculty Average Salary: $%,.2f", facultySum / facultyCount);
        }
    }
}
