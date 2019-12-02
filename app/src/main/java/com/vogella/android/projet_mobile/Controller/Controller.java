package com.vogella.android.projet_mobile.Controller;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vogella.android.projet_mobile.Model.Anime;
import com.vogella.android.projet_mobile.View.MainActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {
    private MainActivity activity;
    static final String BASE_URL = "https://kitsu.io/api/edge/";

    public Controller(MainActivity mainActivity, Context context) {
        this.activity = mainActivity;
    }

    public void start() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GerritAPI gerritAPI = retrofit.create(GerritAPI.class);

        Call<RestApiResponse> call = gerritAPI.getListAnime();
        call.enqueue(new Callback<RestApiResponse>() {


            @Override
            public void onResponse(Call<RestApiResponse> call, Response<RestApiResponse> response){
                RestApiResponse restApiResponse = response.body();
                List<Anime> listAnime = restApiResponse.getData();
                activity.showList(listAnime);

            }


            @Override
            public void onFailure(Call<RestApiResponse> call, Throwable throwable) {
                Log.d("ERROR", "Api Error");
            }

        });
    }
}
