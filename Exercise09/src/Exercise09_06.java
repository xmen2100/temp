import java.util.Random;

public class Exercise09_06 {
    public static void main(String[] args) {
        final int size = 100000;
        double[] numArray = new double[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numArray[i] = random.nextDouble(size);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(numArray);
        stopWatch.stop();

        System.out.println("The execution time of sorting " + size +
            " numbers is " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

