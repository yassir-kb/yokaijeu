package com.exemple.model;

public class Plateau {
    private Yokai yokai1;
    private Yokai yokai2;
    private Yokai yokai3;
    private Yokai yokai4;
    private Yokai yokai5;
    private Yokai yokai6;
    private Yokai yokai7;
    private Yokai yokai8;
    private Yokai yokai9;
    private Yokai yokai10;
    private Yokai yokai11;
    private Yokai yokai12;
    private Yokai yokai13;
    private Yokai yokai14;
    private Yokai yokai15;
    private Yokai yokai16;

    private Indice indice1;
    private Indice indice2;
    private Indice indice3;
    private Indice indice4;
    private Indice indice5;
    private Indice indice6;
    private Indice indice7;
    private Indice indice8;
    private Indice indice9;
    private Indice indice10;
    private Indice indice11;
    private Indice indice12;
    private Indice indice13;
    private Indice indice14;

    private Affinite affinite1;
    private Affinite affinite2;
    private Affinite affinite3;
    private Affinite affinite4;
    private Affinite affinite5;
    private Affinite affinite6;

    private Placement placement1;
    private Placement placement2;
    private Placement placement3;

    public Plateau(Yokai yokai1, Yokai yokai2, Yokai yokai3, Yokai yokai4, Yokai yokai5, Yokai yokai6, Yokai yokai7, Yokai yokai8, Yokai yokai9, Yokai yokai10, Yokai yokai11, Yokai yokai12, Yokai yokai13, Yokai yokai14, Yokai yokai15, Yokai yokai16) {
        this.yokai1 = yokai1;
        this.yokai2 = yokai2;
        this.yokai3 = yokai3;
        this.yokai4 = yokai4;
        this.yokai5 = yokai5;
        this.yokai6 = yokai6;
        this.yokai7 = yokai7;
        this.yokai8 = yokai8;
        this.yokai9 = yokai9;
        this.yokai10 = yokai10;
        this.yokai11 = yokai11;
        this.yokai12 = yokai12;
        this.yokai13 = yokai13;
        this.yokai14 = yokai14;
        this.yokai15 = yokai15;
        this.yokai16 = yokai16;
    }

    public Plateau(Yokai yokai1, Indice indice1, Indice indice2, Indice indice3, Indice indice4, Indice indice5, Indice indice6, Indice indice7, Indice indice8, Indice indice9, Indice indice10, Indice indice11, Indice indice12, Indice indice13, Indice indice14) {
        this.yokai1 = yokai1;
        this.indice1 = indice1;
        this.indice2 = indice2;
        this.indice3 = indice3;
        this.indice4 = indice4;
        this.indice5 = indice5;
        this.indice6 = indice6;
        this.indice7 = indice7;
        this.indice8 = indice8;
        this.indice9 = indice9;
        this.indice10 = indice10;
        this.indice11 = indice11;
        this.indice12 = indice12;
        this.indice13 = indice13;
        this.indice14 = indice14;
    }

    public Plateau(Affinite affinite1, Affinite affinite2, Affinite affinite3, Affinite affinite4, Affinite affinite5, Affinite affinite6) {
        this.affinite1 = affinite1;
        this.affinite2 = affinite2;
        this.affinite3 = affinite3;
        this.affinite4 = affinite4;
        this.affinite5 = affinite5;
        this.affinite6 = affinite6;
    }

    public Plateau(Yokai yokai1, Placement placement1, Placement placement2, Placement placement3) {
        this.yokai1 = yokai1;
        this.placement1 = placement1;
        this.placement2 = placement2;
        this.placement3 = placement3;
    }

    public Yokai getYokai1() {
        return yokai1;
    }

    public void setYokai1(Yokai yokai1) {
        this.yokai1 = yokai1;
    }

    public Yokai getYokai2() {
        return yokai2;
    }

    public void setYokai2(Yokai yokai2) {
        this.yokai2 = yokai2;
    }

    public Yokai getYokai3() {
        return yokai3;
    }

    public void setYokai3(Yokai yokai3) {
        this.yokai3 = yokai3;
    }

    public Yokai getYokai4() {
        return yokai4;
    }

    public void setYokai4(Yokai yokai4) {
        this.yokai4 = yokai4;
    }

    public Yokai getYokai5() {
        return yokai5;
    }

    public void setYokai5(Yokai yokai5) {
        this.yokai5 = yokai5;
    }

    public Yokai getYokai6() {
        return yokai6;
    }

    public void setYokai6(Yokai yokai6) {
        this.yokai6 = yokai6;
    }

    public Yokai getYokai7() {
        return yokai7;
    }

    public void setYokai7(Yokai yokai7) {
        this.yokai7 = yokai7;
    }

    public Yokai getYokai8() {
        return yokai8;
    }

