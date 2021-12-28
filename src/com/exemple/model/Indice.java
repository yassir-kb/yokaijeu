package com.exemple.model;


import java.io.File;

public class Indice {
    private String indiceName;
    private File faceIndice;

    public Indice(String indiceName, File faceIndice) {
        this.indiceName = indiceName;
        this.faceIndice = faceIndice;
    }

    public String getIndiceName() {
        return indiceName;
    }

    public void setIndiceName(String indiceName) {
        this.indiceName = indiceName;
    }

    public File getFaceIndice() {
        return faceIndice;
    }

    public void setFaceIndice(File faceIndice) {
        this.faceIndice = faceIndice;
    }
}
