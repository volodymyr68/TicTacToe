package Executer;
import java.util.Scanner;
import Board.GameBoard;
import Logic.BorderFilling;
import Logic.ResultChecker;
import Logic.ResultCheckerInterface;
public class Executor {
    public void Game(){
        GameBoard board = new GameBoard();
        BorderFilling logic = new BorderFilling();
        Scanner input = new Scanner(System.in);
        char[][] gameBoard = board.getBoard();
        int position;
        char symbol = 'X';
        boolean result = false;
        board.printBoard(gameBoard);
        while (!result) {
            System.out.println("Player " + symbol + " turn");
            System.out.println("Enter position: ");
            position = input.nextInt();
            if (position > 0 && position < 10) {
                if (gameBoard[(position - 1) / 3 * 2][(position - 1) % 3 * 2] == ' ') {
                    gameBoard = logic.fillBoard(gameBoard, position, symbol);
                    board.printBoard(gameBoard);
                    ResultCheckerInterface resultChecker = new ResultChecker();
                    char resultCheck = resultChecker.checkResult(gameBoard);
                    if (resultCheck == 'X') {
                        System.out.println("Player X won!");
                        result = true;
                    } else if (resultCheck == 'O') {
                        System.out.println("Player O won!");
                        result = true;
                    } else if (resultCheck == 'D') {
                        System.out.println("Draw!");
                        result = true;
                    }
                    if (symbol == 'X') {
                        symbol = 'O';
                    } else {
                        symbol = 'X';
                    }
                } else {
                    System.out.println("Position is not empty!");
                }
            } else {
                System.out.println("Invalid position!");
            }
        }
    }
}
