package com.dee.hamrobazzar.Api;

import com.dee.hamrobazzar.Model.User;
import com.dee.hamrobazzar.ServerResponse.ImageResponse;
import com.dee.hamrobazzar.ServerResponse.RegisterResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UsersAPI {

    @POST("users/register")
    Call<RegisterResponse> registerUser(@Body User users);

@FormUrlEncoded
    @POST("users/login")
Call<RegisterResponse> checkUser(@Field("email") String username, @Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

}
