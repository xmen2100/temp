public class Exercise13_06 {
    public static void main(String[] args) {
        GeometricObject circle1 = new ComparableCircle(3);
        GeometricObject circle2 = new ComparableCircle(4);
        circle1.setColor("black");
        circle1.setFilled(false);
        circle2.setColor("white");
        circle2.setFilled(true);

        System.out.println("This is circle1:\n" + circle1);
        System.out.println("\nThis is circle2:\n" + circle2);
        System.out.println("\n-------------------------------\n");

        GeometricObject rect1 = new Rectangle(2, 4);
        rect1.setColor("purple");
        rect1.setFilled(true);

    }
}

class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }
}