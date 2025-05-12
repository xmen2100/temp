import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/SortedStrings.txt");

        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                list.add(input.next());
            }
        }
        String[] array = list.toArray(new String[0]);

        String[] sortedArray = new String[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        java.util.Arrays.sort(sortedArray);

        if (!java.util.Arrays.equals(array, sortedArray)) {
            System.out.print("The first two strings that are out of order are: ");

            int count = 0;
            for (int i = 0; i < array.length && count < 2; i++) {
                if (!array[i].equals(sortedArray[i])) {
                    System.out.print("\"" + array[i] + "\"");
                    count++;

                    if (count == 1) {
                        System.out.print(" and ");
                    }
                }
            }
        }
        else {
            System.out.println("The strings are sorted in increasing order");
        }
    }
}
