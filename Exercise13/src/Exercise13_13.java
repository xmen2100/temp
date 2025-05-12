public class Exercise13_13 {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming");
        Course course2 = (Course)course1.clone();

        System.out.println(course1.getStudents() == course2.getStudents());
    }
}

class Course implements Cloneable {
    private final String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
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

    @Override
    public Object clone() {
        try {
            Course courseClone = (Course)super.clone();
            courseClone.students = students.clone();
            return courseClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
