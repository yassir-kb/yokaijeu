package com.exemple.model;

public class Indice {
    private Type type;
    private int numberOfColor;
    private Boolean faceIndice;

    public Indice(Type type, int numberOfColor, boolean faceIndice) {
        this.type = type;
        this.numberOfColor = numberOfColor;
        this.faceIndice = faceIndice;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumberOfColor() {
        return numberOfColor;
    }

    public void setNumberOfColor(int numberOfColor) {
        this.numberOfColor = numberOfColor;
    }

    public boolean isFaceIndice() {
        return faceIndice;
    }

    public void setFaceIndice(Boolean faceIndice) {
        this.faceIndice = faceIndice;
    }
}
