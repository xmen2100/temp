import java.util.Scanner;

public class Exercise08_09 {
    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3];
        int row = -1;
        int column = -1;
        int count = 0;

        do {
            displayBoard(ticTacToe);

            if (count > 0) {
                while (!(ticTacToe[row][column] == 0)) {
                    row = -1;
                    column = -1;

                    row = getRow(ticTacToe, row, 'X');
                    column = getColumn(ticTacToe, row, column, 'X');
                    if (!(ticTacToe[row][column] == 0)) {
                        System.out.println("Invalid tile. There is already an " + ticTacToe[row][column] + " located there.");
                        System.out.println("Please try again.");
                    }
                    else {
                        ticTacToe[row][column] = 'X';
                        count++;
                        break;
                    }
                }
            }

            else {
                row = getRow(ticTacToe, row, 'X');
                column = getColumn(ticTacToe, row, column, 'X');

                ticTacToe[row][column] = 'X';
                count++;
            }
            System.out.println();

            if (isWin(ticTacToe)) {
                displayBoard(ticTacToe);
                System.out.println("X player won");
                System.out.print("Number of turns: " + count);
                break;
            }

            else if (isDraw(ticTacToe)) {
                displayBoard(ticTacToe);
                System.out.println("It is a draw");
                System.out.print("Number of turns: " + count);
                break;
            }

            displayBoard(ticTacToe);

            while (!(ticTacToe[row][column] == 0)) {
                row = -1;
                column = -1;

                row = getRow(ticTacToe, row, 'O');
                column = getColumn(ticTacToe, row, column, 'O');
                if (!(ticTacToe[row][column] == 0)) {
                    System.out.println("Invalid tile. There is already an " + ticTacToe[row][column] + " located there.");
                    System.out.println("Please try again.");
                }
                else {
                    ticTacToe[row][column] = 'O';
                    count++;
                    break;
                }
            }
            System.out.println();

            if (isWin(ticTacToe)) {
                displayBoard(ticTacToe);
                System.out.println("O player won");
                System.out.print("Number of turns: " + count);
                break;
            }

            else if (isDraw(ticTacToe)) {
                displayBoard(ticTacToe);
                System.out.println("It is a draw");
                System.out.print("Number of turns: " + count);
                break;
            }

        } while (true);
    }

    public static void displayBoard(char[][] ticTacToe) {
        System.out.println("-------------------");
        for (char[] tileRow : ticTacToe) {
            for (char tile : tileRow) {
                if (tile == 0) {
                    System.out.print("|     ");
                }
                else {
                    System.out.print("|  " + tile + "  ");
                }
            }
            System.out.println("|");
            System.out.println("-------------------");
        }
    }

    public static int getRow(char[][] ticTacToe, int row, char token) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row (0, 1, 2) for player " + token + ": ");

        while (!(row >= 0 && row < ticTacToe.length)) {
            row = input.nextInt();

            if (!(row >= 0 && row < ticTacToe.length)) {
                System.out.println("Invalid row. Must be between 0 and " + (ticTacToe.length - 1));
                System.out.print("Please try again: ");
            }
        }
        return row;
    }

    public static int getColumn(char[][] ticTacToe, int row, int column, char token) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a column (0, 1, 2) for player " + token + ": ");

        while (!(column >= 0 && column < ticTacToe[row].length)) {
            column = input.nextInt();

            if (!(column >= 0 && column < ticTacToe[row].length)) {
                System.out.println("Invalid column. Must be between 0 and " + (ticTacToe[row].length - 1));
                System.out.print("Please try again: ");
            }
        }
        return column;
    }

    public static boolean isWin(char[][] ticTacToe) {
        for (char[] row : ticTacToe) {
            if (row[0] != 0 && row[0] == row[1] && row[1] == row[2]) {
                return true;
            }
        }

        for (int i = 0; i < ticTacToe.length; i++) {
            if (ticTacToe[0][i] != 0 && ticTacToe[0][i] == ticTacToe[1][i]
                    && ticTacToe[1][i] == ticTacToe[2][i]) {
                return true;
            }
        }

        if (ticTacToe[1][1] != 0) {
            return (ticTacToe[0][0] == ticTacToe[1][1] && ticTacToe[1][1] == ticTacToe[2][2]) ||
                    (ticTacToe[0][2] == ticTacToe[1][1] && ticTacToe[1][1] == ticTacToe[2][0]);
        }
        return false;
    }

    public static boolean isDraw(char[][] ticTacToe) {
        for (char[] tileRow : ticTacToe) {
            for (char tile : tileRow) {
                if (tile == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
