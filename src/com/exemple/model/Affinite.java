package com.exemple.model;

import javax.swing.*;

public class Affinite {

    private String affiniteName ;
   private ImageIcon faceAffinite ;

    public Affinite(String affiniteName, ImageIcon faceAffinite) {
        this.affiniteName = affiniteName;
        this.faceAffinite = faceAffinite;
    }

    public String getAffiniteName() {
        return affiniteName;
    }

    public void setAffiniteName(String affiniteName) {
        this.affiniteName = affiniteName;
    }

    public ImageIcon getFaceAffinite() {
        return faceAffinite;
    }

    public void setFaceAffinite(ImageIcon faceAffinite) {
        this.faceAffinite = faceAffinite;
    }
}
