public class Exercise13_12 {
    public static void main(String[] args) {
        double area = sumArea(new GeometricObject[] {new Circle(1), new Circle(2),
            new Rectangle(3, 4), new Rectangle(5, 6)});

        System.out.println("The total area is " + area);
    }

    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }
}
