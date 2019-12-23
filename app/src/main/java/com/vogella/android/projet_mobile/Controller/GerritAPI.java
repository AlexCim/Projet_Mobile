package com.vogella.android.projet_mobile.Controller;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GerritAPI {
    @GET("anime?page%5Blimit%5D=20&page%5Boffset%5D=0")
    Call<RestApiResponse> getListAnime();

    @GET("anime")
    Call<RestApiResponse> getListAnime2();
}
