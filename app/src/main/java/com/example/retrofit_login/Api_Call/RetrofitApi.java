package com.example.retrofit_login.Api_Call;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {


    private static String BASE_URL = "https://sjqb.scibd.info/api/";
    private static RetrofitApi retrofitApi;
    private static Retrofit retrofit;

    private RetrofitApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                // .client(getClint(token))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitApi getInstance() {
        if (retrofitApi == null) {
            retrofitApi = new RetrofitApi();
        }
        return retrofitApi;
    }


    public Retrofit_Interface_API getService() {
        return retrofit.create(Retrofit_Interface_API.class);

    }


}

