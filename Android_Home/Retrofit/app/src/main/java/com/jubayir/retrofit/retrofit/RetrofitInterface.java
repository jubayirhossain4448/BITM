package com.jubayir.retrofit.retrofit;

import com.jubayir.retrofit.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("posts")
    Call<List<User>> getUser();
}
