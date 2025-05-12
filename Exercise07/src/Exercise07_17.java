import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] names = new String[numberOfStudents];
        int[] unsortedScores = new int[numberOfStudents];

        System.out.println("Enter each student's name followed by their score");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            names[i] = input.next();
            unsortedScores[i] = input.nextInt();
        }

        int[] sortedScores = new int[unsortedScores.length];
        System.arraycopy(unsortedScores, 0, sortedScores, 0, unsortedScores.length);

        selectionSort(sortedScores);

        for (int i = sortedScores.length - 1; i >= 0; i--) {
            for (int j = 0; j < unsortedScores.length; j++) {
                if (unsortedScores[j] == sortedScores[i]) {
                    System.out.println(names[j]);
                }
            }
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

}
