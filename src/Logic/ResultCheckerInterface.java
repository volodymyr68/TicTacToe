package Logic;

public interface ResultCheckerInterface {
    abstract char checkResult(char[][] board);
    abstract char checkRows(char[][] board);
    abstract char checkColumns(char[][] board);
    abstract char checkDiagonals(char[][] board);
    abstract char checkDraw(char[][] board);
}
