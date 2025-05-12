public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("c1 Area: " + c1.getArea());
        System.out.println("c1 Perimeter: " + c1.getPerimeter());
        System.out.println("c1 contains (3, 3)? " + c1.contains(3, 3));
        System.out.println("c1 contains circle? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1 overlaps circle? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
            Math.pow(y - this.y, 2)) < radius;
    }

    public boolean contains(Circle2D circle) {
        double dist = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
        return dist + circle.radius < radius;
    }

    public boolean overlaps(Circle2D circle) {
        double dist = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
        return dist < radius + circle.radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
