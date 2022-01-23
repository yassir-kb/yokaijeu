import controller.Window;
import model.Board;
import model.Player;

import java.util.Scanner;

public class Game {

    private Player player;
    private Window window = new Window();
    private int scoreCount;
    private boolean isPlaying = false;

    //for generatePlayer() method
    private int numberOfPlayer;


    public void scanNumberOfPlayer() {
        Scanner scanner = new Scanner(System.in);
        this.numberOfPlayer = scanner.nextInt();
    }

    public void defineNumberOfPlayer() {
        this.scanNumberOfPlayer();
        switch (this.numberOfPlayer) {
            case 1:
                // TODO to implement later
                break;

            case 2:
                // TODO to implement later
                break;

            case 3:
                // TODO to implement later
                break;

            case 4:
                // TODO to implement later
                break;

            default:
                System.out.println("Please choose a valid number of player.");
                break;
        }
    }

    public void start() {
        this.isPlaying = true;
        //this.initialisation();
    }

    public void cardToReturn() {
        // TODO find mouse position to complete the method
    }

    //Move cards
    public void cardToMove(final Board board, final int row1, final int col1, final int row2, final int col2) {
        board.familyCards[row1][col1] = board.familyCards[row2][col2];
    }

    public boolean compareCards(final Board board, final int row1, final int col1, final int row2, final int col2) {
        if (board.familyCards[row1][col1].type.equals(board.familyCards[row2][col2].type)) {
            return true;
        } else {
            return false;
        }
    }
}
