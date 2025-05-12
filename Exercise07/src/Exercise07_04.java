import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[1];

        System.out.print("Enter an unspecified number of scores: ");
        scores[0] = input.nextInt(); // initialize scores with 0th element

        for (int i = 1; ; i++) {
            int[] temp = new int[i + 1]; // create new temp array every new iteration
            temp[i] = input.nextInt();

            if (temp[i] < 0) { // negative number signifies end of input
                break;
            }

            // copy elements from old (scores) array into new (temp) array
            System.arraycopy(scores, 0, temp, 0, i);
            scores = temp; // new (temp) array becomes old (scores) array
        }

        double average = calculateAverage(scores);
        int numOfScoresAbvAvg = numOfScoresAbvAvg(average, scores);
        int numOfScoresEqlAvg = numOfScoresEqlAvg(average, scores);
        int numOfScoresBlwAvg = numOfScoresBlwAvg(average, scores);

        System.out.println("The number of scores above average is: " + numOfScoresAbvAvg);
        System.out.println("The number of scores equal to the average is: " + numOfScoresEqlAvg);
        System.out.print("The number of scores below average is: " + numOfScoresBlwAvg);
    }

    public static double calculateAverage(int[] scores) {
        double sum = 0;
        int count = 0;

        for (int e : scores) {
            sum += e;
            count++;
        }

        return sum / count;
    }

    public static int numOfScoresAbvAvg(double average, int[] scores) {
        int count = 0;

        for (int e : scores) {
            if (e > average) {
                count++;
            }
        }

        return count;
    }

    public static int numOfScoresEqlAvg(double average, int[] scores) {
        int count = 0;

        for (int e : scores) {
            if (e == average) {
                count++;
            }
        }

        return count;
    }

    public static int numOfScoresBlwAvg(double average, int[] scores) {
        int count = 0;

        for (int e : scores) {
            if (e < average) {
                count++;
            }
        }

        return count;
    }
}
