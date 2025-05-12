import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNum = new int[10];

        System.out.print("Enter 10 numbers: ");
        distinctNum[0] = input.nextInt(); // must initialize distinctNum outside loop

        int count = 1;
        for (int i = 1; i < distinctNum.length; i++) {
            int num = input.nextInt();

            if (isDistinct(num, distinctNum)) {
                distinctNum[i] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are:");
        displayDistinctNum(distinctNum);
    }

    public static boolean isDistinct(int num, int[] distinctNum) {
        for (int e : distinctNum) {
            if (num == e) {
                return false;
            }
        }
        return true;
    }

    public static void displayDistinctNum(int[] distinctNum) {
        for (int e : distinctNum) {
            if (e != 0) { // by default all elements in an int array is 0
                System.out.print(" " + e);
            }
        }
    }
}
