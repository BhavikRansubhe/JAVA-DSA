package Recursion;

public class nQueen {
    private static final int N = 4; // You can change N to the desired board size

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        solveNQueens(board, 0);
    }

    private static void solveNQueens(int[][] board, int row) {
        if (row == N) {
            printSolution(board);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place the queen

                solveNQueens(board, row + 1); // Recur for the next row

                board[row][col] = 0; // Backtrack
            }
        }
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        // Check left side of the current row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
