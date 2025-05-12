import java.util.ArrayList;

class Course {
    private final String courseName;
    private final ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;
    }
}

public class Exercise11_05 {
    public static void main(String[] args) {
        Course course1 = new Course("Math");
        course1.addStudent("Joe");
        course1.addStudent("Bill");
        course1.addStudent("Nye");
        course1.addStudent("Hillary");
        System.out.println(course1.getStudents());
        System.out.println(course1.getNumberOfStudents());
        System.out.println(course1.getCourseName());
        System.out.println("After drop \"Bill\":");
        course1.dropStudent("Bill");
        System.out.println(course1.getStudents());
        System.out.println(course1.getNumberOfStudents());
        System.out.println(course1.getCourseName());
    }
}