import java.io.IOException;
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

    public void cardToMove() {
        // TODO find the card to move
    }

    public void compareCards() {
        // TODO complete method
    }
}
