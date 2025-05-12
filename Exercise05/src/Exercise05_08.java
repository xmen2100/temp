import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        System.out.print("Enter the number of students: "); // Prompt user for number of students
        int numOfStudents = input.nextInt();

        int count = 1; // Keep count of loop
        String topStudent = ""; // Top student name
        int topScore = 0; // Top student score
        while (count <= numOfStudents) {
            System.out.print("Enter name of student: "); // Prompt user for student name
            String student = input.next();
            System.out.print("Enter " + student + "'s score: "); // Prompt user for student score
            int score = input.nextInt();

            if (score > topScore) { // Score becomes topScore if greater than score
                topStudent = student;
                topScore = score;
            }
            count++; // Increment count
        }
        // Display results
        System.out.println("Top Student: " + topStudent);
        System.out.print("Top Score: " + topScore);
    }
}
