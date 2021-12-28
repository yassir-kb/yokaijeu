package com.exemple.controller;


import com.exemple.model.*;

import java.io.File;
import java.util.List;

public class Jeux {
    private List<Joueur> players;
    private Score score;
    private Plateau plateau;
    //private AudioFileReader music;

    public void initPlateau(Plateau plateau) {
///Yokais : 16
        File file1 = new File("ressource/carte_rouge.pdf");
        File file1$ = new File("ressource/dos_carte.pdf");
        Yokai yokai1 = new Yokai("Kitsune", file1, file1$);
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

        File file9 = new File("ressource/carte_violette.pdf");
        Yokai yokai9 = new Yokai("Rokurokubi", file9);
        plateau.setYokai9(yokai9);

        File file10 = new File("ressource/carte_violette.pdf");
        Yokai yokai10 = new Yokai("Rokurokubi", file10);
        plateau.setYokai10(yokai10);

        File file11 = new File("ressource/carte_violette.pdf");
        Yokai yokai11 = new Yokai("Rokurokubi", file11);
        plateau.setYokai11(yokai11);

        File file12 = new File("ressource/carte_violette.pdf");
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
///Indices : 14
        File fille1 = new File("ressource/indice_bleu.pdf");
        Indice indice1 = new Indice("indice_bleu", fille1);
        plateau.setIndice1(indice1);

        File fille2 = new File("ressource/indice_bleu_rouge.pdf");
        Indice indice2 = new Indice("indice_bleu_rouge", fille2);
        plateau.setIndice2(indice2);

        File fille3 = new File("ressource/indice_bleu_vert_rouge.pdf");
        Indice indice3 = new Indice("indice_bleu_vert_rouge", fille3);
        plateau.setIndice3(indice3);

        File fille4 = new File("ressource/indice_bleu_vert_violet.pdf");
        Indice indice4 = new Indice("indice_bleu_vert_violet", fille4);
        plateau.setIndice4(indice4);

        File fille5 = new File("ressource/indice_bleu_violet.pdf");
        Indice indice5 = new Indice("indice_bleu_violet", fille5);
        plateau.setIndice5(indice5);

        File fille6 = new File("ressource/indice_bleu_violet_rouge.pdf");
        Indice indice6 = new Indice("indice_bleu_violet_rouge", fille6);
        plateau.setIndice6(indice6);

        File fille7 = new File("ressource/indice_rouge.pdf");
        Indice indice7 = new Indice("indice_rouge", fille7);
        plateau.setIndice7(indice7);

        File fille8 = new File("ressource/indice_rouge_violet.pdf");
        Indice indice8 = new Indice("indice_rouge_violet", fille8);
        plateau.setIndice8(indice8);

        File fille9 = new File("ressource/indice_vert_bleu.pdf");
        Indice indice9 = new Indice("indice_vert_bleu", fille9);
        plateau.setIndice9(indice9);

        File fille10 = new File("ressource/indice_vert_rouge.pdf");
        Indice indice10 = new Indice("indice_vert_rouge", fille10);
        plateau.setIndice10(indice10);

        File fille11 = new File("ressource/indice_vert_violet.pdf");
        Indice indice11 = new Indice("indice_vert_violet", fille11);
        plateau.setIndice11(indice11);

        File fille12 = new File("ressource/indice_vert_violet_rouge.pdf");
        Indice indice12 = new Indice("indice_vert_violet_rouge", fille12);
        plateau.setIndice12(indice12);

        File fille13 = new File("ressource/indice_verte.pdf");
        Indice indice13 = new Indice("indice_verte", fille13);
        plateau.setIndice13(indice13);

        File fille14 = new File("ressource/indice_violet.pdf");
        Indice indice14 = new Indice("indice_violet", fille14);
        plateau.setIndice14(indice14);
///Affinites : 6
        File filee1 = new File("ressource/affinite_1.pdf");
        Affinite affinite1 = new Affinite("affinite_1", filee1);
        plateau.setAffinite1(affinite1);

        File filee2 = new File("ressource/affinite_2.pdf");
        Affinite affinite2 = new Affinite("affinite_2", filee2);
        plateau.setAffinite2(affinite2);

        File filee3 = new File("ressource/affinite_3.pdf");
        Affinite affinite3 = new Affinite("affinite_3", filee3);
        plateau.setAffinite3(affinite3);

        File filee4 = new File("ressource/affinite_4.pdf");
        Affinite affinite4 = new Affinite("affinite_4", filee4);
        plateau.setAffinite4(affinite4);

        File filee5 = new File("ressource/affinite_5.pdf");
        Affinite affinite5 = new Affinite("affinite_5", filee5);
        plateau.setAffinite5(affinite5);

        File filee6 = new File("ressource/affinite_6.pdf");
        Affinite affinite6 = new Affinite("affinite_6", filee6);
        plateau.setAffinite6(affinite6);
///Placement : 3
        File fileee1 = new File("ressource/affinite_bleu_rouge.pdf");
        Placement placement1 = new Placement("affinite_bleu_rouge", fileee1);
        plateau.setPlacement1(placement1);

        File fileee2 = new File("ressource/affinite_rouge_violet.pdf");
        Placement placement2 = new Placement("affinite_rouge_violet", fileee2);
        plateau.setPlacement2(placement2);

        File fileee3 = new File("ressource/affinite_vert_violette.pdf");
        Placement placement3 = new Placement("affinite_vert_violette", fileee3);
        plateau.setPlacement3(placement3);
    }

    public boolean appeased(Plateau plateau) {
        return true;
    }

    public Indice tour(Plateau plateau, Yokai yokai1, Yokai yokai2, Yokai yokai3, Yokai yokai4) {
        Yokai yokai = new Yokai();
        yokai1.getFaceYokai();
        yokai2.getFaceYokai();
        yokai = yokai4;
        yokai4 = yokai3;
        yokai3 = yokai;
        return plateau.getIndice1();
    }

    public boolean gameOver(Plateau plateau) {
        plateau.getYokai1().getFaceYokai();
        plateau.getYokai2().getFaceYokai();
        plateau.getYokai3().getFaceYokai();
        plateau.getYokai4().getFaceYokai();
        plateau.getYokai5().getFaceYokai();
        plateau.getYokai6().getFaceYokai();
        plateau.getYokai7().getFaceYokai();
        plateau.getYokai8().getFaceYokai();
        plateau.getYokai9().getFaceYokai();
        plateau.getYokai10().getFaceYokai();
        plateau.getYokai11().getFaceYokai();
        plateau.getYokai12().getFaceYokai();
        plateau.getYokai13().getFaceYokai();
        plateau.getYokai14().getFaceYokai();
        plateau.getYokai15().getFaceYokai();
        plateau.getYokai16().getFaceYokai();
        appeased(plateau);
    }
}