package com.exemple.model;


import java.io.File;

public class Affinite {

    private String affiniteName;
    private File faceAffinite;

    public Affinite(String affiniteName, File faceAffinite) {
        this.affiniteName = affiniteName;
        this.faceAffinite = faceAffinite;
    }

    public String getAffiniteName() {
        return affiniteName;
    }

    public void setAffiniteName(String affiniteName) {
        this.affiniteName = affiniteName;
    }

    public File getFaceAffinite() {
        return faceAffinite;
    }

    public void setFaceAffinite(File faceAffinite) {
        this.faceAffinite = faceAffinite;
    }
}
