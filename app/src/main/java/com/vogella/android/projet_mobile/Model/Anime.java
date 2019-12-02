package com.vogella.android.projet_mobile.Model;

public class Anime {
    private String id;
    private String type;
    private Attributes attributes;

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
}
