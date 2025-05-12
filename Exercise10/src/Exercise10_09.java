import java.util.Arrays;

public class Exercise10_09 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course1.dropStudent("Kim Smith");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
        + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            if (i == course1.getNumberOfStudents() - 1) {
                System.out.print(students[i]);
            }
            else {
                System.out.print(students[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Number of students in course2: " +
            course2.getNumberOfStudents());
    }
}

class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] students = new String[this.students.length + 1];
            System.arraycopy(this.students, 0, students, 0, numberOfStudents);
            this.students = students;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] students = new String[numberOfStudents];
        System.arraycopy(this.students, 0, students, 0, numberOfStudents);
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(student)) {
                students[i] = null;
            }
        }
    }

    public void clear() {
        Arrays.fill(students, null);
    }
}
