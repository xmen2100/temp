public class Exercise04_06 {
    public static void main(String[] args) {
        final int R = 40;

        double alpha1 = Math.random() * 2 * Math.PI;
        double alpha2 = Math.random() * 2 * Math.PI;
        double alpha3 = Math.random() * 2 * Math.PI;

        double x1 = R * Math.cos(alpha1);
        double y1 = R * Math.sin(alpha1);
        double x2 = R * Math.cos(alpha2);
        double y2 = R * Math.sin(alpha2);
        double x3 = R * Math.cos(alpha3);
        double y3 = R * Math.sin(alpha3);

        alpha1 = Math.toDegrees(alpha1);
        alpha2 = Math.toDegrees(alpha2);
        alpha3 = Math.toDegrees(alpha3);
        System.out.printf("The three points are %.2f %.2f %.2f %.2f %.2f %.2f", x1, y1, x2, y2, x3, y3);
        System.out.println();
        System.out.printf("The three angles are %.2f %.2f %.2f", alpha1, alpha2, alpha3);
    }
}
