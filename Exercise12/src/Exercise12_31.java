import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = consoleInput.nextInt();

        System.out.print("Enter the gender: ");
        char gender = consoleInput.next().charAt(0);

        System.out.print("Enter the name: ");
        String name = consoleInput.next();

        URL myURL = new URI("http://liveexample.pearsoncmg.com/data/babynamesranking" +
            year + ".txt").toURL();

        int rank = rank(myURL, gender, name);
        if (rank == 0) {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
        else {
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        }
    }

    public static int rank(URL myURL, char gender, String name) throws IOException {
        try (Scanner urlInput = new Scanner(myURL.openStream())) {
            while (urlInput.hasNextLine()) {
                String line = urlInput.nextLine();

                String[] lineArray = line.split("\\s+");

                if (gender == 'M' && lineArray[1].equalsIgnoreCase(name)) {
                    return Integer.parseInt(lineArray[0]);
                }
                else if (gender == 'F' && lineArray[3].equalsIgnoreCase(name)) {
                    return Integer.parseInt(lineArray[0]);
                }
            }
        }
        return 0;
    }
}
