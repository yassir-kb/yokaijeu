package com.exemple.controller;


import com.exemple.model.Joueur;
import com.exemple.model.Plateau;
import com.exemple.model.Score;
import com.exemple.model.Yokai;

import java.io.File;
import java.util.List;

public class Jeux {
    private List<Joueur> players;
    private Score score;
    private Plateau plateau;
    //private AudioFileReader music;

    public Plateau initPlateau(Plateau plateau) {

        File file1 = new File("ressource/carte_rouge.pdf");
        Yokai yokai1 = new Yokai("Kitsune", file1);
        plateau.setYokai1(yokai1);

        File file2 = new File("ressource/carte_rouge.pdf");
        Yokai yokai2 = new Yokai("Kitsune", file2);
        plateau.setYokai2(yokai2);

        File file3 = new File("ressource/carte_rouge.pdf");
        Yokai yokai3 = new Yokai("Kitsune", file3);
        plateau.setYokai3(yokai3);

        File file4 = new File("ressource/carte_rouge.pdf");
        Yokai yokai4 = new Yokai("Kitsune", file4);
        plateau.setYokai4(yokai4);

        File file5 = new File("ressource/carte_verte.pdf");
        Yokai yokai5 = new Yokai("Kappa", file5);
        plateau.setYokai5(yokai5);

        File file6 = new File("ressource/carte_verte.pdf");
        Yokai yokai6 = new Yokai("Kappa", file6);
        plateau.setYokai6(yokai6);

        File file7 = new File("ressource/carte_verte.pdf");
        Yokai yokai7 = new Yokai("Kappa", file7);
        plateau.setYokai7(yokai7);

        File file8 = new File("ressource/carte_verte.pdf");
        Yokai yokai8 = new Yokai("Kappa", file8);
        plateau.setYokai8(yokai8);

        File file9 = new File("ressource/carte_mauve.pdf");
        Yokai yokai9 = new Yokai("Rokurokubi", file9);
        plateau.setYokai9(yokai9);

        File file10 = new File("ressource/carte_mauve.pdf");
        Yokai yokai10 = new Yokai("Rokurokubi", file10);
        plateau.setYokai10(yokai10);

        File file11 = new File("ressource/carte_mauve.pdf");
        Yokai yokai11 = new Yokai("Rokurokubi", file11);
        plateau.setYokai11(yokai11);

        File file12 = new File("ressource/carte_mauve.pdf");
        Yokai yokai12 = new Yokai("Rokurokubi", file12);
        plateau.setYokai12(yokai12);

        File file13 = new File("ressource/carte_bleue.pdf");
        Yokai yokai13 = new Yokai("Oni", file13);
        plateau.setYokai13(yokai13);

        File file14 = new File("ressource/carte_bleue.pdf");
        Yokai yokai14 = new Yokai("Oni", file14);
        plateau.setYokai14(yokai14);

        File file15 = new File("ressource/carte_bleue.pdf");
        Yokai yokai15 = new Yokai("Oni", file15);
        plateau.setYokai15(yokai15);

        File file16 = new File("ressource/carte_bleue.pdf");
        Yokai yokai16 = new Yokai("Oni", file16);
        plateau.setYokai16(yokai16);

        File filee1 = new File("ressource/affinite_1.");

        return plateau;
    }
}