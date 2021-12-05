package com.exemple.model;

import javax.swing.*;

public class Yokai {
    private  String yokaiName ;
    private ImageIcon faceYokai ;

    public Yokai(String yokaiName, ImageIcon faceYokai) {
        this.yokaiName = yokaiName;
        this.faceYokai = faceYokai;
    }

    public String getYokaiName() {
        return yokaiName;
    }

    public void setYokaiName(String yokaiName) {
        this.yokaiName = yokaiName;
    }

    public ImageIcon getFaceYokai() {
        return faceYokai;
    }

    public void setFaceYokai(ImageIcon faceYokai) {
        this.faceYokai = faceYokai;
    }
}
