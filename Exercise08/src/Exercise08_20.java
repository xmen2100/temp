import java.util.Scanner;

public class Exercise08_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] connectFour = new char[6][7];

        do {
            do {
                displayBoard(connectFour);

                System.out.print("Drop a red disk at column (0-6): ");
                if (isDropDisk(connectFour, input.nextInt(), 'R')) {
                    break;
                }

                System.out.println("\nThere are no more empty slots in this column.");
                System.out.println("Please try again.");
            } while (true);

            System.out.println();
            if (isConsecutiveFour(connectFour)) {
                displayBoard(connectFour);
                System.out.print("The red player won");
                break;
            }
            else if (Exercise08_09.isDraw(connectFour)) {
                displayBoard(connectFour);
                System.out.print("It is a draw");
                break;
            }

            do {
                displayBoard(connectFour);

                System.out.print("Drop a yellow disk at column (0-6): ");
                if (isDropDisk(connectFour, input.nextInt(), 'Y')) {
                    break;
                }

                System.out.println("\nThere are no more empty slots in this column.");
                System.out.println("Please try again.");
            } while (true);

            System.out.println();
            if (isConsecutiveFour(connectFour)) {
                displayBoard(connectFour);
                System.out.print("The yellow player won");
                break;
            }
            else if (Exercise08_09.isDraw(connectFour)) {
                displayBoard(connectFour);
                System.out.print("It is a draw");
                break;
            }

        } while (true);
    }

    public static void displayBoard(char[][] connectFour) {
        for (char[] row : connectFour) {
            System.out.print("|");
            for (char col : row) {
                if (col == 0) {
                    System.out.print(" |");
                }
                else {
                    System.out.print(col + "|");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static boolean isDropDisk(char[][] connectFour, int colIndex, char disk) {
        for (int i = connectFour.length - 1; i >= 0; i--) {
            if (connectFour[i][colIndex] == 0) {
                connectFour[i][colIndex] = disk;
                return true;
            }
        }
        return false;
    }

    public static boolean isConsecutiveFour(char[][] connectFour) {
        for (char[] row : connectFour) {
            for (int j = 0; j < row.length - 3; j++) {
                if (row[j] == row[j + 1] &&
                    row[j] == row[j + 2] &&
                    row[j] == row[j + 3] &&
                    row[j] != 0) {
                    return true;
                }
            }
        }

        for (int i = 0; i < connectFour.length - 3; i++) {
            for (int j = 0; j < connectFour[i].length; j++) {
                if (connectFour[i][j] == connectFour[i + 1][j] &&
                    connectFour[i][j] == connectFour[i + 2][j] &&
                    connectFour[i][j] == connectFour[i + 3][j] &&
                    connectFour[i][j] != 0) {
                    return true;
                }
            }
        }

        for (int i = 0; i < connectFour.length - 3; i++) {
            for (int j = 3; j < connectFour[i].length; j++) {
                if (connectFour[i][j] == connectFour[i + 1][j - 1] &&
                    connectFour[i][j] == connectFour[i + 2][j - 2] &&
                    connectFour[i][j] == connectFour[i + 3][j - 3] &&
                    connectFour[i][j] != 0) {
                    return true;
                }
            }
        }

        for (int i = 0; i < connectFour.length - 3; i++) {
            for (int j = 0; j < connectFour[i].length - 3; j++) {
                if (connectFour[i][j] == connectFour[i + 1][j + 1] &&
                    connectFour[i][j] == connectFour[i + 2][j + 2] &&
                    connectFour[i][j] == connectFour[i + 3][j + 3] &&
                    connectFour[i][j] != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
