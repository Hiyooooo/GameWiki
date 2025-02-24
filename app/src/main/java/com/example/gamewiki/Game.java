package com.example.gamewiki;

public class Game {
    private String name;
    private int logoResId;
    private String shortDescription;
    private int imageResId;
    private String longDescription;

    public Game(String name, int logoResId, String shortDescription, int imageResId, String longDescription) {
        this.name = name;
        this.logoResId = logoResId;
        this.shortDescription = shortDescription;
        this.imageResId = imageResId;
        this.longDescription = longDescription;
    }

    public String getName() {
        return name;
    }

    public int getLogoResId() {
        return logoResId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getLongDescription() {
        return longDescription;
    }
}