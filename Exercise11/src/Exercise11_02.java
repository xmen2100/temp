import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise11_02 {
    public static void main(String[] args) {
        Person person = new Person("Bill");
        Student student = new Student("Joe");
        Employee employee = new Employee("Jack");
        Faculty faculty = new Faculty("Emily");
        Staff staff = new Staff("Natalie");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + getName();
    }
}

class Student extends Person {
    public final int FRESHMAN = 1;
    public final int SOPHOMORE = 2;
    public final int JUNIOR = 3;
    public final int SENIOR = 4;

    protected int status;

    Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}

class Faculty extends Employee {
    protected String officeHours;
    protected String rank;

    Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty: " + getName();
    }
}

class Staff extends Employee {
    protected String title;

    Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}

class MyDate {
    private int year, month, day;

    public MyDate() {
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH); // month is 0-based ex. 0 for January
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}