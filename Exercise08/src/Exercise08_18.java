import java.util.Arrays;

public class Exercise08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int[] temp = m[i];
            int randIndex = (int)(Math.random() * m.length);

            m[i] = m[randIndex];
            m[randIndex] = temp;
        }
    }
}
