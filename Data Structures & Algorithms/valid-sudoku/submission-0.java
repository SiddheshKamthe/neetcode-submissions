class Solution {
    private boolean valid(char[][] board, int row, int col) {
        if(board[row][col] == '.') {
            return true;
        }

        //validate row
        for(int i=0; i<9; i++) {
            if(i != col && board[row][i] == board[row][col]) {
                return false;
            }
        }

        //validate column
        for(int i=0; i<9; i++) {
            if(i != row && board[i][col] == board[row][col]) {
                return false;
            }
        }

        //validate 3x3 window
        int stRow = row/3 * 3;
        int stCol = col/3 * 3;

        for(int i=stRow; i<stRow+3; i++) {
            for(int j=stCol; j<stCol+3; j++) {
                if(i != row && j != col && board[row][col] == board[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


    private boolean validateSudoku(char[][] board, int row, int col, boolean result) {
        if(result == false) {
            return false;
        }

        //check if column is out of bounds
        if(col >= 9) {
            col = col%9;
            row = row+1;
        }

        if(row >= 9) {
            return result;
        }

        if(valid(board, row, col)) {
            return validateSudoku(board, row, col+1, result);
        }
        return false;

    }

    public boolean isValidSudoku(char[][] board) {
        return validateSudoku(board, 0, 0, true);
    }
}
