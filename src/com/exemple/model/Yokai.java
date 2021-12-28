package com.exemple.model;

import java.io.File;

public class Yokai {
    private String yokaiName;
    private File faceYokai;
    private File dosYokai;

    public Yokai(String yokaiName, File faceYokai, File dosYokai) {
        this.yokaiName = yokaiName;
        this.faceYokai = faceYokai;
        this.dosYokai = dosYokai;
    }

    public Yokai() {
    }

    public String getYokaiName() {
        return yokaiName;
    }

    public void setYokaiName(String yokaiName) {
        this.yokaiName = yokaiName;
    }

    public File getFaceYokai() {
        return faceYokai;
    }

    public void setFaceYokai(File faceYokai) {
        this.faceYokai = faceYokai;
    }

    public File getDosYokai() {
        return dosYokai;
    }

    public void setDosYokai(File dosYokai) {
        this.dosYokai = dosYokai;
    }
}
