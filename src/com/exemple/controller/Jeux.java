package com.exemple.controller;


import com.exemple.model.Joueur;
import com.exemple.model.Plateau;
import com.exemple.model.Score;
import com.exemple.model.Yokai;

import java.awt.*;
import java.io.File;
import java.util.List;

public class Jeux {
    private List<Joueur> players;
    private Score score;
    private Plateau plateau;
    //private AudioFileReader music;

    public Plateau initPlateau(Plateau plateau) {

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file2 = new File("ressource/carte_rouge.pdf");
        Yokai yokai2 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai2(yokai2);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune Renards", file1);
        plateau.setYokai1(yokai1);

        return plateau;
    }
}