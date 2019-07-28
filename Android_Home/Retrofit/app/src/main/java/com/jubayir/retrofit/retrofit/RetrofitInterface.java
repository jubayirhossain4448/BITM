package com.jubayir.retrofit.retrofit;

import com.jubayir.retrofit.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("posts")
    Call<User> getUser();
}
