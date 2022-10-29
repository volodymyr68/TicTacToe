package Logic;

public class ResultChecker implements ResultCheckerInterface{
    @Override
    public char checkResult(char[][] board) {
        char result = ' ';
        if (checkRows(board) != ' ') {
            result = checkRows(board);
        } else if (checkColumns(board) != ' ') {
            result = checkColumns(board);
        } else if (checkDiagonals(board) != ' ') {
            result = checkDiagonals(board);
        } else if (checkDraw(board) != ' ') {
            result = checkDraw(board);
        }
        return result;
    }

    @Override
    public char checkRows(char[][] board) {
        for (int i = 0; i < 5; i += 2) {
            if (board[i][0] == board[i][2] && board[i][2] == board[i][4] && board[i][0] != ' ') {
                if (board[i][0] == 'X') {
                    return 'X';
                } else {
                    return 'O';
                }
            }
        }
        return 'N';
    }

    @Override
    public char checkColumns(char[][] board) {
        for (int i = 0; i < 5; i += 2) {
            if (board[0][i] == board[2][i] && board[2][i] == board[4][i] && board[0][i] != ' ') {
                if (board[0][i] == 'X') {
                    return 'X';
                } else {
                    return 'O';
                }
            }
        }
        return 'N';
    }

    @Override
    public char checkDiagonals(char[][] board) {

        if (board[0][0] == board[2][2] && board[2][2] == board[4][4] && board[0][0] != ' '
                || board[0][4] == board[2][2] && board[2][2] == board[4][0] && board[0][4] != ' '){
            if (board[2][2] == 'X') {
                return 'X';
            } else {
                return 'O';
            }
        }
        return 'N';

    }

    @Override
    public char checkDraw(char[][] board) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == ' ') {
                    return 'N';
                }
            }
        }
        return 'D';
    }
}
