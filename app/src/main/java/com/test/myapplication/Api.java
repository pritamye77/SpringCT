
package com.test.myapplication;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "http://5d80a75f99f8a20014cf9661.mockapi.io/api/login";



    @GET("get_all_users_details")
    Call<String> getAllUserDetail();



}
