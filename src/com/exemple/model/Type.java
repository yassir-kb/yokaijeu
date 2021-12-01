package com.exemple.model;

import javax.swing.*;

public class Type {
    private String typeName;
    private ImageIcon image;

    public Type(String typeName, ImageIcon image) {
        this.typeName = typeName;
        this.image = image;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
