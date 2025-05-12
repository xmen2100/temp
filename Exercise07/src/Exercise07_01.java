import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] studentScores = new int[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        studentScores[0] = input.nextInt(); // get first score

        int best = studentScores[0]; // make first score the best

        for (int i = 1; i < studentScores.length; i++) {
            studentScores[i] = input.nextInt();

            if (studentScores[i] > best) { // if score > best
                best = studentScores[i]; // score becomes new best
            }
        }

        String[] grades = {"A", "B", "C", "D", "F"};

        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Student " + i + " score is "
                    + studentScores[i] + " and grade is ");

            if (studentScores[i] >= best - 10) {
                System.out.println(grades[0]);
            }
            else if (studentScores[i] >= best - 20) {
                System.out.println(grades[1]);
            }
            else if (studentScores[i] >= best - 30) {
                System.out.println(grades[2]);
            }
            else if (studentScores[i] >= best - 40) {
                System.out.println(grades[3]);
            }
            else {
                System.out.println(grades[4]);
            }
        }
    }
}
