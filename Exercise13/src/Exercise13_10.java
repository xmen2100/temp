public class Exercise13_10 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2, 4);
        Rectangle rect2 = new Rectangle(4, 2);
        Rectangle rect3 = new Rectangle(1, 5);

        System.out.println(rect1.compareTo(rect2));
        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.compareTo(rect3));
        System.out.println(rect1.equals(rect3));
    }
}

class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        }
        else if (getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            return getArea() == ((Rectangle)o).getArea();
        }
        return false;
    }
}
