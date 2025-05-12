public class Exercise10_04 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        double dist = MyPoint.distance(p1, p2);
        double dist2 = p1.distance(p2);
        System.out.println("The distance between p1 (0, 0) and p2 (10, 30.5) is " + dist);
    }

}

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p) {
        double x2 = p.x;
        double y2 = p.y;

        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double x1 = p1.x;
        double y1 = p1.y;
        double x2 = p2.x;
        double y2 = p2.y;

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}