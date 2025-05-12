import java.awt.geom.Line2D;

public class Exercise10_12 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
            new MyPoint(4.2, 3), new MyPoint(5, 3.5));

        System.out.println("t1 Area: " + t1.getArea());
        System.out.println("t1 Perimeter: " + t1.getPerimeter());
        System.out.println("t1 contains (3, 3)? " + t1.contains(new MyPoint(3, 3)));
        System.out.println("t1 contains t? " + t1.contains(new Triangle2D(new MyPoint(2.9, 2),
            new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("t1 overlaps t? " + t1.overlaps(new Triangle2D(new MyPoint(2, 5.5),
            new MyPoint(4, -3), new MyPoint(2, 6.5))));
    }
}

class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = MyPoint.distance(p1, p2);
        double side2 = MyPoint.distance(p2, p3);
        double side3 = MyPoint.distance(p3, p1);

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return MyPoint.distance(p1, p2) + MyPoint.distance(p2, p3)
            + MyPoint.distance(p1, p3);
    }

    public boolean contains(MyPoint p) {
        double side1 = MyPoint.distance(p1, p2);
        double side2 = MyPoint.distance(p2, p);
        double side3 = MyPoint.distance(p, p1);

        double s = (side1 + side2 + side3) / 2;
        double areaABp = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        side1 = MyPoint.distance(p1, p3);
        side2 = MyPoint.distance(p3, p);
        side3 = MyPoint.distance(p, p1);

        s = (side1 + side2 + side3) / 2;
        double areaACp = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        side1 = MyPoint.distance(p2, p3);
        side2 = MyPoint.distance(p3, p);
        side3 = MyPoint.distance(p, p2);

        s = (side1 + side2 + side3) / 2;
        double areaBCp = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return areaABp + areaACp + areaBCp == getArea();
    }

    public boolean contains(Triangle2D t) {
        MyPoint p1 = t.p1;
        MyPoint p2 = t.p2;
        MyPoint p3 = t.p3;

        return contains(p1) && contains(p2) && contains(p3);
    }

    public boolean overlaps(Triangle2D t) {
        Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
        Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
        Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());

        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

        return contains(t) || t.contains(this) ||
            line1.intersectsLine(side1) ||
            line1.intersectsLine(side2) ||
            line1.intersectsLine(side3) ||
            line2.intersectsLine(side1) ||
            line2.intersectsLine(side2) ||
            line2.intersectsLine(side3) ||
            line3.intersectsLine(side1) ||
            line3.intersectsLine(side2) ||
            line3.intersectsLine(side3);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}