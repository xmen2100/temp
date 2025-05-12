public class Exercise13_07 {
    public static void main(String[] args) {
        GeometricObject[] geoObjs = {new Square(5), new Square(3),
        new Rectangle(2, 4), new Circle(2), new Square()};

        for (GeometricObject geoObj : geoObjs) {
            System.out.println(geoObj.getArea());

            if (geoObj instanceof Colorable) {
                ((Colorable)geoObj).howToColor();
            }
            System.out.println();
        }
    }
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
