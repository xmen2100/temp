public class Exercise08_16 {
    public static void main(String[] args) {
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(m);

        printArray(m);
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            int[] currentMinRow = m[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (currentMinRow[0] > m[j][0] || (currentMinRow[1] > m[j][1] && currentMinRow[0] == m[j][0])) {
                    currentMinRow = m[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                m[currentMinIndex] = m[i];
                m[i] = currentMinRow;
            }
        }

    }

    public static void printArray(int[][] m) {
        for (int[] row : m) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
