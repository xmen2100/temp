public class Exercise07_36 {
    public static void main(String[] args) {
        char[][] chessBoard = new char[8][8];

        for (int i = 0; i < 8; i++) {
            int j = (int)(Math.random() * 8);

            while (chessBoard[i][j] == 'X') {
                j = (int)(Math.random() * 8);
                if (chessBoard[i][j] != 'X') {
                    break;
                }
            }
            chessBoard[i][j] = 'Q';

            removeColumnTiles(chessBoard, i, j);
            removeBotRightTiles(chessBoard, i, j);
            removeBotLeftTiles(chessBoard, i, j);
        }
        displayBoard(chessBoard);
    }

    public static void removeColumnTiles(char[][] chessBoard, int i, int j) {
        for (i += 1; i < 8; i++) {
            chessBoard[i][j] = 'X';
        }
    }

    public static void removeBotRightTiles(char[][] chessBoard, int i, int j) {
        for (i += 1, j += 1; i < 8 && j < 8; i++, j++) {
            chessBoard[i][j] = 'X';
        }
    }

    public static void removeBotLeftTiles(char[][] chessBoard, int i, int j) {
        for (i += 1, j -= 1; i < 8 && j >= 0; i++, j--) {
            chessBoard[i][j] = 'X';
        }
    }

    public static void displayBoard(char[][] chessBoard) {
        for (char[] row: chessBoard) {
            System.out.print("|");
            for (char col : row) {
                if (col == 'Q') {
                    System.out.print("Q|");
                }
                else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }
}