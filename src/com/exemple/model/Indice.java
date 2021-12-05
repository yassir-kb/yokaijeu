package com.exemple.model;

import javax.swing.*;

public class Indice {
    private String indiceName ;
    private ImageIcon faceIndice ;

    public Indice(String indiceName, ImageIcon faceIndice) {
        this.indiceName = indiceName;
        this.faceIndice = faceIndice;
    }

    public String getIndiceName() {
        return indiceName;
    }

    public void setIndiceName(String indiceName) {
        this.indiceName = indiceName;
    }

    public ImageIcon getFaceIndice() {
        return faceIndice;
    }

    public void setFaceIndice(ImageIcon faceIndice) {
        this.faceIndice = faceIndice;
    }
}
