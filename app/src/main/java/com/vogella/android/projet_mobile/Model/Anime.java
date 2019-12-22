package com.vogella.android.projet_mobile.Model;

import android.media.Image;

public class Anime {
    private String id;
    private String type;
    private String Image;
    private Attributes attributes;

    public Anime(String title, String image) {
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}