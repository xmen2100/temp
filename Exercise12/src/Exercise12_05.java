public class Exercise12_05 {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(1, 2, 3);
            System.out.println(t1);
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Triangle extends GeometricObject {
    private final double side1, side2, side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalTriangleException("Illegal sides");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
            " side3 = " + side3;
    }
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private final java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
            " and filled: " + filled;
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
