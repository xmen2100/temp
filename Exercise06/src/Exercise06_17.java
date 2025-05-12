import java.util.Scanner;

public class Exercise06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt(); // get user input

        printMatrix(n); // invoke printMatrix
    }

    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) { // print n number of rows
            for (int j = 1; j <= n; j++) { // print n times per row
                if ((j == n) && (i != n)) { // print new line when end of row, except for last row
                    System.out.println((int)(Math.random() * 2));
                }

                else { // if not end of row, print spaces between elements
                    System.out.print((int)(Math.random() * 2) + " ");
                }
            }
        }
    }
}
