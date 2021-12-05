package com.exemple.model;

import javax.swing.*;

public class Placement {
    private String placementName ;
    private ImageIcon facePlacement ;

    public Placement(String placementName, ImageIcon facePlacement) {
        this.placementName = placementName;
        this.facePlacement = facePlacement;
    }

    public String getPlacementName() {
        return placementName;
    }

    public void setPlacementName(String placementName) {
        this.placementName = placementName;
    }

    public ImageIcon getFacePlacement() {
        return facePlacement;
    }

    public void setFacePlacement(ImageIcon facePlacement) {
        this.facePlacement = facePlacement;
    }
}
