public class Solution {

    static int count = 0; 
    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(char[][] board, int row, int col) {
        count++;
        if (row == 9) return true;

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow++;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudokuSolver(board, nextRow, nextCol)) return true;
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Row
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    if (row[val]) return false;
                    row[val] = true;
                }

                // Column
                if (board[j][i] != '.') {
                    int val = board[j][i] - '1';
                    if (col[val]) return false;
                    col[val] = true;
                }

                // 3x3 Box
                int boxRow = 3 * (i / 3) + j / 3;
                int boxCol = 3 * (i % 3) + j % 3;
                if (board[boxRow][boxCol] != '.') {
                    int val = board[boxRow][boxCol] - '1';
                    if (box[val]) return false;
                    box[val] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'.', '.', '8', '.', '.', '.', '.', '.', '.'},
            {'4', '9', '.', '1', '5', '7', '.', '.', '2'},
            {'.', '.', '3', '.', '.', '4', '1', '9', '.'},
            {'1', '8', '5', '.', '6', '.', '.', '2', '.'},
            {'.', '.', '.', '.', '2', '.', '.', '6', '.'},
            {'9', '6', '.', '4', '.', '5', '3', '.', '.'},
            {'.', '3', '.', '.', '7', '2', '.', '.', '4'},
            {'.', '4', '9', '.', '3', '.', '.', '5', '7'},
            {'8', '2', '7', '.', '.', '9', '.', '1', '3'}
        };
        boolean isValid = isValidSudoku(board);
        System.out.println("Is the board currently valid? " + isValid);

      
        if (isValid) {
            boolean solved = sudokuSolver(board, 0, 0);
            System.out.println("Is the Sudoku solvable? " + solved);
            if (solved) {
                printBoard(board);
                System.out.println("Total recursive calls: " + count);
            }
        }
    }
}
