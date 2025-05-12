import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArray = new int[1];

        System.out.print("Enter the integers between 1 and 100: ");
        numArray[0] = input.nextInt(); // initialize scores with 0th element

        for (int i = 1; ; i++) {
            int[] temp = new int[i + 1]; // create new temp array every new iteration
            temp[i] = input.nextInt();

            if (temp[i] == 0) { // 0 signifies end of input
                break;
            }

            // copy elements from old (numArray) array to new (temp) array
            System.arraycopy(numArray, 0, temp, 0, i);
            numArray = temp; // new (temp) array becomes old (numArray) array
        }

        int[] counts = count(numArray);
        display(counts);
    }

    public static int[] count(int[] numArray) {
        int[] count = new int[100];

        for (int e : numArray) {
            count[e - 1]++; // 1 is 0th index of count, 2 is 1st index of count, etc.
        }
        return count;
    }

    public static void display(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((i + 1) + " occurs " + count[i] + " time"
                        + (count[i] > 1 ? "s" : ""));
            }
        }
    }
}
