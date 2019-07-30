package com.jubayir.retrofitcomments.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("comments")
    Call<List<User>> getData();
}
