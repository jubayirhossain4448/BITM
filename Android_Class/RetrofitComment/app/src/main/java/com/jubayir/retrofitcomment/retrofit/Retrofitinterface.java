package com.jubayir.retrofitcomment.retrofit;

import com.jubayir.retrofitcomment.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Retrofitinterface {
    @GET("comments")
    Call<List<User>> getData();
//    @FormUrlEncoded
//    @POST("posts")
//    Call<ResponseBody> insertData(
//            @Field("postId") int postId,
//            @Field("id") int id,
//            @Field("name") String name,
//            @Field("email") String email,
//            @Field("body") String body
//
//    );
}
