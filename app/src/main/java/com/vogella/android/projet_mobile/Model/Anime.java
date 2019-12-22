package com.vogella.android.projet_mobile.Model;

public class Anime {
    private String id;
    private String type;
    private int Image;
    private Attributes attributes;

    public Anime(String title, int image) {
        Image = image;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
