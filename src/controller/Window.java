package controller;

import model.Board;
import model.FamilyCardName;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {

    private ImageIcon imgCardBack = resizeImage(new ImageIcon(getClass().getResource("view/dos_carte_jpg.jpg")));
    private ImageIcon imgCardNone = resizeImage(new ImageIcon(getClass().getResource("view/none.png")));

    private static final int N = 12;
    private static final int TILE_SIZE = 50;
    private final List<JLabel> labelList = new ArrayList<JLabel>();

    private Board board = new Board();

    public Window() {

        //JFrame
        this.setTitle("Jeu Yokai");
        this.setSize(1080, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);

        //Create the initial tilemap with cards
        this.createTileMapOfLabel();

        //Visibility
        this.setVisible(true);
    }

    public ImageIcon resizeImage(ImageIcon imageIcon) {
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(TILE_SIZE, TILE_SIZE, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(newImg);
        return imgIcon;
    }

    private JLabel getLabelWithCoord(int r, int c) {
        int index = r * N + c;
        return labelList.get(index);
    }

    private JLabel createLabelTile(final int row, final int col) {
        //final JButton b = new JButton("r" + row + ",c" + col);
        JLabel label;
        if(board.familyCards[row][col].type == FamilyCardName.NONE){
            label = new JLabel(this.imgCardNone);
            label.setMaximumSize(label.getSize());
            label.setLocation(300 + row * TILE_SIZE, 50 + col * TILE_SIZE);
            label.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Clicked!"+ label.getLocation() + " row = " +row +" column = "+col);
                }
            });
        } else {
            label = new JLabel(this.imgCardBack);
            label.setSize(TILE_SIZE, TILE_SIZE);
            label.setMaximumSize(label.getSize());
            label.setLocation(300 + row * TILE_SIZE, 50 + col * TILE_SIZE);
            label.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    //System.out.println("Clicked!"+ label.getLocation() + " row = " +row +" column = "+col);
                    label.setIcon(board.familyCards[row][col].imageCarte);
                }
            });
        }
        return label;
    }

    public void createTileMapOfLabel() {
        for (int i = 0; i < N * N; i++) {
            int row = i / N;
            int col = i % N;
            JLabel jl = createLabelTile(row, col);
            labelList.add(jl);
            this.add(jl);
        }
    }

    public void initialisation() {
        for (int i = 0; i < this.board.familyCards.length; i++) {
            for (int j = 0; j < this.board.familyCards.length; j++) {
                //this.window.addImage(this.board.familyCards[i][j].getImageCarte()); // this.board.familyCards[i][j].imageCarte
            }
        }
    }
}


