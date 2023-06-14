package com.example.apilatih.retrofit;

import com.example.apilatih.model.Chapters;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndpoint {
    @GET("chapters/?language=id")
    Call<Chapters> getSurah();
}
