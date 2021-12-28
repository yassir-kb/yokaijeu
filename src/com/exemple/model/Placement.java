package com.exemple.model;


import java.io.File;

public class Placement {
    private String placementName;
    private File facePlacement;

    public Placement(String placementName, File facePlacement) {
        this.placementName = placementName;
        this.facePlacement = facePlacement;
    }

    public String getPlacementName() {
        return placementName;
    }

    public void setPlacementName(String placementName) {
        this.placementName = placementName;
    }

    public File getFacePlacement() {
        return facePlacement;
    }

    public void setFacePlacement(File facePlacement) {
        this.facePlacement = facePlacement;
    }
}
