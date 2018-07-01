package com.kreatorku.kreatorku_mobile.ApiUtils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Oktaviano on 01/07/2018.
 */

public interface BaseApiService {
    //memanggil API https://api.kreatorku.com/v1/auth/login
    @FormUrlEncoded
    @POST("auth/login")
    Call<ResponseBody> loginRequest(@Field("username") String username, @Field("password") String password);

    //memanggil API https://api.kreatorku.com/v1/auth/register
    @FormUrlEncoded
    @POST("auth/register")
    Call<ResponseBody> registerRequest(@Field("username") String username, @Field("email") String email, @Field("password") String password);
}
