import java.util.Arrays;

public class Exercise07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        // S1
        Arrays.fill(lockers, true);

        // S2 - S100
        for (int i = 1; i < lockers.length; i++) {
            for (int j = i; j < lockers.length; j += i + 1) {
                lockers[j] ^= true;
            }
        }

        System.out.print("The lockers that are open are:");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print(" L" + (i + 1));
            }
        }
    }
}