    public void setYokai8(Yokai yokai8) {
        this.yokai8 = yokai8;
    }

    public Yokai getYokai9() {
        return yokai9;
    }

    public void setYokai9(Yokai yokai9) {
        this.yokai9 = yokai9;
    }

    public Yokai getYokai10() {
        return yokai10;
    }

    public void setYokai10(Yokai yokai10) {
        this.yokai10 = yokai10;
    }

    public Yokai getYokai11() {
        return yokai11;
    }

    public void setYokai11(Yokai yokai11) {
        this.yokai11 = yokai11;
    }

    public Yokai getYokai12() {
        return yokai12;
    }

    public void setYokai12(Yokai yokai12) {
        this.yokai12 = yokai12;
    }

    public Yokai getYokai13() {
        return yokai13;
    }

    public void setYokai13(Yokai yokai13) {
        this.yokai13 = yokai13;
    }

    public Yokai getYokai14() {
        return yokai14;
    }

    public void setYokai14(Yokai yokai14) {
        this.yokai14 = yokai14;
    }

    public Yokai getYokai15() {
        return yokai15;
    }

    public void setYokai15(Yokai yokai15) {
        this.yokai15 = yokai15;
    }

    public Yokai getYokai16() {
        return yokai16;
    }

    public void setYokai16(Yokai yokai16) {
        this.yokai16 = yokai16;
    }

    public Indice getIndice1() {
        return indice1;
    }

    public void setIndice1(Indice indice1) {
        this.indice1 = indice1;
    }

    public Indice getIndice2() {
        return indice2;
    }

    public void setIndice2(Indice indice2) {
        this.indice2 = indice2;
    }

    public Indice getIndice3() {
        return indice3;
    }

    public void setIndice3(Indice indice3) {
        this.indice3 = indice3;
    }

    public Indice getIndice4() {
        return indice4;
    }

    public void setIndice4(Indice indice4) {
        this.indice4 = indice4;
    }

    public Indice getIndice5() {
        return indice5;
    }

    public void setIndice5(Indice indice5) {
        this.indice5 = indice5;
    }

    public Indice getIndice6() {
        return indice6;
    }

    public void setIndice6(Indice indice6) {
        this.indice6 = indice6;
    }

    public Indice getIndice7() {
        return indice7;
    }

    public void setIndice7(Indice indice7) {
        this.indice7 = indice7;
    }

    public Indice getIndice8() {
        return indice8;
    }

    public void setIndice8(Indice indice8) {
        this.indice8 = indice8;
    }

    public Indice getIndice9() {
        return indice9;
    }

    public void setIndice9(Indice indice9) {
        this.indice9 = indice9;
    }

    public Indice getIndice10() {
        return indice10;
    }

    public void setIndice10(Indice indice10) {
        this.indice10 = indice10;
    }

    public Indice getIndice11() {
        return indice11;
    }

    public void setIndice11(Indice indice11) {
        this.indice11 = indice11;
    }

    public Indice getIndice12() {
        return indice12;
    }

    public void setIndice12(Indice indice12) {
        this.indice12 = indice12;
    }

    public Indice getIndice13() {
        return indice13;
    }

    public void setIndice13(Indice indice13) {
        this.indice13 = indice13;
    }

    public Indice getIndice14() {
        return indice14;
    }

    public void setIndice14(Indice indice14) {
        this.indice14 = indice14;
    }

    public Affinite getAffinite1() {
        return affinite1;
    }

    public void setAffinite1(Affinite affinite1) {
        this.affinite1 = affinite1;
    }

    public Affinite getAffinite2() {
        return affinite2;
    }

    public void setAffinite2(Affinite affinite2) {
        this.affinite2 = affinite2;
    }

    public Affinite getAffinite3() {
        return affinite3;
    }

    public void setAffinite3(Affinite affinite3) {
        this.affinite3 = affinite3;
    }

    public Affinite getAffinite4() {
        return affinite4;
    }

    public void setAffinite4(Affinite affinite4) {
        this.affinite4 = affinite4;
    }

    public Affinite getAffinite5() {
        return affinite5;
    }

    public void setAffinite5(Affinite affinite5) {
        this.affinite5 = affinite5;
    }

    public Affinite getAffinite6() {
        return affinite6;
    }

    public void setAffinite6(Affinite affinite6) {
        this.affinite6 = affinite6;
    }

    public Placement getPlacement1() {
        return placement1;
    }

    public void setPlacement1(Placement placement1) {
        this.placement1 = placement1;
    }

    public Placement getPlacement2() {
        return placement2;
    }

    public void setPlacement2(Placement placement2) {
        this.placement2 = placement2;
    }

    public Placement getPlacement3() {
        return placement3;
    }

    public void setPlacement3(Placement placement3) {
        this.placement3 = placement3;
    }
}
