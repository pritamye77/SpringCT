package com.test.myapplication;

import retrofit2.Retrofit;


;

public class ApiClient {
    private static Retrofit retrofit = null;


    public static Retrofit getApiClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .build();
        return retrofit;
    }



}
