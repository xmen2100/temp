import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.print("The two arrays are identical");
        }
        else {
            System.out.print("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[][] sortedList1 = new int[m1.length][m1[0].length];
        int[][] sortedList2 = new int[m2.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            System.arraycopy(m1[i], 0, sortedList1[i], 0, m1[i].length);
            System.arraycopy(m2[i], 0, sortedList2[i], 0, m2[i].length);

            Arrays.sort(sortedList1[i]);
            Arrays.sort(sortedList2[i]);
            if (!Arrays.equals(sortedList1[i], sortedList2[i])) {
                return false;
            }
        }
        return true;
    }
}
