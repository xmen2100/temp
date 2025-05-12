import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL myURL = new URI("https://liveexample.pearsoncmg.com/data/Scores.txt").toURL();

        try (Scanner input = new Scanner(myURL.openStream())) {
            int sum = 0;
            int count = 0;
            while (input.hasNextInt()) {
                sum += input.nextInt();
                count++;
            }

            System.out.println("Total: " + sum);
            System.out.println("Average: " + ((double)sum / count));
        }
    }
}
