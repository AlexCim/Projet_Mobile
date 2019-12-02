package com.vogella.android.projet_mobile.Controller;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GerritAPI {
    @GET("anime")
    Call<RestApiResponse> getListAnime();
}
