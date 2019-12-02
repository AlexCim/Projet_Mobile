package com.vogella.android.projet_mobile.Controller;

import com.vogella.android.projet_mobile.Model.Anime;

import java.util.List;

public class RestApiResponse {
    private List<Anime> data;

    public List<Anime> getData() {
        return data;
    }

    public void setData(List<Anime> results) {
        this.data = results;
    }

}
