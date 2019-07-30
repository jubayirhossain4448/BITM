package com.jubayir.retrofitcomments.retrofit;

import com.jubayir.retrofitcomments.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RetrofitInterface {
    @GET("comments")
    Call<List<User>> getData(

    );
    @FormUrlEncoded
    @POST("posts")
    Call<ResponseBody> insertData(
            @Field("postId") int postId,
            @Field("id") int id,
            @Field("name") String name,
            @Field("email") String email,
            @Field("body") String body

    );
}
