import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL myUrl = new URI("https://liveexample.pearsoncmg.com/data/Lincoln.txt").toURL();

        int count = 0;
        try (Scanner input = new Scanner(myUrl.openStream())) {
            while (input.hasNext()) {
                if (Character.isLetter(input.next().charAt(0))) {
                    count++;
                }
            }
        }
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

        System.out.println("The number of words in President " +
            "Abraham Lincoln’s Gettysburg address is " + count);
    }
}
