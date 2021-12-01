package com.exemple.model;

public class Yokai {
    private Type type;
    private Boolean faceYokai; // true : visible / false : cache

    public Yokai(Type type, Boolean faceYokai) {
        this.type = type;
        this.faceYokai = faceYokai;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getFaceYokai() {
        return faceYokai;
    }

    public void setFaceYokai(Boolean faceYokai) {
        this.faceYokai = faceYokai;
    }
}
