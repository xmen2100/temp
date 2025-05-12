import java.util.Scanner;

public class Exercise13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 sides of a triangle: ");
        GeometricObject t1 = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.print("Enter the color of the triangle: ");
        t1.setColor(input.next());

        System.out.print("Enter if triangle is filled: ");
        t1.setFilled(input.nextBoolean());

        System.out.println(t1);
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "\nThe area is " + getArea() + "\nThe perimeter is " + getPerimeter() + "\n" + super.toString();
    }
}