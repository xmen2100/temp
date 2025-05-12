public class Exercise03_16 {
    public static void main(String[] args) {
        int width = (int)(Math.random() * 101 - 50);
        int height = (int)(Math.random() * 201 - 100);

        double newWidth = width + Math.random();
        double newHeight = height + Math.random();

        if (width == -50 || width == 50) {
            System.out.print(width);
        }
        else {
            System.out.print(newWidth);
        }
        
        System.out.print(", ");

        if (height == -100 || height == 100) {
            System.out.print(height);
        }
        else {
            System.out.print(newHeight);
        }
    }
}
