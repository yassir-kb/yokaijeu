import javax.swing.*;
import java.awt.*;

public class FamilyCard {
    //private Position position;
    public int px;
    public int py;
    public FamilyCardName type;

    //Instances pour l'interface graphique
    public ImageIcon imageCarte;
    private static final int TILE_SIZE = 50;


    public FamilyCard(FamilyCardName type) {
        this.type = type;
        this.imageCarte = getImageCarte();
    }
    /*
    public Position getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position.px = x;
        this.position.py = y;
    }
    */

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public ImageIcon getImageCarte() {
        switch (this.type) {
            case KITSUNE:
                this.imageCarte = resizeImage(new ImageIcon(getClass().getResource("assets/carte_rouge_jpg.jpg")));
                break;

            case KAPPA:
                this.imageCarte = resizeImage(new ImageIcon(getClass().getResource("assets/carte_verte_jpg.jpg")));
                break;

            case ROKUROKUBI:
                this.imageCarte = resizeImage(new ImageIcon(getClass().getResource("assets/carte_violette_jpg.jpg")));
                break;

            case ONI:
                this.imageCarte = resizeImage(new ImageIcon(getClass().getResource("assets/carte_bleue_jpg.jpg")));
                break;

            case NONE:
                this.imageCarte = resizeImage(new ImageIcon(getClass().getResource("assets/none.png")));
                break;
        }
        return this.imageCarte;
    }

    public void setImageCarte(ImageIcon imageCarte) {
        this.imageCarte = imageCarte;
    }

    public ImageIcon resizeImage(ImageIcon imageIcon) {
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(TILE_SIZE, TILE_SIZE, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(newImg);
        return imgIcon;
    }
}
