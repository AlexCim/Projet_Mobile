package com.vogella.android.projet_mobile.Model;

public class Attributes {
    private String canonicalTitle;
    private String startDate;
    private String synopsis;
    private PosterImage posterImage;

    public PosterImage getPosterImage() {
        return posterImage;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getCanonicalTitle() {
        return canonicalTitle;
    }

    public String getStartDate() {
        return startDate;
    }
}
