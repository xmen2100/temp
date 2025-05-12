public class Exercise07_07 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 1; i <= 100; i++) {
            int num = (int)(Math.random() * 10);

            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
        }
    }
}
