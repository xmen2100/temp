public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Regular polygon 1\nPerimeter: " + regularPolygon1.getPerimeter() +
            "\nArea: " + regularPolygon1.getArea());
        System.out.println("\nRegular polygon 2\nPerimeter: " + regularPolygon2.getPerimeter() +
            "\nArea: " + regularPolygon2.getArea());
        System.out.println("\nRegular polygon 3\nPerimeter: " + regularPolygon3.getPerimeter() +
            "\nArea: " + regularPolygon3.getArea());
    }
}

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return n * side * side / (4 * Math.tan(Math.PI / n));
    }
}
