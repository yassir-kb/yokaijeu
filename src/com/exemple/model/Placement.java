package com.exemple.model;

public class Placement {
    private Type ouestNord;
    private Type nordEst;
    private Type estSud;
    private Type sudOuest;

    public Placement(Type ouestNord, Type nordEst, Type estSud, Type sudOuest) {
        this.ouestNord = ouestNord;
        this.nordEst = nordEst;
        this.estSud = estSud;
        this.sudOuest = sudOuest;
    }

    public Type getOuestNord() {
        return ouestNord;
    }

    public void setOuestNord(Type ouestNord) {
        this.ouestNord = ouestNord;
    }

    public Type getNordEst() {
        return nordEst;
    }

    public void setNordEst(Type nordEst) {
        this.nordEst = nordEst;
    }

    public Type getEstSud() {
        return estSud;
    }

    public void setEstSud(Type estSud) {
        this.estSud = estSud;
    }

    public Type getSudOuest() {
        return sudOuest;
    }

    public void setSudOuest(Type sudOuest) {
        this.sudOuest = sudOuest;
    }
}
