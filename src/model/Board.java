package model;

import model.FamilyCard;
import model.FamilyCardName;

import java.util.ArrayList;
import java.util.Stack;

public class Board {

    //Instances des cartes du board
    private FamilyCard kit1 = new FamilyCard(FamilyCardName.KITSUNE);
    private FamilyCard kit2 = new FamilyCard(FamilyCardName.KITSUNE);
    private FamilyCard kit3 = new FamilyCard(FamilyCardName.KITSUNE);
    private FamilyCard kit4 = new FamilyCard(FamilyCardName.KITSUNE);
    private FamilyCard kap1 = new FamilyCard(FamilyCardName.KAPPA);
    private FamilyCard kap2 = new FamilyCard(FamilyCardName.KAPPA);
    private FamilyCard kap3 = new FamilyCard(FamilyCardName.KAPPA);
    private FamilyCard kap4 = new FamilyCard(FamilyCardName.KAPPA);
    private FamilyCard rok1 = new FamilyCard(FamilyCardName.ROKUROKUBI);
    private FamilyCard rok2 = new FamilyCard(FamilyCardName.ROKUROKUBI);
    private FamilyCard rok3 = new FamilyCard(FamilyCardName.ROKUROKUBI);
    private FamilyCard rok4 = new FamilyCard(FamilyCardName.ROKUROKUBI);
    private FamilyCard oni1 = new FamilyCard(FamilyCardName.ONI);
    private FamilyCard oni2 = new FamilyCard(FamilyCardName.ONI);
    private FamilyCard oni3 = new FamilyCard(FamilyCardName.ONI);
    private FamilyCard oni4 = new FamilyCard(FamilyCardName.ONI);

    private FamilyCard n1 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n2 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n3 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n4 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n5 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n6 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n7 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n8 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n9 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n10 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n11 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n12 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n13 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n14 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n15 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n16 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n17 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n18 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n19 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n20 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n21 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n27 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n28 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n29 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n30 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n31 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n32 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n33 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n34 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n35 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n36 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n37 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n38 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n39 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n40 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n41 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n42 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n43 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n44 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n45 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n46 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n47 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n48 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n49 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n50 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n51 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n52 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n53 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n54 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n56 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n57 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n58 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n59 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n60 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n61 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n62 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n63 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n64 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n65 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n67 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n68 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n69 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n70 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n71 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n72 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n73 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n74 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n75 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n76 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n77 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n78 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n79 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n80 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n81 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n82 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n83 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n84 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n85 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n86 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n87 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n88 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n89 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n90 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n91 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n92 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n93 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n94 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n95 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n96 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n97 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n98 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n99 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n100 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n101 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n102 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n103 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n104 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n105 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n106 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n107 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n108 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n109 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n110 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n111 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n112 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n113 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n114 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n115 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n116 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n117 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n118 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n119 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n120 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n121 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n122 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n123 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n124 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n125 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n126 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n127 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n128 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n129 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n130 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n131 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n132 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n133 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n134 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n135 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n136 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n137 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n138 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n139 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n140 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n141 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n142 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n143 = new FamilyCard(FamilyCardName.NONE);
    private FamilyCard n144 = new FamilyCard(FamilyCardName.NONE);

    //Instances des listes
    public FamilyCard[][] familyCards = new FamilyCard[12][12];
    private Stack<ClueCard> clueCards;
    private ArrayList<AffinityCard> affinityCards;

    //Liste à mélanger
    private ArrayList<FamilyCard> shuffleList = new ArrayList<>();

    //Liste de vide
    private ArrayList<FamilyCard> noneList = new ArrayList<>();

    public Board() {
        this.shuffle();
    }

    //Affecte toutes les instances de cartes à la liste à mélanger
    public void addAllElementsToShuffleList() {
        this.shuffleList.add(this.kit1);
        this.shuffleList.add(this.kit2);
        this.shuffleList.add(this.kit3);
        this.shuffleList.add(this.kit4);
        this.shuffleList.add(this.kap1);
        this.shuffleList.add(this.kap2);
        this.shuffleList.add(this.kap3);
        this.shuffleList.add(this.kap4);
        this.shuffleList.add(this.rok1);
        this.shuffleList.add(this.rok2);
        this.shuffleList.add(this.rok3);
        this.shuffleList.add(this.rok4);
        this.shuffleList.add(this.oni1);
        this.shuffleList.add(this.oni2);
        this.shuffleList.add(this.oni3);
        this.shuffleList.add(this.oni4);
    }

    //Mélange le board
    public void shuffle() {
        this.addAllElementsToShuffleList();
        int random;
        for (int k = 0; k < 12; k++) {
            for (int l = 0; l < 12; l++) {
                this.familyCards[k][l] = new FamilyCard(FamilyCardName.NONE);
                this.familyCards[k][l].setPx(k);
                this.familyCards[k][l].setPy(l);
            }
        }
        for (int i = 4; i < 8; i++) {
            for (int j = 4; j < 8; j++) {
                random = (int) (Math.random() * (this.shuffleList.size()));
                this.familyCards[i][j] = this.shuffleList.get(random);
                this.shuffleList.remove(random);
                this.familyCards[i][j].setPx(i);
                this.familyCards[i][j].setPy(j);
            }
        }
    }
}
