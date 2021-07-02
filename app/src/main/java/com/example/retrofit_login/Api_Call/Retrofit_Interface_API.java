package com.example.retrofit_login.Api_Call;

import com.example.retrofit_login.Model.LoginRequest;
import com.example.retrofit_login.Model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Retrofit_Interface_API {

    @POST
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
