public class Exercise13_05 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(2);
        circle1.setColor("blue");
        circle1.setFilled(false);
        GeometricObject circle2 = new Circle(1);
        circle2.setColor("red");
        circle2.setFilled(true);

        System.out.println("This is circle1:\n" + circle1);
        System.out.println("\nThis is circle2:\n" + circle2);

        System.out.println("\n-------------------------------\n");

        GeometricObject rect1 = new Rectangle(1, 2);
        rect1.setColor("purple");
        rect1.setFilled(true);
        GeometricObject rect2 = new Rectangle(2, 4);
        rect2.setColor("orange");
        rect2.setFilled(false);

        System.out.println("This is rect1:\n" + rect1);
        System.out.println("\nThis is rect2:\n" + rect2);
    }
}


