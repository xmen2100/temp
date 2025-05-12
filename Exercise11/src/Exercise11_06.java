import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan(10));
        list.add(new Date());
        list.add(new Circle(1));
        list.add("Hello World");

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}

class Loan {
    private double amount;

    public Loan(double amount) {
        this.amount = amount;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}
