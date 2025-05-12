import java.util.Scanner;

public class Exercise05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        String highestStudent = "";
        int secondHighestScore = 0;
        String secondHighestStudent = "";

        System.out.print("Enter the number of students: ");
        int num = input.nextInt();

        for (int count = 1; count <= num; count++ ) { // Count until equal num of students
            System.out.print("Enter student" + count + "'s name: ");
            String student = input.next();
            System.out.print("Enter " + student + "'s score: ");
            int score = input.nextInt();

            if (score > highestScore) {
                secondHighestScore = highestScore; // highest score becomes second highest
                secondHighestStudent = highestStudent; // highest student becomes second highest

                highestScore = score; // score becomes new highest
                highestStudent = student; // student becomes new highest
            }

            else if (score > secondHighestScore) { // if not greater than highest but still greater than second
                secondHighestScore = score;
                secondHighestStudent = student;
            }
        }
        // Display results
        System.out.println("Student with the highest score is " + highestStudent + " with " + highestScore + " score");
        System.out.println("Student with the second highest score is " + secondHighestStudent + " with " + secondHighestScore + " score");
    }
}
