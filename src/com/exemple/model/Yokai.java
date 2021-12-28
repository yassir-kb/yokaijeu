package com.exemple.model;

import java.io.File;

public class Yokai {
    private String yokaiName;
    private File faceYokai;

    public Yokai(String yokaiName, File faceYokai) {
        this.yokaiName = yokaiName;
        this.faceYokai = faceYokai;
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
}
