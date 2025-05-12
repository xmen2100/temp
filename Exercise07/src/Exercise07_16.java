public class Exercise07_16 {
    public static void main(String[] args) {
        int[] list = new int[100_000];
        int key = (int)(Math.random() * 100_001);

        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100_001);
        }

        long startTime = System.nanoTime();
        System.out.println(key + " is at index " + linearSearch(list, key));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println(executionTime + " nanoseconds with linear search\n");

        java.util.Arrays.sort(list); // must sort the array before invoking binarySearch
        startTime = System.nanoTime();
        System.out.println(key + " is at index " + binarySearch(list, key));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println(executionTime + " nanoseconds with binary search");
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            }
            else if (key == list[mid]) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -(low + 1);
    }
}
