public class Exercise10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("r1 contains (3, 3)? " + r1.contains(3, 3));
        System.out.println("r1 contains rectangle (4, 5, 10.5, 3.2)? " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1 overlaps? " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }

    public static class MyRectangle2D {
        private double x, y, width, height;

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

        public MyRectangle2D() {
            x = y = 0;
            width = height = 1;
        }

        public MyRectangle2D(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * width + 2 * height;
        }

        public boolean contains(double x, double y) {
            double rightX = this.x + width / 2;
            double leftX = this.x - width / 2;

            double upY = this.y + height / 2;
            double downY = this.y - height / 2;

            return x > leftX && x < rightX && y > downY && y < upY;
        }

        public boolean contains(MyRectangle2D r) {
            return
                getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                    getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                    height / 2 + r.getHeight() / 2 <= height &&
                    width / 2 + r.getWidth() / 2 <= width;
        }

        public boolean overlaps(MyRectangle2D r) {
            return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                    (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
        }

        private double getDistance(double p1, double p2) {
            return Math.sqrt(Math.pow(p2 - p1, 2));
        }
    }
}