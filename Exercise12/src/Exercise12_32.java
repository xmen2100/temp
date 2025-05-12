import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_32 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.printf("%-5s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%s\n", "Year", "Rank 1",
            "Rank 2", "Rank 3", "Rank 4", "Rank 5", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");

        for (int i = 2010; i >= 2001; i--) {
            URL myURL = new URI("http://liveexample.pearsoncmg.com/data/babynamesranking" +
                i + ".txt").toURL();

            ArrayList<String> names = names(myURL);
            ArrayList<String> girlNames = getGirlNames(names);
            ArrayList<String> boyNames = getBoyNames(names);

            System.out.printf("%-5s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%s\n", i, girlNames.getFirst(),
                girlNames.get(1), girlNames.get(2), girlNames.get(3), girlNames.getLast(), boyNames.getFirst(),
                boyNames.get(1), boyNames.get(2), boyNames.get(3), boyNames.getLast());
        }
    }

    public static ArrayList<String> names(URL myURL) throws IOException{
        ArrayList<String> names = new ArrayList<>();

        try (Scanner urlInput = new Scanner(myURL.openStream())) {
            for (int i = 0; i < 5; i++) {
                String line = urlInput.nextLine();
                String[] lineArray = line.split("\\s+");

                names.add(lineArray[3]); // add girl name
                names.add(lineArray[1]); // add boy name
            }
        }
        return names;
    }

    public static ArrayList<String> getGirlNames(ArrayList<String> names) {
        ArrayList<String> girlNames = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                girlNames.add(names.get(i));
            }
        }
        return girlNames;
    }

    public static ArrayList<String> getBoyNames(ArrayList<String> names) {
        ArrayList<String> boyNames = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (i % 2 != 0) {
                boyNames.add(names.get(i));
            }
        }
        return boyNames;
    }
}
