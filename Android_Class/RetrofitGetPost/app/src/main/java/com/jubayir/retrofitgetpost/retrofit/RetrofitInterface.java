package com.jubayir.retrofitgetpost.retrofit;

import com.jubayir.retrofitgetpost.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("posts")
    Call<User> getUser();

}
